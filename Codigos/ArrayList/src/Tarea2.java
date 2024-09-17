import java.util.ArrayList;
public class Tarea2 {
    /*

    Ejercicio Práctico:
1.	Crea un ArrayList de tipo String llamado frutas.
2.	Añade tres frutas a la lista: "Manzana", "Banana" y "Mango".
3.	Reemplaza "Banana" con "Naranja".
4.	Elimina el primer elemento de la lista.
5.	Imprime el tamaño del ArrayList y el contenido final.

     */
    public static void main(String[] args) {

        ArrayList<String>Frutas=new ArrayList<>();

        Frutas.add("Banana");Frutas.add("Manzana");Frutas.add("Mango");
        System.out.println(Frutas.toString());
        Frutas.set(0,"Naranja");//se Reemplaza el indice 0 Por "Naranja"
        System.out.println(Frutas.toString());
        Frutas.remove(0);
        System.out.println(Frutas.toString());
        System.out.println(Frutas.size());
        System.out.println(Frutas.toString());

    }


}

