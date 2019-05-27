/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service;

import com.besoft.siadi.entity.Distrito;
import com.besoft.siadi.entity.Provincia;
import java.util.List;

/**
 *
 * @author nerio
 */
public interface DistritoService extends GenericService<Distrito> {

    List<Distrito> listarPorProvincia(Provincia p);
}
