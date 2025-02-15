package Programacion.Biblioteca;

public interface InterfazBiblioteca {
    void agregarLibro(Libro libro);
    void agregarLibroPorArrays(Libro libro);
    Libro buscarLibroPorTitulo(String titulo);
    void mostrarLibros();
    void mostrarLibrosPorArrays();

}
