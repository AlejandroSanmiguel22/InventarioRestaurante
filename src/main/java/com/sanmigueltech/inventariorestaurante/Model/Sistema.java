package com.sanmigueltech.inventariorestaurante.Model;

import java.util.List;

public class Sistema {

    private List<String> ListaEmpelados;
    private String user;
    private  String pass;

    public Sistema(List<String> listaEmpelados, String user, String pass) {
        ListaEmpelados = listaEmpelados;
        this.user = user;
        this.pass = pass;
    }

    public List<String> getListaEmpelados() {
        return ListaEmpelados;
    }

    public void setListaEmpelados(List<String> listaEmpelados) {
        ListaEmpelados = listaEmpelados;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean validarDatos(Empleado empleado){

        boolean validacionDatos = true;
        return validacionDatos;
    }

    public boolean validarCredenciales(String user, String pass){

        Empleado empleado = new Empleado();
        return validarDatos(empleado);
    }


}
