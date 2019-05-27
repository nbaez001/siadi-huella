/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service;

import com.besoft.siadi.entity.Agencia;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author nerio
 */
public interface AgenciaService extends GenericService<Agencia> {

    boolean existeInitParams();
}
