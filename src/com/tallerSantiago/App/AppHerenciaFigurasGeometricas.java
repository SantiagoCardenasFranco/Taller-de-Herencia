package com.tallerSantiago.App;

import com.tallerSantiago.FiguraGeometrica.Circulo;
import com.tallerSantiago.FiguraGeometrica.Cuadrado;
import com.tallerSantiago.FiguraGeometrica.FigurasGeometricas;
import com.tallerSantiago.FiguraGeometrica.Triangulo;

public class AppHerenciaFigurasGeometricas {
    public static void main(String[] args) {
        FigurasGeometricas figurasGeometricas = new FigurasGeometricas();
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();

        if(circulo instanceof  FigurasGeometricas)
        {
            System.out.println("Es una figura geometrica, circulo");
        }
        else if(triangulo instanceof  FigurasGeometricas)
        {
            System.out.println("Es una figura geometrica, triangulo");
        }
        else if(cuadrado instanceof  FigurasGeometricas)
        {
            System.out.println("Es una figura geometrica, cuadrado");
        }
    }
}
