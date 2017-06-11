package com.example.nfc.tdp1_app_prueba;

import java.util.LinkedList;

/**
 * Created by User on 11/06/2017.
 */

public class Perfil {

    private static LinkedList<Objetivo> objetivos = new LinkedList<>();

    public static void agregarObjetivo(Objetivo objetivo) {
        Perfil.objetivos.add(objetivo);
    }

    public static LinkedList<String> getNombresDeObjetivos() {
        LinkedList<String> nombres = new LinkedList<>();
        for (Objetivo objetivo: Perfil.objetivos) {
            nombres.add(objetivo.getNombre());
        }
        return nombres;
    }

}
