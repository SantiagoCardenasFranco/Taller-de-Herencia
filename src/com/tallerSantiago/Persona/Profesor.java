package com.tallerSantiago.Persona;

public class Profesor extends Persona{
    private String materiaQueEnseña;
    private String nivelDeEducacion;

    public String getMateriaQueEnseña() {
        return materiaQueEnseña;
    }

    public String getNivelDeEducacion() {
        return nivelDeEducacion;
    }

    public void setMateriaQueEnseña(String materiaQueEnseña) {
        this.materiaQueEnseña = materiaQueEnseña;
    }

    public void ensenar(){

    }
}
