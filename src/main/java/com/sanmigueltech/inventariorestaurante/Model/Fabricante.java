package com.sanmigueltech.inventariorestaurante.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Fabricante {
    private String idFabricante;
    private String nombre;
    private String ciudad;
}
