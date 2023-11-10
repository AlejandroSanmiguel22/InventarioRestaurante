package com.sanmigueltech.inventariorestaurante.Model;

public class Fabricante {
    private String idFabricante;
    private String nombre;
    private String ciudad;


    public void obtenerFabricantes(){}

    public void obtenerFabricanteID(){}
    public void crearFabricante(){}

    public void actualizarFabricante(){}
    public void eliminarFabricante(){}

    public String getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(String idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
