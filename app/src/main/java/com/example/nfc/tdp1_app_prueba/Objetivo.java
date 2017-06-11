package com.example.nfc.tdp1_app_prueba;

import java.util.LinkedList;

/**
 * Created by User on 11/06/2017.
 */

public class Objetivo {

    private String nombre;
    private LinkedList<Actividad> actividades;

    public Objetivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void agregarActividad(Actividad actividad){
        this.actividades.add(actividad);
    }

    public String toString() {
        return this.nombre;
    }
}
