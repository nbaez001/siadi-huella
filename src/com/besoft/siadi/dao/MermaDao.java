/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.dao;

import com.besoft.siadi.entity.Inventario;
import com.besoft.siadi.entity.Merma;
import java.util.List;

/**
 *
 * @author nerio
 */
public interface MermaDao extends GenericDao<Merma> {

    Merma registrarMerma(Merma m, List<Inventario> li);

    int eliminarMerma(Merma m);
}
