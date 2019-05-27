/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service.impl;

import com.besoft.siadi.dao.DepartamentoDao;
import com.besoft.siadi.entity.Departamento;
import com.besoft.siadi.entity.Pais;
import com.besoft.siadi.service.DepartamentoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nerio
 */
@Service
public class DepartamentoServiceImpl extends GenericServiceImpl<Departamento> implements DepartamentoService {

    @Autowired
    DepartamentoDao departamentoDao;

    @Override
    public List<Departamento> listarPorPais(Pais p) {
        return departamentoDao.consultList("from Departamento d where d.pais.id=" + p.getId());
    }

}
