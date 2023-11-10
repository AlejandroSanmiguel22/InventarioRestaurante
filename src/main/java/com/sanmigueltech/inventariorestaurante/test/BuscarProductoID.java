package com.sanmigueltech.inventariorestaurante.test;

import com.sanmigueltech.inventariorestaurante.Model.producto.Producto;
import com.sanmigueltech.inventariorestaurante.dao.ProductoDAO;
import com.sanmigueltech.inventariorestaurante.factory.ConnectionRefactory;

import java.sql.SQLException;

public class BuscarProductoID {
    public static void main(String[] args) {
        var factory = new ConnectionRefactory();
        Producto buquedaProduct = null;
        try {
            ProductoDAO producto = new ProductoDAO(factory.recueperarConexionDB());
             buquedaProduct= producto.obtenerProductoId("PROD01");
        }catch (SQLException e){
            System.out.println(e);
        }
        System.out.println(buquedaProduct.toString());
    }
}
