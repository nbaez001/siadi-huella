/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service;

import com.besoft.siadi.entity.Contrato;
import com.besoft.siadi.entity.Turno;
import java.util.List;

/**
 *
 * @author nerio
 */
public interface TurnoService extends GenericService<Turno> {

    List<Turno> listarTurno(Contrato c);
}
