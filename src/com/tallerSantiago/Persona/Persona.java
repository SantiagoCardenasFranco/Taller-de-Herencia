package com.tallerSantiago.Persona;

public class Persona {
    private String identificacion;
    private String nombre;
    private short edad;
    private double peso;
    private double altura;
    private char genero;

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public short getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public char getGenero() {
        return genero;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public void caminar(){

    }

    public void hablar()
    {

    }

    public short cumplirAnios(short edad){
        setEdad((short) (edad + 1));
        return getEdad();
    }
}
