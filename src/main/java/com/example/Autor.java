package com.example;

public class Autor {

    // Atributos

    private String idAutor;
    private String nombre;
    private String nacionalidad;
    private int anioNacimiento;

    // Getters

    public String getIdAutor() {
        return idAutor;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    // Setters

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento < 0 )
            System.out.println("Año de nacimiento negaitvo, ingrese otro");
        else {
            this.anioNacimiento = anioNacimiento;
        }
    }

    // Constructores y sus sobrecargas

    public Autor() {}

    public Autor(String idAutor) {
        this.idAutor = idAutor;

        nombre = "Desconocido";
        nacionalidad = "Desconocido";
        anioNacimiento = 0;
    }

    public Autor(String idAutor, String nombre) {
        this.idAutor = idAutor;
        this.nombre = nombre;

        nacionalidad = "Desconocida";
        anioNacimiento = 0;
    }
    
    public Autor(String idAutor, String nombre , String nacionalidad) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;

        anioNacimiento = 0;
    }

    public Autor(String idAutor , String nombre , String nacionalidad , int anioNacimiento ) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;
    }
    
    @Override 

    public String toString() {
        return "Id del autor: " + idAutor + "\nNombre del autor: " + nombre + "\nNacionalidad del autor: " + nacionalidad + "\nAño de nacimiento del autor: " + anioNacimiento;
    }

}
