import javax.swing.*;
/*

Ejercicio Práctico:
1.	Crea una interfaz llamada Navegable con los métodos navegar() y detener().
2.	Crea una clase Barco que implemente la interfaz Navegable. Implementa ambos métodos de forma que:
	navegar() imprima: "El barco está navegando".
	detener() imprima: "El barco ha anclado".

 */
public interface Tarea2 {
    static void main(String[] args) {

        Barco barco=new Barco();
        barco.navegar();
        for (int i=999;i<=0;i--){
            if(i==1){
                System.out.println("Usted ha llegado a su Destino");
                barco.detener();
            }
        }
    }
}

interface Navegable {

void navegar();
void detener();

}

class Barco implements Navegable{
    public void navegar(){
        System.out.println("Barco esta Navegando");
    }
    public void detener(){
        System.out.println("El Barco ha Anclado");
    }
}