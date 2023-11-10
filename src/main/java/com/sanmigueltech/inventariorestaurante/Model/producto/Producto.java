package com.sanmigueltech.inventariorestaurante.Model.producto;

import com.sanmigueltech.inventariorestaurante.Model.Categoria;
import com.sanmigueltech.inventariorestaurante.Model.Fabricante;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
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
