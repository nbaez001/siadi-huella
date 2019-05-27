package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

    private int id;
    private Clientejuridico clientejuridico;
    private Clientenatural clientenatural;
    private int idttipocliente;
    private boolean estado;
    private String codigo;
    private int idusuariocrea;
    private Date fechusuariocrea;
    private Integer idusuariomod;
    private Date fechusuariomod;

    public Cliente() {
    }

    public Cliente(int id, int idttipocliente, boolean estado, String codigo, int idusuariocrea, Date fechusuariocrea) {
        this.id = id;
        this.idttipocliente = idttipocliente;
        this.estado = estado;
        this.codigo = codigo;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
    }

    public Cliente(int id, Clientejuridico clientejuridico, Clientenatural clientenatural, int idttipocliente, boolean estado, String codigo, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.id = id;
        this.clientejuridico = clientejuridico;
        this.clientenatural = clientenatural;
        this.idttipocliente = idttipocliente;
        this.estado = estado;
        this.codigo = codigo;
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

    public Clientejuridico getClientejuridico() {
        return this.clientejuridico;
    }

    public void setClientejuridico(Clientejuridico clientejuridico) {
        this.clientejuridico = clientejuridico;
    }

    public Clientenatural getClientenatural() {
        return this.clientenatural;
    }

    public void setClientenatural(Clientenatural clientenatural) {
        this.clientenatural = clientenatural;
    }

    public int getIdttipocliente() {
        return idttipocliente;
    }

    public void setIdttipocliente(int idttipocliente) {
        this.idttipocliente = idttipocliente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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