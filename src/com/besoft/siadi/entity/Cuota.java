package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Transaccion generated by hbm2java
 */
public class Cuota implements java.io.Serializable {

    private int id;
    private Credito credito;
    private int idcajero;
    private int idttipocomprobante;
    private String nrocomprobante;
    private String seriecomprobante;
    private double monto;
    private Date fecha;
    private String detalle;
    private int idusuariocrea;
    private Date fechusuariocrea;
    private Integer idusuariomod;
    private Date fechusuariomod;

    public Cuota() {
    }

    public Cuota(Credito credito, int idcajero, int idttipocomprobante, String nrocomprobante, String seriecomprobante, double monto, Date fecha, int idusuariocrea, Date fechusuariocrea) {
        this.credito = credito;
        this.idcajero = idcajero;
        this.idttipocomprobante = idttipocomprobante;
        this.nrocomprobante = nrocomprobante;
        this.seriecomprobante = seriecomprobante;
        this.monto = monto;
        this.fecha = fecha;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
    }

    public Cuota(Credito credito, int idcajero, int idttipocomprobante, String nrocomprobante, String seriecomprobante, double monto, Date fecha, String detalle, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.credito = credito;
        this.idcajero = idcajero;
        this.idttipocomprobante = idttipocomprobante;
        this.nrocomprobante = nrocomprobante;
        this.seriecomprobante = seriecomprobante;
        this.monto = monto;
        this.fecha = fecha;
        this.detalle = detalle;
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

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }

    public int getIdcajero() {
        return idcajero;
    }

    public void setIdcajero(int idcajero) {
        this.idcajero = idcajero;
    }

    public int getIdttipocomprobante() {
        return idttipocomprobante;
    }

    public void setIdttipocomprobante(int idttipocomprobante) {
        this.idttipocomprobante = idttipocomprobante;
    }

    public String getNrocomprobante() {
        return nrocomprobante;
    }

    public void setNrocomprobante(String nrocomprobante) {
        this.nrocomprobante = nrocomprobante;
    }

    public String getSeriecomprobante() {
        return seriecomprobante;
    }

    public void setSeriecomprobante(String seriecomprobante) {
        this.seriecomprobante = seriecomprobante;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
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
