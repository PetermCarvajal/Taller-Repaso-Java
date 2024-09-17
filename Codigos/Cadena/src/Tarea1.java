import javax.swing.*;

public class Tarea1 {
    /*

    Tarea 1:
    Escribe un programa en Java que reciba una cadena de texto del usuario e imprima su longitud usando el método length().

     */
    public static void main(String[] args) {

        String input=JOptionPane.showInputDialog(null, "Por Favor Ingrese una Frase");
        JOptionPane.showMessageDialog(null,"Lo Ingresado Cuenta con: "+input.length()+" De longitud");
    }
}
