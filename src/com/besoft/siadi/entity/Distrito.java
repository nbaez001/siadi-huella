package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

/**
 * Distrito generated by hbm2java
 */
public class Distrito implements java.io.Serializable {

    private int id;
    private Provincia provincia;
    private String denominacion;

    public Distrito() {
    }

    public Distrito(int id, Provincia provincia, String denominacion) {
        this.id = id;
        this.provincia = provincia;
        this.denominacion = denominacion;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Provincia getProvincia() {
        return this.provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getDenominacion() {
        return this.denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

}
