package com.example.alfpa.actividad5;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class Adaptador<Personajes> {
    ArrayList<PersonajeVO> ListaUsuarios;

    public Adaptador(ArrayList<PersonajeVO> listaUsuarios) {
        ListaUsuarios = listaUsuarios;
    }

    public Personajes onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null,false);

        return new Personajes(view);
    }

    public void onBindViewHolder( Personajes holder, int position) {
        holder.Name.setText(ListaUsuarios.get(position).getNomnre());
        holder.Apelli.setText(ListaUsuarios.get(position).getApellido());
        holder.Ed.setText(ListaUsuarios.get(position).getEdad());
    }

    public int getItemCount() {
        return ListaUsuarios.size();
    }
}