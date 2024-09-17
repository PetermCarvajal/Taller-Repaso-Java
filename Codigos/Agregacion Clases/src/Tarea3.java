import java.util.ArrayList;

public class Tarea3 {
    /*

   Tarea 3:
    Implementa un sistema en el que una clase Biblioteca tenga una relación de agregación con varias Libros,
    donde cada libro tenga un título y un autor. Crea un método en la clase Biblioteca para mostrar la lista de libros.

     */
        public static void main(String[] args) {

            Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
            Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
            Libro libro3 = new Libro("La sombra del viento", "Carlos Ruiz Zafón");


            Biblioteca biblioteca = new Biblioteca("Biblioteca Central");


            biblioteca.agregarLibro(libro1);
            biblioteca.agregarLibro(libro2);
            biblioteca.agregarLibro(libro3);


            biblioteca.mostrarLibros();
        }
    }

    class Libro {
        String titulo;
        String autor;

        Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }
    }

    class Biblioteca {
        String nombre;
        ArrayList<Libro> libros;

        Biblioteca(String nombre) {
            this.nombre = nombre;
            this.libros = new ArrayList<>();
        }

        void agregarLibro(Libro libro) {
            libros.add(libro);
        }

        void mostrarLibros() {
            System.out.println("Libros en " + this.nombre + ":");
            for (Libro libro : libros) {
                System.out.println("- " + libro.titulo + " por " + libro.autor);
            }
        }
    }