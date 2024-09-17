import java.util.ArrayList;

public class Tarea4 {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Dame la Mano Paloma");
        Autor autor2 = new Autor("First Think First");

        autor1.escribirLibro("Cien Dias al Sol");
        autor1.escribirLibro("Del Amor Al Odio");

        autor2.escribirLibro("YA no se ");
        autor2.escribirLibro("Que mas Poner");

        autor1.mostrarLibros();
        autor2.mostrarLibros();
    }
}

class Libro2 { //me sale que hay 3 Problemas relacionados con la casle Libro1? y Libro Creo
    String titulo;

    Libro2(String titulo) {
        this.titulo = titulo;
    }
}

class Autor {
    String nombre;
    ArrayList<Libro2> libros;

    Autor(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    void escribirLibro(String titulo) {
        Libro2 nuevoLibro = new Libro2(titulo);
        libros.add(nuevoLibro);
    }

    void mostrarLibros() {
        System.out.println("Libros de " + this.nombre + ":");
        for (Libro2 libro : libros) {
            System.out.println("- " + libro.titulo);
        }
    }
}
