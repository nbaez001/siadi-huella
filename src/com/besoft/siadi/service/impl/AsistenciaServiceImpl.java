/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service.impl;

import com.besoft.siadi.dao.AsistenciaDao;
import com.besoft.siadi.entity.Asistencia;
import com.besoft.siadi.entity.Turno;
import com.besoft.siadi.service.AsistenciaService;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nerio
 */
@Service
public class AsistenciaServiceImpl extends GenericServiceImpl<Asistencia> implements AsistenciaService {

    @Autowired
    AsistenciaDao asistenciaDao;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Asistencia buscarAsistencia(Turno tu, Date fecha) {
        return (Asistencia) asistenciaDao.consultUnique("from Asistencia a where a.idturno=" + tu.getId() + " and a.fecha='" + sdf.format(fecha) + "'");
    }

}
