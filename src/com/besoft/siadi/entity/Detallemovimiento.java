package com.besoft.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

/**
 * Detallemovimiento generated by hbm2java
 */
public class Detallemovimiento implements java.io.Serializable {

    private int id;
    private Movimiento movimiento;
    private Producto producto;
    private double cantidad;
    private double cantidadperfecto;
    private double cantidaddaniado;
    private double preciounitario;
    private double subtotal;

    public Detallemovimiento() {
    }

    public Detallemovimiento(int id, Movimiento movimiento, Producto producto, double cantidad, double cantidadperfecto, double cantidaddaniado, double preciounitario, double subtotal) {
        this.id = id;
        this.movimiento = movimiento;
        this.producto = producto;
        this.cantidad = cantidad;
        this.cantidadperfecto = cantidadperfecto;
        this.cantidaddaniado = cantidaddaniado;
        this.preciounitario = preciounitario;
        this.subtotal = subtotal;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movimiento getMovimiento() {
        return this.movimiento;
    }

    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidadperfecto() {
        return this.cantidadperfecto;
    }

    public void setCantidadperfecto(double cantidadperfecto) {
        this.cantidadperfecto = cantidadperfecto;
    }

    public double getCantidaddaniado() {
        return this.cantidaddaniado;
    }

    public void setCantidaddaniado(double cantidaddaniado) {
        this.cantidaddaniado = cantidaddaniado;
    }

    public double getPreciounitario() {
        return this.preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public double getSubtotal() {
        return this.subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

}
