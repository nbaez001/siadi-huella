package com.besoft.siadi.util;

import com.besoft.siadi.entity.Colaborador;
import com.besoft.siadi.entity.Usuario;
import java.util.List;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nerio
 */
public class SessionUtil {

    public static String SessionExpired = "{\"sesion\":\"SessionExpired\"}";
    public static int NumberSessionExpired = -1;
    public static Usuario user = new Usuario(0, new Colaborador(0, 47887880, "NERIO", "BAEZ", "DELGADO"), "admin", "bf9b291c101de627b225c3cff9094660", true);
    public static Usuario usuario;


    public SessionUtil(Usuario u) {
        SessionUtil.usuario=u;
    }

    public Usuario getUsuario() {
        return usuario;
    }

}
