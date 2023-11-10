package com.sanmigueltech.inventariorestaurante.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    private String idEmpleado;
    private  Sistema user;
    private  Sistema pass;
     private String nombre;
     private  Puesto puesto;

    public void  registrarse(Sistema user, Sistema pass, String nombre, Puesto puesto){
        

    }

}
