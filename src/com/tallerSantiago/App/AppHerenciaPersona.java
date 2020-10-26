package com.tallerSantiago.App;

import com.tallerSantiago.Persona.Estudiante;
import com.tallerSantiago.Persona.Persona;
import com.tallerSantiago.Persona.Profesor;

public class AppHerenciaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();

        if (estudiante instanceof Persona && profesor instanceof Persona)
        {
            System.out.println("Ambos son personas");
        }
    }
}
