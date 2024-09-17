import java.util.ArrayList;

public class Tarea2 {
    /*

    Tarea 2:
    Crea una clase Casa que tenga un objeto de tipo Puerta.
    Haz que la relación sea de composición, de tal manera que cuando un objeto Casa sea destruido, la puerta también lo sea.

    */

    public static void main(String[] args) {

        Casa casa = new Casa("Casa en el Politécnico");


        casa.agregarPuerta("Cocina");
        casa.agregarPuerta("Baño");
        casa.agregarPuerta("Habitación");


        casa.mostrarPuertas();
    }
}

class Puerta {
    String nombre;

    Puerta(String nombre) {
        this.nombre = nombre;
    }
}

class Casa {
    String nombre;
    private ArrayList<Puerta> puertas;

    Casa(String nombre) {
        this.nombre = nombre;
        this.puertas = new ArrayList<>();
    }
    void agregarPuerta(String nombrePuerta) {
        Puerta nuevaPuerta = new Puerta(nombrePuerta);
        puertas.add(nuevaPuerta);
    }
    void mostrarPuertas() {
        System.out.println("Puertas en " + this.nombre + ":");
        for (Puerta puerta : puertas) {
            System.out.println("- " + puerta.nombre);
        }
    }
}
