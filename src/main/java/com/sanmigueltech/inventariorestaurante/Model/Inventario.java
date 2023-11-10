package com.sanmigueltech.inventariorestaurante.Model;

import com.sanmigueltech.inventariorestaurante.Model.producto.Producto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inventario {

    private String idAlmacen;
    private Producto producto;

    private int catidadStock;

}
