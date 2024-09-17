import javax.swing.*;
/*

Imagina que estás desarrollando un sistema de transporte. Tienes una clase abstracta Vehiculo con un método concreto detener().
    También tienes una interfaz Volador con los métodos despegar(), volar() y aterrizar().
	    Crea una clase Helicoptero que extienda de Vehiculo e implemente la interfaz Volador. Implementa los métodos necesarios.

 */
public class Tarea3 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenidos a el Paseo donde Nada puede malir sal");
        int input=Integer.parseInt(JOptionPane.showInputDialog("No se"));
        Helicoptero helicoptero=new Helicoptero();
        helicoptero.despegar();
        helicoptero.volar();
        helicoptero.detener();
        helicoptero.aterrizar();
    }
}

abstract class Vehiculos {
    void detener(){
    System.out.println(" ");
};
}

interface Volador{

    void despegar();
    void volar();
    void aterrizar();

}

class Helicoptero extends Vehiculos implements Volador{
    public void despegar() {
        System.out.println("Despegando");
    }
    public void aterrizar() {
        System.out.println("Aterrizando");
    }
    public void volar() {
        System.out.println("Volando");
    }
    void detener(){
        System.out.println("Deteniendo");
    }
}