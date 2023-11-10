package com.sanmigueltech.inventariorestaurante.test;

import com.sanmigueltech.inventariorestaurante.Model.producto.Producto;
import com.sanmigueltech.inventariorestaurante.dao.ProductoDAO;
import com.sanmigueltech.inventariorestaurante.factory.ConnectionRefactory;

import java.sql.SQLException;
import java.util.List;

public class ListarProductotest {
    public static void main(String[] args) {
        var factory = new ConnectionRefactory();
        List<Producto> listaProducto = null;
        try {
            ProductoDAO prodDao = new ProductoDAO(factory.recueperarConexionDB());
            listaProducto = prodDao.listar();
            for (Producto productoUnitario : listaProducto) {
            System.out.printf("Id: %s \n" +
                            "Nombre: %s \n" +
                            "Descripcion: %s \n" +
                            "Precio: $%.2f \n" +
                            "Tiene fecha de caducidad: %s\n\n", productoUnitario.getIdProducto(),
                    productoUnitario.getNombreProducto(),
                    productoUnitario.getDescripcion(),
                    productoUnitario.getPrecio(),
                    (productoUnitario.isTieneFechaCaducidad()?"SI":"No"));
        }
        } catch (SQLException e) {
            System.out.println(e);
        }


    }
}
