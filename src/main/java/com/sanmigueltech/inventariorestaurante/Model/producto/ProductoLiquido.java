package com.sanmigueltech.inventariorestaurante.Model.producto;

import com.sanmigueltech.inventariorestaurante.Model.Categoria;
import com.sanmigueltech.inventariorestaurante.Model.Fabricante;

import java.sql.Date;

public class ProductoLiquido extends Producto{

    public ProductoLiquido(String idProducto, String nombreProducto, String descripcion, int cantidadNeto, double precio, Fabricante fabricante, Categoria categoria, boolean tieneFechaCaducidad, Date fechaCaducidad) {
        super(idProducto, nombreProducto, descripcion, cantidadNeto, precio, fabricante, categoria, tieneFechaCaducidad, fechaCaducidad);
    }
}
