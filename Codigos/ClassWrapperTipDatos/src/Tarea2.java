import javax.swing.*;

public class Tarea2 {
    /*
    Crea una clase Persona con atributos nombre (de tipo String) y edad (de tipo int). Luego, crea un objeto de esta clase y muestra sus atributos
     */

    static class Persona{
        String Nombre;
        int Edad;

        public int getEdad(){
            return Edad;
        }
        public String getNombre(){
            return Nombre;
        }
        public void setEdad(int edad){
            Edad=edad;
        }
        public void setNombre(String nombre){
            Nombre=nombre;
        }

}
public static void main(String[]args){
Persona persona1=new Persona();

String Nombre=JOptionPane.showInputDialog(null,"Por Favor Ingrese Su Nombre");
int Edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Por Favor Ingrese Su Edad"));

    persona1.setEdad(Edad);
    persona1.setNombre(Nombre);

    JOptionPane.showMessageDialog(null,"Usted Se llama: "+persona1.getNombre()+"\n Edad: "+persona1.getEdad());
    }
}