package com.example;

public class Libro {

    // Atributos

    private String isbn;
    private String titulo;
    private Autor autor;
    private int anioPublicacion;
    private double precio;
    private int stock;

    // Getters

    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public int getAnioPublicacicon() {
        return anioPublicacion;
    }
    public double getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }

    // Serrers

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Constructores y sobrecargas

    public Libro() {}

    public Libro(String isbn , String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;

        anioPublicacion = 0;
        precio = 0;
        stock = 0;
    }

    public Libro(String isbn , String titulo, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;

        anioPublicacion = 0;
        precio = 0;
        stock = 0;
    }

    public Libro(String isbn , String titulo, Autor autor , int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;

        precio = 0;
        stock = 0;
    }

    public Libro(String isbn , String titulo, Autor autor , int anioPublicacion , double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
        
        stock = 0;
    }

    public Libro(String isbn , String titulo, Autor autor , int anioPublicacion , double precio , int stock) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
        this.stock = stock;
    }

    @Override 

    public String toString() {
        return "Isbn: " + isbn + "\nTitulo del libro: " + titulo + "\nAutor del libro: " + autor.getNombre() + "\nAño de publicacion: " + anioPublicacion + "\nPrecio del libro: " + precio + "\nStock del libro: " + stock;
    }

}
