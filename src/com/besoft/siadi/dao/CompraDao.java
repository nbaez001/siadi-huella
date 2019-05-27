/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.dao;

import com.besoft.siadi.entity.Compra;
import com.besoft.siadi.entity.Detallecompra;
import java.util.List;

/**
 *
 * @author nerio
 */
public interface CompraDao extends GenericDao<Compra> {

    Compra registrarCompra(Compra c, List<Detallecompra> ldc);

    int eliminarCompra(Compra c, List<Detallecompra> ldc);
}
