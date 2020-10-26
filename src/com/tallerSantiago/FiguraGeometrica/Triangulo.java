package com.tallerSantiago.FiguraGeometrica;

public class Triangulo extends FigurasGeometricas {
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea(double base, double altura)
    {
        double resultado;
        setBase(base);
        setAltura(altura);
        resultado = (getBase() * getAltura()) / 2;
        return resultado;
    }
}
