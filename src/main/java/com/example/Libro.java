package com.example;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    // Libro1//
    public Libro() {
        titulo = "Desconocido";
        autor = "Anónimo";
        paginas = 0;
    }

    // Libro2//
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        paginas = 0;

    }

    // Libro3//
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }
    
}