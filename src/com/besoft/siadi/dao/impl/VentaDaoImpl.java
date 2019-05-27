/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.dao.impl;

import com.besoft.siadi.dao.VentaDao;
import com.besoft.siadi.entity.Cajero;
import com.besoft.siadi.entity.Comprobante;
import com.besoft.siadi.entity.Credito;
import com.besoft.siadi.entity.Detalleventa;
import com.besoft.siadi.entity.Inventario;
import com.besoft.siadi.entity.Transaccion;
import com.besoft.siadi.entity.Venta;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nerio
 */
@Repository
public class VentaDaoImpl extends GenericDaoImpl<Venta> implements VentaDao {


}
