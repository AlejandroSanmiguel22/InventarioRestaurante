package com.sanmigueltech.inventariorestaurante.Model.producto;

import com.sanmigueltech.inventariorestaurante.Model.Categoria;
import com.sanmigueltech.inventariorestaurante.Model.Fabricante;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Producto {
    protected String idProducto;
    protected String nombreProducto;
    protected int cantidadNeto;
    protected double precio;
    protected Fabricante fabricante;
    protected Categoria categoria;

    protected boolean tieneFechaCaducidad;
    protected LocalDate fechaCaducidad;

    // simulacion de una DB tabla Producto
    public static ArrayList<Producto> tablaPrducto = new ArrayList<Producto>();

    public static ArrayList<Producto> obtenerProducto(){
        return Producto.tablaPrducto;
    }
    public static void actualizarProducto(Producto productoMod){
        for (Producto prod: obtenerProducto()) {
            if (productoMod.getIdProducto().contains(prod.getIdProducto())){
                prod.setNombreProducto(productoMod.getNombreProducto());
                prod.setCantidadNeto(productoMod.getCantidadNeto());
                prod.setPrecio(productoMod.getPrecio());
                prod.setFabricante(productoMod.getFabricante());
                prod.setCategoria(productoMod.getCategoria());
                prod.setTieneFechaCaducidad(productoMod.isTieneFechaCaducidad());
                prod.setFechaCaducidad(productoMod.getFechaCaducidad());

                System.out.println("El producto ha sido actualizado");
            }
        }
    }
    public static void crearProducto(Producto prodAgregar){
        Producto.tablaPrducto.add(prodAgregar);
    }
    public static void eliminarProducto(Producto prodDelete){
        tablaPrducto.remove(prodDelete);
        System.out.println("Producto eliminado");
    }

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

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String obtenerDetalles() {
        return String.format("Id: %s \nProducto: %s\n", this.idProducto, this.nombreProducto);
    }
}
