package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

/**
 * Pais generated by hbm2java
 */
public class Pais implements java.io.Serializable {

    private int id;
    private String codigo;
    private String denominacion;

    public Pais() {
    }

    public Pais(int id, String codigo, String denominacion) {
        this.id = id;
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return this.denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

}
