package com.example.nfc.tdp1_app_prueba;

import android.os.StrictMode;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class AgregarActividadActivity extends AppCompatActivity {

    private Map<Integer, TextView> textosFechas = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_actividad);

        //Deberia inicializarlo aca?, en el onCreate?
        this.textosFechas.put(R.id.buttonInicioActividad, (TextView) findViewById(R.id.textViewInicioActividad) );
        this.textosFechas.put(R.id.buttonFinActividad, (TextView) findViewById(R.id.textViewFinActividad) );

        String[] prioridades = new String[] {"ALTA", "MEDIA", "BAJA"};
        Spinner spinnerPrioridades = (Spinner) findViewById(R.id.spinnerPrioridades);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, prioridades);
        spinnerPrioridades.setAdapter(adapter);
    }


    public void mostrarDatePicker(View view) {
        TextView textoFecha = this.textosFechas.get(view.getId());
        DatePickerFragment datePickerFragment = new DatePickerFragment();
        datePickerFragment.setTextView(textoFecha);
        datePickerFragment.show(getSupportFragmentManager(), "Ingrese una fecha");
    }
}
