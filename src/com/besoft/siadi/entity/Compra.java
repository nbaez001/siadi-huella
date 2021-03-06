package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Compra generated by hbm2java
 */
public class Compra implements java.io.Serializable {

    private int id;
    private Agencia agencia;
    private Proveedor proveedor;
    private int idtestadocompra;
    private int idttipocomprobante;
    private String codigo;
    private double montototal;
    private String nrocomprobante;
    private String seriecomprobante;
    private String urlcomprobante;
    private String codordencompra;
    private String urlordencompra;
    private String observacion;
    private Date fechacompra;
    private Date fechaalmacenamiento;
    private int idusuariocrea;
    private Date fechusuariocrea;
    private Integer idusuariomod;
    private Date fechusuariomod;

    public Compra() {
    }

    public Compra(int id, Agencia agencia, Proveedor proveedor, int idtestadocompra, int idttipocomprobante, String codigo, double montototal, Date fechacompra, Date fechaalmacenamiento, int idusuariocrea, Date fechusuariocrea) {
        this.id = id;
        this.agencia = agencia;
        this.proveedor = proveedor;
        this.idtestadocompra = idtestadocompra;
        this.idttipocomprobante = idttipocomprobante;
        this.codigo = codigo;
        this.montototal = montototal;
        this.fechacompra = fechacompra;
        this.fechaalmacenamiento = fechaalmacenamiento;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
    }

    public Compra(int id, Agencia agencia, Proveedor proveedor, int idtestadocompra, int idttipocomprobante, String codigo, double montototal, String nrocomprobante, String seriecomprobante, String urlcomprobante, String codordencompra, String urlordencompra, String observacion, Date fechacompra, Date fechaalmacenamiento, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.id = id;
        this.agencia = agencia;
        this.proveedor = proveedor;
        this.idtestadocompra = idtestadocompra;
        this.idttipocomprobante = idttipocomprobante;
        this.codigo = codigo;
        this.montototal = montototal;
        this.nrocomprobante = nrocomprobante;
        this.seriecomprobante = seriecomprobante;
        this.urlcomprobante = urlcomprobante;
        this.codordencompra = codordencompra;
        this.urlordencompra = urlordencompra;
        this.observacion = observacion;
        this.fechacompra = fechacompra;
        this.fechaalmacenamiento = fechaalmacenamiento;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
        this.idusuariomod = idusuariomod;
        this.fechusuariomod = fechusuariomod;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Agencia getAgencia() {
        return this.agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Proveedor getProveedor() {
        return this.proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getIdtestadocompra() {
        return this.idtestadocompra;
    }

    public void setIdtestadocompra(int idtestadocompra) {
        this.idtestadocompra = idtestadocompra;
    }

    public int getIdttipocomprobante() {
        return this.idttipocomprobante;
    }

    public void setIdttipocomprobante(int idttipocomprobante) {
        this.idttipocomprobante = idttipocomprobante;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getMontototal() {
        return this.montototal;
    }

    public void setMontototal(double montototal) {
        this.montototal = montototal;
    }

    public String getNrocomprobante() {
        return this.nrocomprobante;
    }

    public void setNrocomprobante(String nrocomprobante) {
        this.nrocomprobante = nrocomprobante;
    }

    public String getSeriecomprobante() {
        return this.seriecomprobante;
    }

    public void setSeriecomprobante(String seriecomprobante) {
        this.seriecomprobante = seriecomprobante;
    }

    public String getUrlcomprobante() {
        return this.urlcomprobante;
    }

    public void setUrlcomprobante(String urlcomprobante) {
        this.urlcomprobante = urlcomprobante;
    }

    public String getCodordencompra() {
        return this.codordencompra;
    }

    public void setCodordencompra(String codordencompra) {
        this.codordencompra = codordencompra;
    }

    public String getUrlordencompra() {
        return this.urlordencompra;
    }

    public void setUrlordencompra(String urlordencompra) {
        this.urlordencompra = urlordencompra;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechacompra() {
        return this.fechacompra;
    }

    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }

    public Date getFechaalmacenamiento() {
        return this.fechaalmacenamiento;
    }

    public void setFechaalmacenamiento(Date fechaalmacenamiento) {
        this.fechaalmacenamiento = fechaalmacenamiento;
    }

    public int getIdusuariocrea() {
        return this.idusuariocrea;
    }

    public void setIdusuariocrea(int idusuariocrea) {
        this.idusuariocrea = idusuariocrea;
    }

    public Date getFechusuariocrea() {
        return this.fechusuariocrea;
    }

    public void setFechusuariocrea(Date fechusuariocrea) {
        this.fechusuariocrea = fechusuariocrea;
    }

    public Integer getIdusuariomod() {
        return this.idusuariomod;
    }

    public void setIdusuariomod(Integer idusuariomod) {
        this.idusuariomod = idusuariomod;
    }

    public Date getFechusuariomod() {
        return this.fechusuariomod;
    }

    public void setFechusuariomod(Date fechusuariomod) {
        this.fechusuariomod = fechusuariomod;
    }

}
