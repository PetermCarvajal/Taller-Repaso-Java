import javax.swing.JOptionPane;
public class Tarea2 {
/*
Escribe un programa que reciba un número del 1 al 7 e imprima el día de la semana correspondiente usando un switch.
 */
    public static void main(String[]args){
        JOptionPane.showMessageDialog(null,"Buenos Días, Bienvenido al Programa para Identificar el Dia de la Semana");
        int input=Integer.parseInt(JOptionPane.showInputDialog("Por Favor Ingrese un Número"));
        switch (input){

            case 1:
                JOptionPane.showMessageDialog(null,"Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Domingo");
                break;
            default:
                    JOptionPane.showMessageDialog(null,"Error Entrada Invalida");
                    break;
        }
    }
}
