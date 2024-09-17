import javax.swing.*;

public class TareaFinal {
    /*

    Ejercicio final:
        1.	Crea una clase ContadorPersonas con una variable static que cuente cuántas personas se han creado.
                Cada vez que crees una nueva instancia de ContadorPersonas, este número debe incrementarse. Además, define un método static que imprima cuántas personas han sido creadas.
        2.	Crea varias instancias de la clase y verifica cómo el contador aumenta en cada creación.

     */

    public static void main(String[] args) {

        ContadorPersonas persona1=new ContadorPersonas();
        ContadorPersonas persona2=new ContadorPersonas();
        ContadorPersonas persona3=new ContadorPersonas();
        ContadorPersonas persona4=new ContadorPersonas();
        ContadorPersonas persona5=new ContadorPersonas();

        ContadorPersonas.MostrarConteo();


    }
}

class ContadorPersonas {
    static int cont=0;
    public ContadorPersonas(){
        cont++;
    }
    static void MostrarConteo(){
        JOptionPane.showMessageDialog(null,"Personas Ingresadas: "+cont);
    }
}