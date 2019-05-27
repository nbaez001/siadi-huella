/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.dao.impl;

import com.besoft.siadi.dao.ProductoDao;
import com.besoft.siadi.entity.Agencia;
import com.besoft.siadi.entity.Inventarioiniciomes;
import com.besoft.siadi.entity.Producto;
import java.util.Calendar;
import java.util.Date;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nerio
 */
@Repository
public class ProductoDaoImpl extends GenericDaoImpl<Producto> implements ProductoDao {

}
