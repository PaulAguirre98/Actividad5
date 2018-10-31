package com.example.alfpa.actividad5;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

class Personajes {
    TextView Name, Apelli, Ed;
    public Personajes(@NonNull View itemView) {

        Name = (TextView) itemView.findViewById(R.id.Nombre);
        Apelli = (TextView) itemView.findViewById(R.id.Apellido);
        Ed = (TextView)itemView.findViewById(R.id.Edad);

    }
}