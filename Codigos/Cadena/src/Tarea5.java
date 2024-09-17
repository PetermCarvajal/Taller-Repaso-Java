import javax.swing.*;

public class Tarea5 {
    /*

    Tarea 5:
    Modifica el programa anterior para que ignore las diferencias entre mayúsculas y minúsculas al comparar las cadenas.

     */
    public static void main(String[] args) {

        String input3= JOptionPane.showInputDialog("Ingrese El Primer Texto");
        String input4= JOptionPane.showInputDialog("Ingrese El Segundo Texto");

        boolean n=input3.equalsIgnoreCase(input3);
        boolean n2=input4.equalsIgnoreCase(input4);/* ? y eso para que sirve */


        JOptionPane.showMessageDialog(null,"Cadena Original: "+input3+" Cadena Modificada: "+n);
        JOptionPane.showMessageDialog(null,"Cadena Original: "+input4+" Cadena Modificada: "+n2);
    }
    }
