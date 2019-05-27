/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service;

import com.besoft.siadi.entity.Asistencia;
import com.besoft.siadi.entity.Turno;
import java.util.Date;

/**
 *
 * @author nerio
 */
public interface AsistenciaService extends GenericService<Asistencia> {

    public Asistencia buscarAsistencia(Turno tu, Date f);
}
