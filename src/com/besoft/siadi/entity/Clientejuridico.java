package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Clientejuridico generated by hbm2java
 */
public class Clientejuridico implements java.io.Serializable {

    private int id;
    private int iddistrito;
    private long ruc;
    private String razonsocial;
    private String nombrecomercial;
    private String jironegocio;
    private Long telefono;
    private String direccion;
    private String email;
    private Date fechafundacion;

    public Clientejuridico() {
    }

    public Clientejuridico(int id, int iddistrito, long ruc, String razonsocial) {
        this.id = id;
        this.iddistrito = iddistrito;
        this.ruc = ruc;
        this.razonsocial = razonsocial;
    }

    public Clientejuridico(int id, int iddistrito, long ruc, String razonsocial, String nombrecomercial, String jironegocio, Long telefono, String direccion, String email, Date fechafundacion) {
        this.id = id;
        this.iddistrito = iddistrito;
        this.ruc = ruc;
        this.razonsocial = razonsocial;
        this.nombrecomercial = nombrecomercial;
        this.jironegocio = jironegocio;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.fechafundacion = fechafundacion;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIddistrito() {
        return this.iddistrito;
    }

    public void setIddistrito(int iddistrito) {
        this.iddistrito = iddistrito;
    }

    public long getRuc() {
        return this.ruc;
    }

    public void setRuc(long ruc) {
        this.ruc = ruc;
    }

    public String getRazonsocial() {
        return this.razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getNombrecomercial() {
        return this.nombrecomercial;
    }

    public void setNombrecomercial(String nombrecomercial) {
        this.nombrecomercial = nombrecomercial;
    }

    public String getJironegocio() {
        return this.jironegocio;
    }

    public void setJironegocio(String jironegocio) {
        this.jironegocio = jironegocio;
    }

    public Long getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechafundacion() {
        return this.fechafundacion;
    }

    public void setFechafundacion(Date fechafundacion) {
        this.fechafundacion = fechafundacion;
    }

}
