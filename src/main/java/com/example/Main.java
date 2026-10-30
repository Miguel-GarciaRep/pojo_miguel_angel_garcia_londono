package com.example;

public class Main {
    public static void main(String[] args) {
        Autor dross = new Autor("3B2K" , "Dross" , "Venezolano");
        Autor esteban = new Autor("332F" , "Esteban" , "Colombiano", 2008);
        Usuario david = new Usuario("22K1", "David" , "davidelproUwU@gmail.com");

        Libro miLibroDePluton = new Libro("3010" , "Mi libro, luna de pluton" , dross , 2026 , 20_000);

        System.out.println(miLibroDePluton.toString());
        System.out.println("================");
        System.out.println(dross.toString());
        System.out.println("================");
        System.out.println(esteban.toString());
        System.out.println("================");
        System.out.println(david.toString());

    }
}