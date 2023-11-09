package com.sanmigueltech.inventariorestaurante.Model;

import java.util.ArrayList;

public class Empleado {

    private String idEmpleado;
    private  Sistema user;
    private  Sistema pass;
     private String nombre;
     private  Puesto puesto;

    public Empleado() {
    }
    public Empleado(String idEmpleado, Sistema user, Sistema pass, String nombre, Puesto puesto) {
        this.idEmpleado = idEmpleado;
        this.user = user;
        this.pass = pass;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Sistema getUser() {
        return user;
    }

    public void setUser(Sistema user) {
        this.user = user;
    }

    public Sistema getPass() {
        return pass;
    }

    public void setPass(Sistema pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public void  registrarse(Sistema user, Sistema pass, String nombre, Puesto puesto){
        

    }

}
