package com.sanmigueltech.inventariorestaurante.Model;

public class Departamento {
    private String idPuesto;
    private  String nombreDepartamento;

    public Departamento(String idPuesto, String nombreDepartamento) {
        this.idPuesto = idPuesto;
        this.nombreDepartamento = nombreDepartamento;
    }
    public String getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombrePuesto(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }



}
