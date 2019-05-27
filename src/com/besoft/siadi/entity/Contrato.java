package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Dependencia generated by hbm2java
 */
public class Contrato implements java.io.Serializable {

    private int id;
    private Colaborador colaborador;
    private Dependencia dependencia;
    private String codigo;
    private int idttipocargo;
    private int idttipoempleado;
    private Date fechainicio;
    private Date fechafin;
    private double sueldo;
    private boolean estado;
    private boolean esjefearea;
    private int idusuariocrea;
    private Date fechusuariocrea;
    private Integer idusuariomod;
    private Date fechusuariomod;

    public Contrato() {
    }

    public Contrato(int id) {
        this.id = id;
    }

    public Contrato(int id, Colaborador colaborador, Dependencia dependencia, String codigo, int idttipocargo, int idttipoempleado, Date fechainicio, Date fechafin, double sueldo, boolean estado, boolean esjefearea, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.id = id;
        this.colaborador = colaborador;
        this.dependencia = dependencia;
        this.codigo = codigo;
        this.idttipocargo = idttipocargo;
        this.idttipoempleado = idttipoempleado;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.sueldo = sueldo;
        this.estado = estado;
        this.esjefearea = esjefearea;
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

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Dependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIdttipocargo() {
        return idttipocargo;
    }

    public void setIdttipocargo(int idttipocargo) {
        this.idttipocargo = idttipocargo;
    }

    public int getIdttipoempleado() {
        return idttipoempleado;
    }

    public void setIdttipoempleado(int idttipoempleado) {
        this.idttipoempleado = idttipoempleado;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEsjefearea() {
        return esjefearea;
    }

    public void setEsjefearea(boolean esjefearea) {
        this.esjefearea = esjefearea;
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
