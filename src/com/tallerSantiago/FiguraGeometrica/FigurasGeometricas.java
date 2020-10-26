package com.tallerSantiago.FiguraGeometrica;

public class FigurasGeometricas {
    private String forma;
    private double perimetro;
    private double area;
    private short cantidadDeVertices;
    private byte cantidadDeAristas;

    public String getForma() {
        return forma;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public short getCantidadDeVertices() {
        return cantidadDeVertices;
    }

    public byte getCantidadDeAristas() {
        return cantidadDeAristas;
    }

    public void setCantidadDeVertices(short cantidadDeVertices) {
        this.cantidadDeVertices = cantidadDeVertices;
    }

    public void setCantidadDeAristas(byte cantidadDeAristas) {
        this.cantidadDeAristas = cantidadDeAristas;
    }
}
