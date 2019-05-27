/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service.impl;

import com.besoft.siadi.dao.VacacionDao;
import com.besoft.siadi.entity.Vacacion;
import com.besoft.siadi.service.VacacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nerio
 */
@Service
public class VacacionServiceImpl extends GenericServiceImpl<Vacacion> implements VacacionService {

    @Autowired
    VacacionDao vacacionDao;

}
