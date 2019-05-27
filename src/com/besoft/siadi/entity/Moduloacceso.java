package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.List;

/**
 * Moduloacceso generated by hbm2java
 */
public class Moduloacceso implements java.io.Serializable {

    private int id;
    private Usuario usuario;
    private String nombre;
    private String codigo;
    private String ruta;
    private String icono;
    private boolean estado;
    private List rolaccesos;

    public Moduloacceso() {
    }

    public Moduloacceso(int id, Usuario usuario, String nombre, String codigo, String ruta, String icono, boolean estado) {
        this.id = id;
        this.usuario = usuario;
        this.nombre = nombre;
        this.codigo = codigo;
        this.ruta = ruta;
        this.icono = icono;
        this.estado = estado;
    }

    public Moduloacceso(int id, Usuario usuario, String nombre, String codigo, String ruta, String icono, boolean estado, List rolaccesos) {
        this.id = id;
        this.usuario = usuario;
        this.nombre = nombre;
        this.codigo = codigo;
        this.ruta = ruta;
        this.icono = icono;
        this.estado = estado;
        this.rolaccesos = rolaccesos;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRuta() {
        return this.ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getIcono() {
        return this.icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List getRolaccesos() {
        return this.rolaccesos;
    }

    public void setRolaccesos(List rolaccesos) {
        this.rolaccesos = rolaccesos;
    }

}