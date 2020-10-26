package com.tallerSantiago.Celular;

public class Celular {
    private String Serial;
    private String modelo;
    private String marca;
    private double calidadDeLaCamara;
    private double cantidadDeEspacio;
    private String materialDeFabricacion;
    private double tamano;
    private double precio;

    public String getModelo() {
        return modelo;
    }

    public double getCalidadDeLaCamara() {
        return calidadDeLaCamara;
    }

    public String getMaterialDeFabricacion() {
        return materialDeFabricacion;
    }

    public double getTamano() {
        return tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public String getSerial() {
        return Serial;
    }

    public String getMarca() {
        return marca;
    }

    public double getCalidadDeCamara() {
        return calidadDeLaCamara;
    }

    public double getCantidadDeEspacio() {
        return cantidadDeEspacio;
    }

    public void setCantidadDeEspacio(double cantidadDeEspacio) {
        this.cantidadDeEspacio = cantidadDeEspacio;
    }

    public void cargar(){

    }
}
