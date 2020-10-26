package com.tallerSantiago.App;

import com.tallerSantiago.Celular.Celular;
import com.tallerSantiago.Celular.Smarphone;

import java.util.ArrayList;
import java.util.List;

public class AppHerenciaCelular {
    public static void main(String[] args) {
        List<Celular> celulares = new ArrayList<>();
        Celular celular = new Celular();
        Smarphone huawei = new Smarphone();
        Smarphone Motorola = new Smarphone();
        Smarphone Samsung = new Smarphone();
        Smarphone Alcatel = new Smarphone();
        celulares.add(huawei);
        celulares.add(Motorola);
        celulares.add(Samsung);
        celulares.add(Alcatel);

        if(huawei instanceof Celular)
        {
            System.out.println("Es un celular");
        }
        else
        {
            System.out.println("No es un celular");
        }
    }
}
