import javax.swing.*;

public class Tarea2 {
    /*
    Tarea 2: Usar public
    Escribe una clase llamada Persona con el atributo public nombre y un método public llamado saludar() que imprima un saludo con el nombre de la persona.
     */

    public static void main(String[]args){
        Persona Algo=new Persona();
        String Nombre=JOptionPane.showInputDialog(null,"Buenos Días por favor Ingrese su Nombre");
        Algo.setNombre(Nombre);
        Algo.Saludar(Nombre);
}
static class Persona{

    public String nombre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void Saludar(String nombre){
        JOptionPane.showMessageDialog(null,"Buenos Días "+nombre);
        }
    }
}
