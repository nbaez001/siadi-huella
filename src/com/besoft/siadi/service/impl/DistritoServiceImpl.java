/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service.impl;

import com.besoft.siadi.dao.DistritoDao;
import com.besoft.siadi.entity.Distrito;
import com.besoft.siadi.entity.Provincia;
import com.besoft.siadi.service.DistritoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nerio
 */
@Service
public class DistritoServiceImpl extends GenericServiceImpl<Distrito> implements DistritoService {

    @Autowired
    DistritoDao distritoDao;

    @Override
    public List<Distrito> listarPorProvincia(Provincia p) {
        return distritoDao.consultList("from Distrito d where d.provincia.id=" + p.getId());
    }

}
