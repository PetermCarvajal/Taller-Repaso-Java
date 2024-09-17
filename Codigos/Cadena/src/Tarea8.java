import javax.swing.*;

public class Tarea8 {

    /*

    Tarea 8:
    Escribe un programa que reemplace todas las ocurrencias de un carácter en una cadena, solicitando el carácter a reemplazar y el nuevo carácter al usuario.

     */

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Buenos Días Por Favor Ingrese una Cadena de Texto");
        String input2 = JOptionPane.showInputDialog(null, "Por Favor Ingrese el Caracter que Desea Reemplazar");
        String input3=JOptionPane.showInputDialog(null, "Por Favor Ingrese con lo que lo va a reemplazar");
        char char1=input2.charAt(0);
        char char2=input3.charAt(0);

        JOptionPane.showMessageDialog(null,"Frase Original: "+input+" \n\t Ha Remplazador Todas las: "+char1+"\n\t Por: "+char2+" Resultado: "+input.replace(char1,char2));
    }

}
