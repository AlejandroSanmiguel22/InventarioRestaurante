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

        ProductoSolido producto1 = new ProductoSolido("Prod07",
                "Longaniza de puerco verde",
                "bolsa empaquetada de 0.5 kg de longaniza",
                56,
                115.45,
                null,
                Categoria.ALIMENTOS,
                Date.valueOf("2023-12-16"));
        producto.guardarProducto(producto1);




    }
}
