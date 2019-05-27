/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service.impl;

import com.besoft.siadi.dao.ProvinciaDao;
import com.besoft.siadi.entity.Departamento;
import com.besoft.siadi.entity.Provincia;
import com.besoft.siadi.service.ProvinciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nerio
 */
@Service
public class ProvinciaServiceImpl extends GenericServiceImpl<Provincia> implements ProvinciaService {

    @Autowired
    ProvinciaDao provinciaDao;

    @Override
    public List<Provincia> listarPorDepartamento(Departamento d) {
        return provinciaDao.consultList("from Provincia p where p.departamento.id=" + d.getId());
    }

}
