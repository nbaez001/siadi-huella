package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

/**
 * Tablamaestra generated by hbm2java
 */
public class Tablamaestra implements java.io.Serializable {

    private int id;
    private int idtabla;
    private int iditem;
    private String codigo;
    private String nombre;
    private String abreviatura;
    private boolean estado;

    public Tablamaestra() {
    }

    public Tablamaestra(int idtabla, int iditem) {
        this.idtabla = idtabla;
        this.iditem = iditem;
    }

    public Tablamaestra(int id, int idtabla, int iditem, String nombre, String abreviatura, boolean estado) {
        this.id = id;
        this.idtabla = idtabla;
        this.iditem = iditem;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.estado = estado;
    }

    public Tablamaestra(int id, int idtabla, int iditem, String codigo, String nombre, String abreviatura, boolean estado) {
        this.id = id;
        this.idtabla = idtabla;
        this.iditem = iditem;
        this.codigo = codigo;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.estado = estado;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdtabla() {
        return this.idtabla;
    }

    public void setIdtabla(int idtabla) {
        this.idtabla = idtabla;
    }

    public int getIditem() {
        return this.iditem;
    }

    public void setIditem(int iditem) {
        this.iditem = iditem;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return this.abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
