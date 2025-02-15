package Programacion.Biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }


    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getAutor() {
        return autor;
    }



    public void setAutor(String autor) {
        this.autor = autor;
    }



    public int getAnio() {
        return anio;
    }



    public void setAnio(int anioPublicacion) {
        this.anio = anioPublicacion;
    }



    @Override
    public String toString() {
        return titulo + " | Autor: " + autor + " | Año: " + anio;
    }
}