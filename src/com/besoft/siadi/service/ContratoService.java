/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service;

import com.besoft.siadi.entity.Agencia;
import com.besoft.siadi.entity.Colaborador;
import com.besoft.siadi.entity.Contrato;
import com.besoft.siadi.entity.Turno;
import java.util.List;

/**
 *
 * @author nerio
 */
public interface ContratoService extends GenericService<Contrato> {

    Contrato registrarContr(Contrato c, List<Turno> listaturno);

    Contrato actualizarContr(Contrato c);

    Contrato obtenerUltimo(Colaborador c);

    int eliminarContr(Contrato c);

    List<Contrato> listarContrato(Agencia a);
}
