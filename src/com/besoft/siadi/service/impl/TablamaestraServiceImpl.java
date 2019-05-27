/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service.impl;

import com.besoft.siadi.dao.TablamaestraDao;
import com.besoft.siadi.entity.Tablamaestra;
import com.besoft.siadi.service.TablamaestraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nerio
 */
@Service
public class TablamaestraServiceImpl extends GenericServiceImpl<Tablamaestra> implements TablamaestraService {

    @Autowired
    TablamaestraDao tablamaestraDao;

    @Override
    public List<Tablamaestra> listarTipo(Tablamaestra t) {
        return tablamaestraDao.consultList("from Tablamaestra t where t.idtabla=" + t.getIdtabla() + " and t.iditem!=0");
    }
    
      @Override
    public List<Tablamaestra> listarUnidadmedida(Tablamaestra u) {
        return tablamaestraDao.consultList("from Tablamaestra u where u.idtabla=" + u.getIdtabla() + " and u.iditem!=0");
    }

    @Override
    public Tablamaestra obtenerTipoIdItem(Tablamaestra t) {
        return (Tablamaestra) tablamaestraDao.consultUnique("from Tablamaestra t where t.idtabla=" + t.getIdtabla() + " and t.iditem=" + t.getIditem());
    }

}
