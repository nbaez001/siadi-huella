package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Caja generated by hbm2java
 */
public class Caja implements java.io.Serializable {

    private int id;
    private Agencia agencia;
    private String nombre;
    private String ip;
    private String nroserie;
    private String nroautorizacion;
    private boolean estado;
    private int idusuariocrea;
    private Date fechusuariocrea;
    private Integer idusuariomod;
    private Date fechusuariomod;

    public Caja() {
    }

    public Caja(int id, Agencia agencia, String nombre, String ip, String nroserie, String nroautorizacion, boolean estado, int idusuariocrea, Date fechusuariocrea) {
        this.id = id;
        this.agencia = agencia;
        this.nombre = nombre;
        this.ip = ip;
        this.nroserie = nroserie;
        this.nroautorizacion = nroautorizacion;
        this.estado = estado;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
    }

    public Caja(int id, Agencia agencia, String nombre, String ip, String nroserie, String nroautorizacion, boolean estado, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.id = id;
        this.agencia = agencia;
        this.nombre = nombre;
        this.ip = ip;
        this.nroserie = nroserie;
        this.nroautorizacion = nroautorizacion;
        this.estado = estado;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
        this.idusuariomod = idusuariomod;
        this.fechusuariomod = fechusuariomod;
    }

    public int getId() {
        return this.id;
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

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNroserie() {
        return nroserie;
    }

    public void setNroserie(String nroserie) {
        this.nroserie = nroserie;
    }

    public String getNroautorizacion() {
        return nroautorizacion;
    }

    public void setNroautorizacion(String nroautorizacion) {
        this.nroautorizacion = nroautorizacion;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdusuariocrea() {
        return this.idusuariocrea;
    }

    public void setIdusuariocrea(int idusuariocrea) {
        this.idusuariocrea = idusuariocrea;
    }

    public Date getFechusuariocrea() {
        return this.fechusuariocrea;
    }

    public void setFechusuariocrea(Date fechusuariocrea) {
        this.fechusuariocrea = fechusuariocrea;
    }

    public Integer getIdusuariomod() {
        return this.idusuariomod;
    }

    public void setIdusuariomod(Integer idusuariomod) {
        this.idusuariomod = idusuariomod;
    }

    public Date getFechusuariomod() {
        return this.fechusuariomod;
    }

    public void setFechusuariomod(Date fechusuariomod) {
        this.fechusuariomod = fechusuariomod;
    }

}
