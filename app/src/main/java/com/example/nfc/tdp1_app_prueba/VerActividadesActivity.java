package com.example.nfc.tdp1_app_prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class VerActividadesActivity extends AppCompatActivity implements View.OnClickListener {

    private Map<Button, Actividad> botonesDeActividades = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_actividades);

        this.mostrarActividades();
    }

    private void mostrarActividades() {

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_ver_actividades);

        for (Actividad actividad: Perfil.getActividadesPendientes()) {
            this.mostrarDatosActividad(actividad, layout);
        }
    }

    private void mostrarDatosActividad(Actividad actividad, ViewGroup layout) {
        TextView datosActividad = new TextView(this);
        datosActividad.setTextSize(20);
        String nombreActividad = actividad.getNombre();
        datosActividad.setText(nombreActividad);
        layout.addView(datosActividad);

        Button botonCompletarActividad = new Button(this);
        botonCompletarActividad.setText("Completar " + nombreActividad);

        this.botonesDeActividades.put(botonCompletarActividad, actividad);
        //Cuando un boton se aprieta, se llama a la funcion onClick de esta clase
        botonCompletarActividad.setOnClickListener(this);
        layout.addView(botonCompletarActividad);
    }



    @Override
    public void onClick(View view) {
        Actividad actividadACompletar = this.botonesDeActividades.get((Button)view);
        actividadACompletar.completar();
    }
}
