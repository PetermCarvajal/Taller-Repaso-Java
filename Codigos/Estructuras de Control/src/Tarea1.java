import javax.swing.*;
public class Tarea1 {
    /*
    Escribe un código en Java que verifique si un número ingresado por el usuario es par o impar. Usa if-else para resolverlo.
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Buenos Días Bienvenido al Programa para Determinar sI Un Numero es Par");
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Por Favor Ingrese Un Número"));

        if (input == 0) {
            JOptionPane.showMessageDialog(null,input+" Es 0");
        }else if (input%2==0) {
            JOptionPane.showMessageDialog(null,input+" Es Par");
        }else if(input%2!=0){
            JOptionPane.showMessageDialog(null,input+" Es Impar");
        }
    }
}