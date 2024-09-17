import javax.swing.*;

        public class Tarea6 {

    /*

    Tarea 6:
    Crea un programa que pida al usuario una frase y una palabra, y luego encuentre la primera posición de esa palabra en la frase.

     */
    public static void main(String[] args) {

        String input=JOptionPane.showInputDialog("Ingrese Una Frase");
        int Resultado=input.indexOf(input);
        JOptionPane.showMessageDialog(null,"La Primera Posición de la Frase Corresponde a: "+Resultado);
    }

}
