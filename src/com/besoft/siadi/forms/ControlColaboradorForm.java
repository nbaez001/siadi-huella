/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.forms;

import com.besoft.siadi.entity.Asistencia;
import com.besoft.siadi.entity.Colaborador;
import com.besoft.siadi.entity.Contrato;
import com.besoft.siadi.entity.Tablamaestra;
import com.besoft.siadi.entity.Turno;
import com.besoft.siadi.entity.Usuario;
import com.besoft.siadi.forms.util.Autocomplete;
import com.besoft.siadi.service.AsistenciaService;
import com.besoft.siadi.service.ColaboradorService;
import com.besoft.siadi.service.ContratoService;
import com.besoft.siadi.service.TablamaestraService;
import com.besoft.siadi.service.TurnoService;
import com.besoft.siadi.util.ConectionUtil;
import com.besoft.siadi.util.Injector;
import com.besoft.siadi.util.SessionUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPErrorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPErrorEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NERIO
 */
public class ControlColaboradorForm extends javax.swing.JFrame {

    private DPFPCapture Lector = DPFPGlobal.getCaptureFactory().createCapture();
    private DPFPEnrollment Reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();
    private DPFPVerification Verificador = DPFPGlobal.getVerificationFactory().createVerification();
    private DPFPTemplate template;
    public static String TEMPLATE_PROPERTY = "template";

    ColaboradorService colaboradorService;
    ContratoService contratoService;
    TurnoService turnoService;
    AsistenciaService asistenciaService;
    TablamaestraService tablamaestraService;
    ConectionUtil cu;

    Contrato con;
    Tablamaestra tm;
    Date horaIngreso;
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

    List<Tablamaestra> lta;
//    private static final String COMMIT_ACTION = "commit";
//    List keywords = new ArrayList<String>(5);

    /**
     * Creates new form Main
     */
    public ControlColaboradorForm() {
        initComponents();
//        jtfDni.setFocusTraversalKeysEnabled(false);
//        keywords.add("example");
//        keywords.add("autocomplete");
//        keywords.add("stackabuse");
//        keywords.add("java");

        colaboradorService = Injector.obtenerServicio(ColaboradorService.class);
        contratoService = Injector.obtenerServicio(ContratoService.class);
        turnoService = Injector.obtenerServicio(TurnoService.class);
        asistenciaService = Injector.obtenerServicio(AsistenciaService.class);
        tablamaestraService = Injector.obtenerServicio(TablamaestraService.class);

        cu = new ConectionUtil();
//        Autocomplete autoComplete = new Autocomplete(jtfDni, keywords);
//        jtfDni.getDocument().addDocumentListener(autoComplete);
//        jtfDni.getInputMap().put(KeyStroke.getKeyStroke("TAB"), COMMIT_ACTION);
//        jtfDni.getActionMap().put(COMMIT_ACTION, autoComplete.new CommitAction());
    }

    protected void Iniciar() {
        Lector.addDataListener(new DPFPDataAdapter() {
            @Override
            public void dataAcquired(final DPFPDataEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        EnviarTexto("La huella digital no ha sido capturada");
                        ProcesarCaptura(e.getSample());
                    }
                });
            }
        });
        Lector.addReaderStatusListener(new DPFPReaderStatusAdapter() {
            @Override
            public void readerConnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        EnviarTexto("El sensor de huella digital esta activado o conectado");
                    }
                });
            }

            @Override
            public void readerDisconnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        EnviarTexto("El sensor de huella digital esta desactivada o desconectada");
                    }
                });
            }
        });
        Lector.addSensorListener(new DPFPSensorAdapter() {
            @Override
            public void fingerTouched(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        EnviarTexto("El dedo ha sido colocado sobre el lector de huella");
                    }
                });
            }

            @Override
            public void fingerGone(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        EnviarTexto("El dedo ha sido quitado del lector de huella");
                    }
                });
            }
        });
        Lector.addErrorListener(new DPFPErrorAdapter() {
            public void errorReader(final DPFPErrorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        EnviarTexto("Error: " + e.getError());
                    }
                });
            }
        });
    }

    public DPFPFeatureSet featuresinscripcion;
    public DPFPFeatureSet featuresverificacion;

    public DPFPFeatureSet extraerCaracteristicas(DPFPSample sample, DPFPDataPurpose purpose) {
        DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
        try {
            return extractor.createFeatureSet(sample, purpose);
        } catch (DPFPImageQualityException e) {
            return null;
        }
    }

    public Image CrearImagenHuella(DPFPSample sample) {
        return DPFPGlobal.getSampleConversionFactory().createImage(sample);
    }

    public void DibujarHuella(Image image) {
        labelmagen.setIcon(new ImageIcon(image.getScaledInstance(labelmagen.getWidth(), labelmagen.getHeight(), Image.SCALE_DEFAULT)));
        repaint();
    }

    public void EstadoHuellas() {
        EnviarTexto("Muestra de huellas necesarias para guardar template " + Reclutador.getFeaturesNeeded());
    }

    public void EnviarTexto(String string) {
        System.out.println(string + "\n");
    }

    public void start() {
        Lector.startCapture();
        EnviarTexto("Utilizando el lector de huellas dactilar");
    }

    public void stop() {
        Lector.stopCapture();
        EnviarTexto("No se esta usando el lector de huellas dactilar");
    }

    public DPFPTemplate getTemplate() {
        return template;
    }

    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
        this.template = template;
        firePropertyChange(TEMPLATE_PROPERTY, old, template);
    }

    public void ProcesarCaptura(DPFPSample sample) {
        featuresinscripcion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);
        featuresverificacion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);
        if (featuresinscripcion != null) {
            try {
                System.out.println("Las caracteristicas de la huella han sido creadas");
                Reclutador.addFeatures(featuresinscripcion);
                //Dibuja huella dactilar
                Image image = CrearImagenHuella(sample);
                DibujarHuella(image);
                //BUSQUEDA DE USUARIO
                try {
                    identificarHuella();
                    Reclutador.clear();
                } catch (IOException ex) {
                    Logger.getLogger(ControlColaboradorForm.class.getName()).log(Level.SEVERE, null, ex);
                }

                //BtnVerificar.setEnabled(true);
                //BtnIdentificar.setEnabled(true);
            } catch (DPFPImageQualityException ex) {
                System.err.println("Error: " + ex.getMessage());
            } finally {
                EstadoHuellas();
                switch (Reclutador.getTemplateStatus()) {
                    case TEMPLATE_STATUS_READY:
                        stop();
                        setTemplate(Reclutador.getTemplate());
                        EnviarTexto("La plantilla de la huella ha sido creada, ya puede verificarla");
                        //BtnIdentificar.setEnabled(false);
                        //BtnVerificar.setEnabled(false);
                        //jbControlar.setEnabled(true);
                        //jbControlar.grabFocus();
                        break;
                    case TEMPLATE_STATUS_FAILED:
                        Reclutador.clear();
                        stop();
                        EstadoHuellas();
                        setTemplate(null);
                        JOptionPane.showMessageDialog(ControlColaboradorForm.this, "La plantilla de la huella no pudo ser aceptada");
                        start();
                        break;
                }
            }
        }
    }

    public void guardarHuella() throws SQLException {
        ByteArrayInputStream datosHuella = new ByteArrayInputStream(template.serialize());
        Integer tamañoHuella = template.serialize().length;
        try {
            Connection c = cu.getConexion();
            System.out.println("aquiiiiii" + datosHuella);
            System.out.println("AQUI" + tamañoHuella);
            PreparedStatement guardarStmt = c.prepareStatement("update colaborador set huella= ? where id=?");
            guardarStmt.setBinaryStream(1, datosHuella, tamañoHuella);
            guardarStmt.setInt(2, con.getColaborador().getId());
            int dato = guardarStmt.executeUpdate();
            guardarStmt.close();
            if (dato == 1) {
                JOptionPane.showMessageDialog(null, "HUella guardada correctamente");
                //cu.cerrarConexion();
            } else {
                JOptionPane.showMessageDialog(null, "La huella no ha sido guardada");
            }

            //BtnVerificar.grabFocus();
        } catch (SQLException ex) {
            System.err.println("Error al guardar los datos de la huella" + ex);
        } finally {
            cu.cerrarConexion();
        }
    }

    public void verificarHuella(String nom) {
        try {
            Connection c = cu.getConexion();
            PreparedStatement verificarStmt = c.prepareStatement("SELECT huehuella FROM somhue WHERE huenombre=?");
            verificarStmt.setString(1, nom);
            ResultSet rs = verificarStmt.executeQuery();

            if (rs.next()) {
                byte templateBuffer[] = rs.getBytes("huehuella");
                DPFPTemplate referenceTemplate = DPFPGlobal.getTemplateFactory().createTemplate(templateBuffer);
                setTemplate(referenceTemplate);
                DPFPVerificationResult result = Verificador.verify(featuresverificacion, getTemplate());
                if (result.isVerified()) {
                    JOptionPane.showMessageDialog(null, "La huella capturada coincide con la de " + nom, "Verificacion de huella", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No corresponde la huella con " + nom, "Verificacion de huella", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe un registro de huella para " + nom, "Verificacion de huella", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Error al verificar los datos de la huella.");
        } finally {
            cu.cerrarConexion();
        }
    }

    public void controlar() {
        jlDni.setText(con.getColaborador().getDni() + "");
        jlNombreApellidos.setText(con.getColaborador().getNombre() + " " + con.getColaborador().getApellidopat() + " " + con.getColaborador().getApellidomat());
        jlContrato.setText(con.getCodigo());
        horaIngreso = new Date();

        //OBTENCION DE TURNO E INGRESO
        List<Turno> lt = turnoService.listarTurno(con);
        List<Turno> ltAux = new ArrayList<>();
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(horaIngreso);

        for (Turno t : lt) {
            if (t.getDia() == cal.get(Calendar.DAY_OF_WEEK)) {
                ltAux.add(t);
            }
        }
        //IMPRIMIR EN VISTA TURNOS Y ASISTENCIA
        String texto = "";
        //Revisar si ya marco entradas
        for (int i = 0; i < ltAux.size(); i++) {
            Turno t = ltAux.get(i);
            Asistencia a = asistenciaService.buscarAsistencia(t, horaIngreso);
            if (a == null) {
                //NO MARCO ASISTENCIA TODAVIA, PROCEDE A REVISAR TIEMPO
                Date horaInAux = new Date();
                Date horaEnAux = new Date();
                try {
                    horaInAux = sdf.parse(sdf.format(horaIngreso));
                    horaEnAux = sdf.parse(sdf.format(t.getHoraentrada()));
                    System.out.println("Hora ingreso: " + horaInAux);
                    System.out.println("Hora Entrada: " + horaEnAux);
                } catch (Exception e) {
                }

                if (horaInAux.compareTo(horaEnAux) < 0) {
                    //COMPARAR POR CUANTOS MINUTOS ANTES
                    Calendar calen = Calendar.getInstance();
                    calen.setTime(horaEnAux);
                    calen.add(Calendar.MINUTE, -30);

                    horaEnAux = calen.getTime();
                    if (horaInAux.before(horaEnAux)) {
                        texto += "Turno " + (i + 1) + ": " + sdf.format(t.getHoraentrada()) + " - (PUEDE MARCAR MÁXIMO 30 MINS. ANTES) \n";
                    } else {
                        jlHoraingreso.setForeground(Color.blue);
                        jlHoraingreso.setText(sdf.format(horaIngreso) + " TURNO N° " + (i + 1) + " (INGRESO A TIEMPO)");
                        texto += "Turno " + (i + 1) + ": " + sdf.format(t.getHoraentrada()) + " - (...) \n";

                        tm = tablamaestraService.obtenerTipoIdItem(new Tablamaestra(18, 1));
                        controlarAsistencia(new Asistencia(0, con, t.getId(), tm.getId(), 0, new Date(), t.getHoraentrada(), t.getHorasalida(), horaIngreso, t.getHorasalida()));
                    }
                } else {
                    if (horaInAux.compareTo(horaEnAux) == 0) {
                        jlHoraingreso.setForeground(Color.blue);
                        jlHoraingreso.setText(sdf.format(horaIngreso) + " TURNO N° " + (i + 1) + " (INGRESO A TIEMPO EXACTO)");
                        texto += "Turno " + (i + 1) + ": " + sdf.format(t.getHoraentrada()) + " - (...) \n";

                        tm = tablamaestraService.obtenerTipoIdItem(new Tablamaestra(18, 1));
                        controlarAsistencia(new Asistencia(0, con, t.getId(), tm.getId(), 0, new Date(), t.getHoraentrada(), t.getHorasalida(), horaIngreso, t.getHorasalida()));
                    } else {
                        //COMPARAR POR CUANTOS MINUTOS SE TARDO
                        Calendar calen = Calendar.getInstance();
                        calen.setTime(horaEnAux);
                        calen.add(Calendar.MINUTE, 30);

                        horaEnAux = calen.getTime();
                        if (horaInAux.after(horaEnAux)) {
                            jlHoraingreso.setForeground(Color.red);
                            jlHoraingreso.setText(" TURNO N° " + (i + 1) + " (FALTO)");
                            texto += "Turno " + (i + 1) + ": " + sdf.format(t.getHoraentrada()) + " - (FALTÓ) \n";

                            tm = tablamaestraService.obtenerTipoIdItem(new Tablamaestra(18, 3));
                            controlarAsistencia(new Asistencia(0, con, t.getId(), tm.getId(), 30, new Date(), t.getHoraentrada(), t.getHorasalida(), horaIngreso, t.getHorasalida()));
                        } else {
                            jlHoraingreso.setForeground(Color.red);
                            jlHoraingreso.setText(sdf.format(horaIngreso) + " TURNO N° " + (i + 1) + " (INGRESO TARDIO)");
                            texto += "Turno " + (i + 1) + ": " + sdf.format(t.getHoraentrada()) + " - (...) \n";

                            tm = tablamaestraService.obtenerTipoIdItem(new Tablamaestra(18, 2));
                            controlarAsistencia(new Asistencia(0, con, t.getId(), tm.getId(), horaIngreso.getMinutes() - t.getHoraentrada().getMinutes(), new Date(), t.getHoraentrada(), t.getHorasalida(), horaIngreso, t.getHorasalida()));
                        }
                    }
                }

            } else {
                jlHoraingreso.setForeground(Color.GRAY);
                jlHoraingreso.setText(" TURNO N° " + (i + 1) + " (YA MARCÓ ASISTENCIA)");
                texto += "Turno " + (i + 1) + ": " + sdf.format(t.getHoraentrada()) + " - (ASISTIÓ) \n";
            }
        }
        jtaTurnos.setText("");
        jtaTurnos.setText(texto);
    }

    public void identificarHuella() throws IOException {
        try {
            Connection c = cu.getConexion();
            PreparedStatement identificarStmt = c.prepareStatement("SELECT id,huella FROM colaborador");
            ResultSet rs = identificarStmt.executeQuery();
            while (rs.next()) {
                byte templateBuffer[] = rs.getBytes("huella");
                int id = rs.getInt("id");
                if (templateBuffer != null) {
                    DPFPTemplate referenceTemplate = DPFPGlobal.getTemplateFactory().createTemplate(templateBuffer);
                    setTemplate(referenceTemplate);
                    DPFPVerificationResult result = Verificador.verify(featuresverificacion, getTemplate());
                    if (result.isVerified()) {
                        con = contratoService.obtenerUltimo(colaboradorService.get(id));
                    }
                }
            }

            if (con != null) {
                controlar();
            } else {
                JOptionPane.showMessageDialog(null, "Usted NO ESTA REGISTRADO en el sistema");
            }
            setTemplate(null);
        } catch (SQLException e) {
            System.err.println("Error al identificar huella dactilar." + e.getMessage());
        } finally {
            cu.cerrarConexion();
        }
    }

    public boolean MarcoAsistencia(Turno tu, Date f) {
        return true;//asistenciaService.buscarAsistencia(tu, f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlNombreApellidos = new javax.swing.JLabel();
        jlHoraingreso = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlMessage = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlContrato = new javax.swing.JLabel();
        labelmagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaTurnos = new javax.swing.JTextArea();
        jbRetornar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jlNombreApellidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jlHoraingreso.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlHoraingreso.setForeground(new java.awt.Color(0, 0, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Turnos: ");

        jlMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlMessage.setForeground(new java.awt.Color(0, 153, 0));

        jlDni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Control de personal");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Dni");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Apellidos y nombre: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Contrato: ");

        jlContrato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jtaTurnos.setColumns(20);
        jtaTurnos.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jtaTurnos.setRows(5);
        jScrollPane1.setViewportView(jtaTurnos);

        jbRetornar.setText("Retornar");
        jbRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(jbRetornar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlHoraingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jlContrato, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jlDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jlNombreApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelmagen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlDni, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlNombreApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(labelmagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jlHoraingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRetornar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        stop();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Iniciar();
        start();
        EstadoHuellas();
    }//GEN-LAST:event_formWindowOpened

    private void jbRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetornarActionPerformed
        Main m = new Main();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_jbRetornarActionPerformed

    public void controlarAsistencia(Asistencia a) {
        asistenciaService.create(a);
    }

    public void limpiar() {
        try {
            Thread.sleep(3 * 1000);

            jlDni.setText("");
            jlNombreApellidos.setText("");
            jlContrato.setText("");
            jlHoraingreso.setText("");
            jlMessage.setText("");
            jtaTurnos.setText("");
            labelmagen.setText("");
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRetornar;
    private javax.swing.JLabel jlContrato;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlHoraingreso;
    private javax.swing.JLabel jlMessage;
    private javax.swing.JLabel jlNombreApellidos;
    private javax.swing.JTextArea jtaTurnos;
    private javax.swing.JLabel labelmagen;
    // End of variables declaration//GEN-END:variables
}
