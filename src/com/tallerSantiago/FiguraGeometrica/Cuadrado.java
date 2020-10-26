package com.tallerSantiago.FiguraGeometrica;

public class Cuadrado extends FigurasGeometricas {
    private double tamañoDeLado;

    public double getTamañoDeLado() {
        return tamañoDeLado;
    }

    public void setTamañoDeLado(double tamañoDeLado) {
        this.tamañoDeLado = tamañoDeLado;
    }

    public double calcularArea(double tamañoDeLado)
    {
        double resultado;
        setTamañoDeLado(tamañoDeLado);
        resultado = (getTamañoDeLado() * getTamañoDeLado());
        return resultado;
    }

    public double calcularPerimetro(double tamañoDeLado, byte cantidadDeAristas)
    {
        double resultado;
        setTamañoDeLado(tamañoDeLado);
        setCantidadDeAristas(cantidadDeAristas);
        resultado = getTamañoDeLado() * getCantidadDeAristas();
        return resultado;
    }
}
