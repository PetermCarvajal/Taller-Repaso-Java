import java.util.*;
import javax.swing.*;

public class Tarea4 {
    /*

    Ejercicio Práctico:
        1.	Crea una clase Libro con los atributos titulo y autor.
        2.	Crea un ArrayList llamado biblioteca que almacene objetos de tipo Libro.
        3.	Añade al menos tres libros a la lista.
        4.	Usa un bucle para imprimir el título y autor de cada libro.

     */
    public static void main(String[] args) {

        ArrayList<String>Biblioteca=new ArrayList<>();

        JOptionPane.showMessageDialog(null,"Buenos Días Bienvenido a la Biblioteca de put mierda");
        String input;
        String input1;

        int Contador=1;
        while (Contador<=3){
            input=JOptionPane.showInputDialog("Ingrese el Nombre del Libro");
            input1=JOptionPane.showInputDialog("Ingrese el Autor del Libro");
            Biblioteca.add(input);
            Biblioteca.add(input1);
            Contador++;
        }

        for(int i=0;i<Biblioteca.size();i++){
            System.out.println(Biblioteca.get(i));
        }


    }
}
class Libro{

    private String Titulo;
    private String Autor;


/*
 Modificador de Acceso | Tipo de Dato | getNombredelAtributo(){
    return NombredelAtributo;
*/
    public String getTitulo(){
        return Titulo;
    }
    public String getAutor(){
        return Autor;
    }
/*
    Modificador de Acceso | void | setNombredelAtributo(Tipo de Dato NombredelAtributo){
(Por Buenas Practicas)this.NombredelAtributo=NombredelAtributo;

 */
    public void setTitulo(String Titulo){
        this.Titulo=Titulo;
    }
    public void setAutor(String Autor){
        this.Autor=Autor;
    }

}