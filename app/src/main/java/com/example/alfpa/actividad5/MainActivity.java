package com.example.alfpa.actividad5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<PersonajeVO> ListaUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListaUsuario = new ArrayList<>();


        Llenarpersonajes();
        Adaptador adapter = new Adaptador(ListaUsuario);

    }

    private void Llenarpersonajes() {
        ListaUsuario.add(new PersonajeVO("Paul", "Aguirre", "20"));
        ListaUsuario.add(new PersonajeVO("Nelson", "Herrera", "20"));
        ListaUsuario.add(new PersonajeVO("Alfredo", "Aguirre", "45"));
        ListaUsuario.add(new PersonajeVO("Angel", "Aguirre", "16"));
        ListaUsuario.add(new PersonajeVO("Diana", "Garcia", "19"));
    }
}