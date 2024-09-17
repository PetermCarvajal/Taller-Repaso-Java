import javax.swing.*;

public class Tarea3 {
    /*

    Tarea 3:
    Crea un programa que solicite al usuario una cadena y dos números. El programa debe imprimir la subcadena correspondiente entre esos dos índices.

     */
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog(null,"Buenos Días Por Favor Ingrese Una Cadena de Texto");
        int n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un segundo numero"));
        JOptionPane.showMessageDialog(null,input.substring(n1,n2));
    }
}
