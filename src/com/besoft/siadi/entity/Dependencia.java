package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Dependencia generated by hbm2java
 */
public class Dependencia implements java.io.Serializable {

    private int id;
    private Agencia agencia;
    private int iddepende;
    private String nombre;
    private String abreviatura;
    private String descripcion;
    private boolean estado;
    private boolean rrhh;
    private int idusuariocrea;
    private Date fechusuariocrea;
    private Integer idusuariomod;
    private Date fechusuariomod;

    public Dependencia() {
    }

    public Dependencia(int id, Agencia agencia, int iddepende, String nombre, String abreviatura, String descripcion, boolean estado, boolean rrhh, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.id = id;
        this.agencia = agencia;
        this.iddepende = iddepende;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.descripcion = descripcion;
        this.estado = estado;
        this.rrhh = rrhh;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
        this.idusuariomod = idusuariomod;
        this.fechusuariomod = fechusuariomod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public int getIddepende() {
        return iddepende;
    }

    public void setIddepende(int iddepende) {
        this.iddepende = iddepende;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isRrhh() {
        return rrhh;
    }

    public void setRrhh(boolean rrhh) {
        this.rrhh = rrhh;
    }

    public int getIdusuariocrea() {
        return idusuariocrea;
    }

    public void setIdusuariocrea(int idusuariocrea) {
        this.idusuariocrea = idusuariocrea;
    }

    public Date getFechusuariocrea() {
        return fechusuariocrea;
    }

    public void setFechusuariocrea(Date fechusuariocrea) {
        this.fechusuariocrea = fechusuariocrea;
    }

    public Integer getIdusuariomod() {
        return idusuariomod;
    }

    public void setIdusuariomod(Integer idusuariomod) {
        this.idusuariomod = idusuariomod;
    }

    public Date getFechusuariomod() {
        return fechusuariomod;
    }

    public void setFechusuariomod(Date fechusuariomod) {
        this.fechusuariomod = fechusuariomod;
    }

}
