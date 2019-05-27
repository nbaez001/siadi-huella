/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service;

import com.besoft.siadi.entity.Departamento;
import com.besoft.siadi.entity.Provincia;
import java.util.List;

/**
 *
 * @author nerio
 */
public interface ProvinciaService extends GenericService<Provincia> {

    List<Provincia> listarPorDepartamento(Departamento d);
}
