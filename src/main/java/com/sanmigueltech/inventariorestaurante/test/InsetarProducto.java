package com.sanmigueltech.inventariorestaurante.test;

import com.sanmigueltech.inventariorestaurante.Model.Categoria;
import com.sanmigueltech.inventariorestaurante.Model.producto.ProductoSolido;
import com.sanmigueltech.inventariorestaurante.dao.ProductoDAO;
import com.sanmigueltech.inventariorestaurante.factory.ConnectionRefactory;

import java.sql.Date;
import java.sql.SQLException;

public class InsetarProducto {
    public static void main(String[] args) {
        var factoryConnection = new ConnectionRefactory();
        ProductoDAO producto = null;
        try {
            var coneccion = factoryConnection.recueperarConexionDB();
            producto = new ProductoDAO(coneccion);
        } catch (SQLException e) {
            System.out.println(e);
        }

        ProductoSolido producto1 = new ProductoSolido("Prod03",
                "Falda de Cerdo",
                "bolsa empaquetada de falda de cerdo 1 kg para carnitas",
                23,
                126.5,
                null,
                Categoria.ALIMENTOS,
                Date.valueOf("2024-02-16"));
        producto.guardarProducto(producto1);




    }
}
