import javax.swing.*;
public class Tarea3 {
    /*
    Crea un programa que imprima los números del 1 al 10 usando un bucle for.
     */
    String Resultado = "quantity";
    String Resultado2="ar_qty";
    public static void main(String[]args){
        JOptionPane.showMessageDialog(null, "Buenos Días Bienvenido a un Programa  Para las Tablas de Multiplicar Hasta el 10");
        //borrar la modificacion que me permite modificar un comando para minecraft
        //int input=Integer.parseInt(JOptionPane.showInputDialog(null,"Por Favor Ingrese el Número Multiplicando"));
        for (int i=64; i<=7516;i++) {
        //System.out.println("execute @s[hasitem={item=acacia_fence_gate,data=0,location=slot.inventory,slot=0,quantity="+i+"}] ~ ~ ~ scoreboard players set @s ar_qty"+i);
        System.out.println("execute @s[scores={ar_qty="+i+"}] ~ ~ ~ give @s acacia_fence_gate "+i+" 0");
        }
    }
}
