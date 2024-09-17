import javax.swing.*;

public class Tarea5 {
    /*
    Escribe un programa que pida al usuario ingresar un número. El programa seguirá pidiendo números hasta que el usuario ingrese un número positivo. Usa un bucle do-while.
     */
public static void main(String[]args){
    JOptionPane.showMessageDialog(null,"Buenos Días, Bienvenido al Programa Inifito Hasta que");
    int input;
    do{
          input=Integer.parseInt(JOptionPane.showInputDialog(null,"Por Favor Ingrese Un Número Positivo"));
    }while(input<0);
    System.out.println(input);
}
}
