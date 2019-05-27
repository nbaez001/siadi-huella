/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service.impl;

import com.besoft.siadi.dao.TurnoDao;
import com.besoft.siadi.entity.Contrato;
import com.besoft.siadi.entity.Turno;
import com.besoft.siadi.service.TurnoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nerio
 */
@Service
public class TurnoServiceImpl extends GenericServiceImpl<Turno> implements TurnoService {

    @Autowired
    TurnoDao turnoDao;

    @Override
    public List<Turno> listarTurno(Contrato c) {
        return turnoDao.consultList("from Turno t where t.contrato.id=" + c.getId()+" order by t.idttipoturno");
    }

}
