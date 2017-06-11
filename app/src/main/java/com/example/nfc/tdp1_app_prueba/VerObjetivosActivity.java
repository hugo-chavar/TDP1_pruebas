package com.example.nfc.tdp1_app_prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class VerObjetivosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_objetivos);

        this.mostrarObjetivos();
    }

    private void mostrarObjetivos() {

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_ver_objetivos);

        for (Objetivo objetivo: Perfil.getObjetivos()) {
            TextView datosObjetivo = new TextView(this);
            datosObjetivo.setTextSize(20);
            String textoObjetivo = objetivo.getNombre();
            if (objetivo.tieneActividades()) {
                textoObjetivo = textoObjetivo + "   Progreso:" + objetivo.getProgreso() + "%/100%";
            }
            datosObjetivo.setText(textoObjetivo);
            layout.addView(datosObjetivo);
        }
    }
}
