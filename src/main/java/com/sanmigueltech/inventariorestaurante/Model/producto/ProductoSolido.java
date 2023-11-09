package com.sanmigueltech.inventariorestaurante.Model.producto;

import com.sanmigueltech.inventariorestaurante.Model.Categoria;
import com.sanmigueltech.inventariorestaurante.Model.Fabricante;

import java.time.LocalDate;
import java.util.Date;

public class ProductoSolido extends Producto {

    public ProductoSolido(String id
            , String nombre
            , int cantNeto
            , double precio
            , Fabricante fab
            , Categoria cat
            , LocalDate fechaCaducidad){
        this.idProducto = id;
        this.nombreProducto = nombre;
        this.cantidadNeto = cantNeto;
        this.precio = precio;
        this.fabricante = fab;
        this.categoria = cat;
        this.fechaCaducidad = fechaCaducidad;
        this.tieneFechaCaducidad = true;
    }
}
