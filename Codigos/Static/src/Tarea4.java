import javax.swing.*;

public class Tarea4 {
    /*

    Tarea 4:
    Escribe un programa que use un bloque static para inicializar una variable static con un valor predefinido.
      muestre un mensaje cuando se cargue la clase.

     */
    public static void main(String[] args) {
        Predefinida N= new Predefinida();

    }
}
class Predefinida{
    static int iniciador;
    static {
        iniciador = 1999;
        JOptionPane.showMessageDialog(null,"Si Funca");
    }
/*
             //No seria Mejor Hacer Esto:
    class Predefinida { // Si  funciona
        static int Iniciador = 1999;
            static{
                    JOptionPane.showMessageDialog(null,"Si Funca");
    }
    */

}
