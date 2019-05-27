/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service;

import com.besoft.siadi.entity.Agencia;
import com.besoft.siadi.entity.Contrato;
import com.besoft.siadi.entity.Permiso;
import java.util.List;

/**
 *
 * @author nerio
 */
public interface PermisoService extends GenericService<Permiso> {

    List<Permiso> listarPermisos(Contrato c);

    List<Permiso> listarPermisos(Agencia a);
}
