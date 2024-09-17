import java.util.*;
import javax.swing.*;
public class Tarea3 {
    /*

    Ejercicio Práctico:
        1.	Crea un ArrayList llamado ciudades.
        2.	Añade las ciudades "Madrid", "Barcelona" y "Valencia".
        3.	Usa un bucle for para recorrer el ArrayList y mostrar cada ciudad.

     */
    public static void main(String[] args) {
        ArrayList<String>Ciudades=new ArrayList<>();

        Ciudades.add("Madrid");
        Ciudades.add("Barcelona");

        JOptionPane.showMessageDialog(null,"Buenos Días y Bienvenido Mudanzas Express");
        String input=JOptionPane.showInputDialog(null,"Por Favor Ingrese Su Ciudad");

        Ciudades.add(input);
        //Contador;Nombre del Array.Tamaño();Contador ++ O --
        for(int i=0;i<Ciudades.size();i++){
            JOptionPane.showMessageDialog(null,Ciudades.get(i));
            System.out.println(Ciudades.get(i));
            //nombre del Array .Obtener(Contador que en este caso hace de  posicion del index)
        }
    }

}
