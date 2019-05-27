/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service.impl;

import com.besoft.siadi.dao.AgenciaDao;
import com.besoft.siadi.entity.Agencia;
import com.besoft.siadi.service.AgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author nerio
 */
@Service
public class AgenciaServiceImpl extends GenericServiceImpl<Agencia> implements AgenciaService {

    @Autowired
    AgenciaDao empresaDao;

    @Override
    public boolean existeInitParams() {
        int data;
        try {
            data = Integer.parseInt(empresaDao.consultUnique("select count(e) from Agencia e").toString());
        } catch (Exception e) {
            data = 0;
        }
        return data >= 1;
    }

}
