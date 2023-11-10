package com.sanmigueltech.inventariorestaurante.Model.producto;

import com.sanmigueltech.inventariorestaurante.Model.Categoria;
import com.sanmigueltech.inventariorestaurante.Model.Fabricante;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
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
}
