package com.example;

public class Usuario {

    // Atributos

    private String idUsuario;
    private String nombre;
    private String correoElectronico;
    private int librosPrestados;

    // Getters

    public String getIdUsuario() {
        return idUsuario;
    }
    public String getNombre() {
        return idUsuario;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public int getLibrosPrestados() {
        return librosPrestados;
    }

    // Setters

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    // Constructores y sobrecargas

    public Usuario() {}

    public Usuario(String idUsuario , String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;

        correoElectronico = "Desconocido";
        librosPrestados = 0;
    }

    public Usuario(String idUsuario , String nombre , String correoElectronico) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;

        librosPrestados = 0;
    }

    public Usuario(String idUsuario , String nombre , String correoElectronico , int librosPrestados) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;

        this.librosPrestados = librosPrestados;
    }

    @Override

    public String toString() {
        return "Id de usuario: "+ idUsuario + "\nNombre de usuario: " + nombre + "\nCorreo electronico: " + correoElectronico + "\nLibros prestados: " + librosPrestados;
    }
}
