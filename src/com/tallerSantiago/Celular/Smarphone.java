package com.tallerSantiago.Celular;

public class Smarphone extends Celular{
    private double versionDeAndroid;
    private String tipoDeProcesador;

    public String getTipoDeProcesador() {
        return tipoDeProcesador;
    }

    public double getVersionDeAndroid() {
        return versionDeAndroid;
    }

    public void setVersionDeAndroid(double versionDeAndroid) {
        this.versionDeAndroid = versionDeAndroid;
    }
}
