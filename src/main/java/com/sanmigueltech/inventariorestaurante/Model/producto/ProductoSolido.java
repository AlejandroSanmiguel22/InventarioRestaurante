package com.sanmigueltech.inventariorestaurante.Model.producto;

import com.sanmigueltech.inventariorestaurante.Model.Categoria;
import com.sanmigueltech.inventariorestaurante.Model.Fabricante;
import lombok.NonNull;

import java.sql.Date;
import java.time.LocalDate;

public class ProductoSolido extends Producto {

    public ProductoSolido( @NonNull
            String id
            , String nombre
            , String desc
            , int cantNeto
            , double precio
            , Fabricante fab
            , Categoria cat
            , Date fechaCaducidad){
        this.idProducto = id;
        this.nombreProducto = nombre;
        this.descripcion = desc;
        this.cantidadNeto = cantNeto;
        this.precio = precio;
        this.fabricante = fab;
        this.categoria = cat;
        this.fechaCaducidad = fechaCaducidad;
        this.tieneFechaCaducidad = true;
    }
}
