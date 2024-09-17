import javax.swing.*;

public class Tarea4 {
    /*

    Tarea 4:
    Escribe un programa que pida dos cadenas al usuario y verifique si son iguales, usando el método equals().

     */
    public static void main(String[] args) {
    String input= JOptionPane.showInputDialog("Ingrese El Primer Texto");
    String input2= JOptionPane.showInputDialog("Ingrese El Segundo Texto");
        if(input.equals(input2)==true){
            JOptionPane.showMessageDialog(null, "Los 2 Textos son Iguales");
        }else {
            JOptionPane.showMessageDialog(null, "Los 2 Textos son Diferentes");
        }
    }
}
