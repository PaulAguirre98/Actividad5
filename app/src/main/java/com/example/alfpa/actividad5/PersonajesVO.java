package com.example.alfpa.actividad5;

public class PersonajeVO {
    private String Nomnre;
    private  String Apellido;
    private String edad;
    public PersonajeVO(){


    }
    public PersonajeVO(String nomnre, String apellido, String edad) {
        Nomnre = nomnre;
        Apellido = apellido;
        this.edad = edad;
    }

    public String getNomnre() {
        return Nomnre;
    }

    public void setNomnre(String nomnre) {
        Nomnre = nomnre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Integer.parseInt(edad);
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}