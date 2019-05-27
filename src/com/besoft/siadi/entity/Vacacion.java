package com.besoft.siadi.entity;
// Generated 03/06/2017 08:58:38 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Vacacion generated by hbm2java
 */
public class Vacacion implements java.io.Serializable {

    private int id;
    private Contrato contrato;
    private int idtipovacacion;
    private Date fechainicio;
    private Date fechafin;
    private String descripcion;
    private int idusuariocrea;
    private Date fechusuariocrea;
    private Integer idusuariomod;
    private Date fechusuariomod;

    public Vacacion() {
    }

    public Vacacion(int id, Contrato contrato, int idtipovacacion, Date fechainicio, Date fechafin, String descripcion, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.id = id;
        this.contrato = contrato;
        this.idtipovacacion = idtipovacacion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.descripcion = descripcion;
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

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public int getIdtipovacacion() {
        return idtipovacacion;
    }

    public void setIdtipovacacion(int idtipovacacion) {
        this.idtipovacacion = idtipovacacion;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
