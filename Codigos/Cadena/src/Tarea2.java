import javax.swing.*;

public class Tarea2 {
    /*

    Tarea 2:
    Escribe un programa en Java que tome una cadena y un número entero del usuario, y muestre el carácter en la posición dada por el número entero.

     */

    public static void main(String[] args) {

        String Input= JOptionPane.showInputDialog("Ingrese Una Frase");
        int input1=Integer.parseInt(JOptionPane.showInputDialog("Por Favor Ingrese la Posicion"));

        JOptionPane.showMessageDialog(null,"El Valor Que Ingrese Corresponde a: "+Input.charAt(input1));
    }
}