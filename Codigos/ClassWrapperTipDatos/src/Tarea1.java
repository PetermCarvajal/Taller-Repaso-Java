import javax.swing.*;
import java.util.ArrayList;

public class Tarea1 {

    public static void main(String[] args) {

        // Tipos de Datos PRIMITIVOS

        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;
        float floatValue = 3.4E38f;
        double doubleValue = 1.8308;
        char charValue = 'A';
        boolean booleanValue = true;

        // Tipos de datos No Primitivos

        String hola = "Hola Mundo";


        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(40);
        listaNumeros.add(50);

        System.out.println("Valores del ArrayList:");
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println("Elemento en el índice " + i + ": " + listaNumeros.get(i));
        }

        for (Integer numero : listaNumeros) {
            System.out.println("Elemento: " + numero);
        }

        int[] arrayNumeros = new int[5];
        arrayNumeros[0] = 10;
        arrayNumeros[1] = 20;
        arrayNumeros[2] = 30;
        arrayNumeros[3] = 40;
        arrayNumeros[4] = 50;

        System.out.println("\nValores del array:");
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Elemento en el índice " + i + ": " + arrayNumeros[i]);
        }

        JOptionPane.showMessageDialog(null,"\nValores de los tipos primitivos:");
        JOptionPane.showMessageDialog(null,"byte: " + byteValue);
        JOptionPane.showMessageDialog(null,"short: " + shortValue);
        JOptionPane.showMessageDialog(null,"int: " + intValue);
        JOptionPane.showMessageDialog(null,"long: " + longValue);
        JOptionPane.showMessageDialog(null,"float: " + floatValue);
        JOptionPane.showMessageDialog(null,"double: " + doubleValue);
        JOptionPane.showMessageDialog(null,"char: " + charValue);
        JOptionPane.showMessageDialog(null,"boolean: " + booleanValue);
        JOptionPane.showMessageDialog(null,"String: " + hola);
    }
}
