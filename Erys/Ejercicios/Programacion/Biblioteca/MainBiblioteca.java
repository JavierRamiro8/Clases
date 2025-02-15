package Programacion.Biblioteca;

import java.util.Scanner;

public class MainBiblioteca {
    public static InterfazBiblioteca biblioteca = new Biblioteca();
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            while (true) {
                System.out.println("\n=== Biblioteca ===");
                System.out.println("1. Agregar libro");
                System.out.println("2. Buscar libro por título");
                System.out.println("3. Mostrar todos los libros");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
    
                switch (opcion) {
                    case 1:
                        agregarLibro();
                        break;
                    case 2:
                        System.out.print("Ingrese el título del libro a buscar: ");
                        String tituloBuscar = scanner.nextLine();
                        Libro encontrado = biblioteca.buscarLibroPorTitulo(tituloBuscar);
                        if (encontrado != null) {
                            System.out.println("Libro encontrado: " + encontrado);
                        } else {
                            System.out.println("Libro no encontrado.");
                        }
                        break;
                    case 3:
                        biblioteca.mostrarLibrosPorArrays();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }
        public static void agregarLibro(){
            Scanner scanner= new Scanner(System.in);
            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();
            while(titulo.isEmpty()){
                System.out.print("rellena el campo titulo:");
                titulo = scanner.nextLine();
            }
            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();
            while(autor.isEmpty()){
                System.out.print("rellena el campo autor:");
                autor = scanner.nextLine();
            }
            System.out.print("Ingrese el año de publicación: ");
            int anio = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            biblioteca.agregarLibroPorArrays(new Libro(titulo, autor, anio));
    }
}
