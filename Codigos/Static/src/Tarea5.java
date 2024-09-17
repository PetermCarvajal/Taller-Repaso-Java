import javax.swing.*;

public class Tarea5 {

    /*

    Tarea 5:
    Crea una clase Empresa con una variable static que almacene el nombre de la compañía.
    Agrega un método static que imprima este nombre y un método no estático que imprima el nombre del empleado de la compañía.

     */
}
class Empresa {

    String empleado = "No Existe";
    static String NameCompañia = "TSM";

    public static void Empresa () {
        JOptionPane.showMessageDialog(null, NameCompañia);
    }
    public void empleado () {
        JOptionPane.showMessageDialog(null, "Nombre del Empleado en Turno: " + empleado);
    }

    public static void main(String[] args) {

        Empresa emp = new Empresa();
        emp.Empresa();
        emp.empleado();
    }
}

