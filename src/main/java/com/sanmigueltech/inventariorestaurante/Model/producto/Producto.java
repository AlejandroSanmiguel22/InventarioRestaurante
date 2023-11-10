package com.sanmigueltech.inventariorestaurante.Model.producto;

import com.sanmigueltech.inventariorestaurante.Model.Categoria;
import com.sanmigueltech.inventariorestaurante.Model.Fabricante;

import java.sql.Date;

public class Producto {
    protected String idProducto;
    protected String nombreProducto;
    protected String descripcion;
    protected int cantidadNeto;
    protected double precio;
    protected Fabricante fabricante;
    protected Categoria categoria;

    protected boolean tieneFechaCaducidad;
    protected Date fechaCaducidad;

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadNeto() {
        return cantidadNeto;
    }

    public void setCantidadNeto(int cantidadNeto) {
        this.cantidadNeto = cantidadNeto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isTieneFechaCaducidad() {
        return tieneFechaCaducidad;
    }

    public void setTieneFechaCaducidad(boolean tieneFechaCaducidad) {
        this.tieneFechaCaducidad = tieneFechaCaducidad;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
