package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Colaborador generated by hbm2java
 */
public class Colaborador implements java.io.Serializable {

    private int id;
    private Agencia agencia;
    private int iddistrito;
    private int idtestadocivil;
    private int idtgenero;
    private int dni;
    private String nombre;
    private String apellidopat;
    private String apellidomat;
    private long celular;
    private String cargo;
    private String direccion;
    private String email;
    private Long ruc;
    private Date fechanac;
    private byte[] huella;

    private int tipobusqueda;

    public Colaborador() {
    }

    public Colaborador(Agencia agencia) {
        this.agencia = agencia;
    }

    public Colaborador(int id, int dni, String nombre, String apellidopat, String apellidomat) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidopat = apellidopat;
        this.apellidomat = apellidomat;
    }

    public Colaborador(int id, Agencia agencia, int iddistrito, int idtestadocivil, int idtgenero, int dni, String nombre, String apellidopat, String apellidomat, long celular, String cargo, String direccion) {
        this.id = id;
        this.agencia = agencia;
        this.iddistrito = iddistrito;
        this.idtestadocivil = idtestadocivil;
        this.idtgenero = idtgenero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidopat = apellidopat;
        this.apellidomat = apellidomat;
        this.celular = celular;
        this.cargo = cargo;
        this.direccion = direccion;
    }

    public Colaborador(int id, Agencia agencia, int iddistrito, int idtestadocivil, int idtgenero, int dni, String nombre, String apellidopat, String apellidomat, long celular, String cargo, String direccion, String email, Long ruc, Date fechanac, byte[] huella) {
        this.id = id;
        this.agencia = agencia;
        this.iddistrito = iddistrito;
        this.idtestadocivil = idtestadocivil;
        this.idtgenero = idtgenero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidopat = apellidopat;
        this.apellidomat = apellidomat;
        this.celular = celular;
        this.cargo = cargo;
        this.direccion = direccion;
        this.email = email;
        this.ruc = ruc;
        this.fechanac = fechanac;
        this.huella = huella;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Agencia getAgencia() {
        return this.agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public int getIddistrito() {
        return this.iddistrito;
    }

    public void setIddistrito(int iddistrito) {
        this.iddistrito = iddistrito;
    }

    public int getIdtestadocivil() {
        return this.idtestadocivil;
    }

    public void setIdtestadocivil(int idtestadocivil) {
        this.idtestadocivil = idtestadocivil;
    }

    public int getIdtgenero() {
        return this.idtgenero;
    }

    public void setIdtgenero(int idtgenero) {
        this.idtgenero = idtgenero;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopat() {
        return this.apellidopat;
    }

    public void setApellidopat(String apellidopat) {
        this.apellidopat = apellidopat;
    }

    public String getApellidomat() {
        return this.apellidomat;
    }

    public void setApellidomat(String apellidomat) {
        this.apellidomat = apellidomat;
    }

    public long getCelular() {
        return this.celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public Long getRuc() {
        return this.ruc;
    }

    public void setRuc(Long ruc) {
        this.ruc = ruc;
    }

    public Date getFechanac() {
        return this.fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public int getTipobusqueda() {
        return tipobusqueda;
    }

    public void setTipobusqueda(int tipobusqueda) {
        this.tipobusqueda = tipobusqueda;
    }

    public byte[] getHuella() {
        return this.huella;
    }

    public void setHuella(byte[] huella) {
        this.huella = huella;
    }

}
