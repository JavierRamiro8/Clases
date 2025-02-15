package Programacion.Biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca implements InterfazBiblioteca {
    protected List<Libro> libros = new ArrayList<>();
    protected String[] libroAutor = new String[10];
    protected String[] libroTitulo = new String[10];
    protected int[] libroAnio = new int[10];
    protected int contadorLibros=0;

    @Override
    public void agregarLibroPorArrays(Libro libro) {
        if(contadorLibros<libroAutor.length){
            libroAutor[contadorLibros]=libro.getAutor();
            libroAnio[contadorLibros]=libro.getAnio();
            libroTitulo[contadorLibros]=libro.getTitulo();
            contadorLibros++;
        }else{
            System.out.println("La libreria esta llena, no puedes meter mas libros");
        }
    }

    @Override
    public void mostrarLibrosPorArrays() {
        for (int i = 0; i < contadorLibros; i++) {
            System.out.println("se ha creado el siguiente libro:"+libroAutor[i]+" "+libroTitulo[i]+" "+ libroAnio[i]);
        }
    }

    @Override
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado correctamente.");
    }

    @Override
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Lista de libros en la biblioteca:");
            for (Libro libro : libros) {
                System.out.println("- " + libro);
            }
        }
    }
}

