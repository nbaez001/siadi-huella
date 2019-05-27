/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besoft.siadi.service;

import com.besoft.siadi.entity.Agencia;
import com.besoft.siadi.entity.Usuario;
import com.besoft.siadi.entity.nuevo.Data4;
import java.util.List;

/**
 *
 * @author nerio
 */
public interface UsuarioService extends GenericService<Usuario> {

    Usuario buscarPorNombre(String usuario);

    Usuario autenticar(Usuario u);

    Usuario autenticaradmin(Usuario u);

    List<Usuario> listarUsuarios(Agencia a);

    List<Usuario> listarUsuarioscaja(Agencia a);

    Usuario registrarUsuarioT(Data4 d);

    Usuario actualizarUsuarioT(Data4 d);

    int eliminarUsuarioT(Usuario u);

    Usuario registrarUsuario(Data4 d);

    Usuario actualizarUsuario(Data4 d);

    int eliminarUsuario(Usuario u);

    boolean existeUsuario(String p);
}
