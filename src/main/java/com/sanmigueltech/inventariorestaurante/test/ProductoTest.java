package com.sanmigueltech.inventariorestaurante.test;
import com.sanmigueltech.inventariorestaurante.Model.Categoria;
import com.sanmigueltech.inventariorestaurante.Model.producto.Producto;
import com.sanmigueltech.inventariorestaurante.Model.producto.ProductoSolido;

import java.util.ArrayList;

public class ProductoTest {
    public static void main(String[] args) {
        ArrayList<Producto> listaProduct = Producto.tablaPrducto;
        Producto producto = new Producto();
        producto.setIdProducto("1");
        producto.setNombreProducto("lata de refresco");
        producto.setCategoria(Categoria.BEBIDAS);
        Producto.crearProducto(producto);

        Producto Producto2 = new ProductoSolido("2"
                , "Carne de res",
                10,
                45.5,
                null,
                Categoria.ALIMENTOS,
                null);
        Producto.crearProducto(Producto2);

        for (Producto prod : listaProduct) {
            System.out.printf("ID: %s \nNombre: %s\n\n", prod.getIdProducto(), prod.getNombreProducto());
        }

        Producto2.setNombreProducto("Carne de Res - Costilla");

        Producto prod2 = new ProductoSolido("2"
                , "Carne de Puerco - Costilla",
                10,
                44.5,
                null,
                Categoria.ALIMENTOS,
                null);
        Producto.actualizarProducto(prod2);
        for (Producto prod : listaProduct) {
            System.out.printf("ID: %s \nNombre: %s\n\n", prod.getIdProducto(), prod.getNombreProducto());
        }

        Producto.eliminarProducto(producto);
        for (Producto prod : listaProduct) {
            System.out.printf("ID: %s \nNombre: %s\n\n", prod.getIdProducto(), prod.getNombreProducto());
        }
    }
}
