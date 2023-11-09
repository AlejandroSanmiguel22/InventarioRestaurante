package com.sanmigueltech.inventariorestaurante.Model;

public enum Categoria {
    ALIMENTOS("Alimentos"),
    BEBIDAS("Bebidas"),
    HIGIENE("Higiene"),
    PRODUCTOS_DE_LIMPIEZA("Productos de limpieza");

    private String nombre;
    Categoria(String nombreCategoria) {
        this.nombre = nombreCategoria;
    }
    public String getNombre() {
        return nombre;
    }
}
