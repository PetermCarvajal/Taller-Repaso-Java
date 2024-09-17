import javax.swing.*;

public class Tarea2 {
    /*

    Tarea 2
    Crea una clase Matematica con varios métodos static que realicen operaciones matemáticas simples.
    Como sumar, restar, multiplicar y dividir. Usa estos métodos sin crear un objeto.

     */
 static class Matematicas{
        static int a;static  int b;
        static void Sumar(){
            int c=a+b;
            System.out.println(c);
        }
        static void Restar(){
            int c=a-b;
            System.out.println(c);
        }
        static void Multiplicar(){
            int c=a*b;
            System.out.println(c);
        }
        static void Dividir(){
            int c=a/b;
            System.out.println(c);
        }

        public static void main(String[] args) {

            a=Integer.parseInt(JOptionPane.showInputDialog(null,"Buenos Dias Por Favor Ingrese 1ro Numero"));
            b=Integer.parseInt(JOptionPane.showInputDialog(null,"Por Favor Ingrese el 2do Numero"));

            Sumar();
            Restar();
            Multiplicar();
            Dividir();

        }
    }
}
