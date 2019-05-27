/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service;

import com.besoft.siadi.entity.Agencia;
import com.besoft.siadi.entity.Colaborador;
import java.util.List;

/**
 *
 * @author nerio
 */
public interface ColaboradorService extends GenericService<Colaborador> {

    List<Colaborador> listarColaborador(Agencia a);

    List<Colaborador> buscarColaborador(Colaborador c);
}
