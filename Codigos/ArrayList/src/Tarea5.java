import javax.swing.*;
import java.util.*;

public class Tarea5 {
    /*

    Ejercicio Práctico Final:
        1.	Crea un ArrayList de nombres de países.
        2.	Verifica si el ArrayList contiene el país "Brasil".
        3.	Imprime el índice de "Argentina" en la lista.
        4.	Borra todos los elementos del ArrayList y verifica si está vacío.

     */
    public static void main(String[] args) {

        ArrayList<String>Paises=new ArrayList<>();

        Paises.add("Colombia");
        Paises.add("Chile");
        Paises.add("Estados Unidos");
        Paises.add("Brasil");
        Paises.add("Argentina");

        if(Paises.contains("Brasil")){
            JOptionPane.showMessageDialog(null,"Buenas Noches El País: Brasil Si se Encuentra");

        }else{
            System.out.println();
        }

        JOptionPane.showMessageDialog(null,Paises.getLast());
        JOptionPane.showMessageDialog(null,Paises.indexOf("Argentina"));
        Paises.removeAll(Paises);
        JOptionPane.showMessageDialog(null,Paises);

    }
}
