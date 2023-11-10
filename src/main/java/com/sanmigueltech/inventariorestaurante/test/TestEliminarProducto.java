package com.sanmigueltech.inventariorestaurante.test;

import com.sanmigueltech.inventariorestaurante.dao.ProductoDAO;
import com.sanmigueltech.inventariorestaurante.factory.ConnectionRefactory;

import java.sql.SQLException;

public class TestEliminarProducto {
    public static void main(String[] args) {
        var factory = new ConnectionRefactory();
        try {
           ProductoDAO producto = new ProductoDAO(factory.recueperarConexionDB());
           producto.eliminarProducto("Prod02");
        }catch (SQLException e) {
            System.out.println(e);
        }
    }
}
