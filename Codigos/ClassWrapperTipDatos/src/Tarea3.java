import javax.swing.*;

public class Tarea3 {

/*
Escribe un programa que realice la conversión entre tipos de datos primitivos, como convertir un double a int y mostrar el resultado.
 */

static  class Conversion{
    public static void main(String[]args){
        double Numero=Double.parseDouble(JOptionPane.showInputDialog(null,"Por Favor Ingrese su Altura"));
        int Numero1=(int)Numero;
        JOptionPane.showMessageDialog(null,"Su Numero es: "+Numero);
        JOptionPane.showMessageDialog(null,"Su Numerro Convertido es: "+Numero1);
    }
}
}
