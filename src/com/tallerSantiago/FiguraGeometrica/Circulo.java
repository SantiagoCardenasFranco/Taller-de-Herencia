package com.tallerSantiago.FiguraGeometrica;

public class Circulo extends FigurasGeometricas {
    private double radio;
    private double diametro;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public double calcularArea(double radio)
    {
        double resultado;
        setRadio(radio);
        resultado = Math.PI * (getRadio() * getRadio());
        return resultado;
    }

    public double calcularPerimetro(double radio2)
    {
        double resultado;
        setRadio(radio2);
        resultado = 2 * Math.PI *  getRadio();
        return resultado;
    }
}
