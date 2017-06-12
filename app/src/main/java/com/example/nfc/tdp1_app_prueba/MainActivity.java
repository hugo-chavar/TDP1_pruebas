package com.example.nfc.tdp1_app_prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Por ahora cargo los objetivos aca, para probrarlo
        Perfil.agregarObjetivo(new Objetivo("Obj1"));
        Perfil.agregarObjetivo(new Objetivo("Obj2"));
        Perfil.agregarObjetivo(new Objetivo("Obj3"));
        Perfil.agregarObjetivo(new Objetivo("Obj4"));
    }


    //public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public final static String EXTRA_MESSAGE = "LCDTMAB";

    public void se_clickeo(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edittext);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void irAAgregarActividad(View view) {
        Intent intent = new Intent(this, AgregarActividadActivity.class);
        startActivity(intent);
    }

    public void irAVerObjetivos(View view) {
        Intent intent = new Intent(this, VerObjetivosActivity.class);
        startActivity(intent);
    }

    public void irAVerActividades(View view) {
        Intent intent = new Intent(this, VerActividadesActivity.class);
        startActivity(intent);
    }

    public void irAVerEstadisticas(View view) {
        Intent intent = new Intent(this, GraficoEjemploActivity.class);
        startActivity(intent);
    }

}
