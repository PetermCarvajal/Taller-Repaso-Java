import javax.swing.*;
/*
Ejercicio Práctico:
1.	Crea una clase abstracta llamada Vehiculo que tenga:
	Un método abstracto acelerar().
	Un método concreto detener(), que imprima "El vehículo se ha detenido".
2.	Luego, crea dos clases que extiendan de Vehiculo: Coche y Bicicleta. Implementa el método acelerar() en cada clase de manera que:
	Coche imprima: "El coche está acelerando".
	Bicicleta imprima: "La bicicleta está acelerando".
 */
public class Tarea1 {
    public static void main(String[] args) {
        Bicicleta bici= new Bicicleta();
        Coche carro=new Coche();

        JOptionPane.showMessageDialog(null,"Buenos Días, Bienvenido a Su Garage Inteligente Que Medio de Transporte Vamos a Usar Hoy");
        int input=Integer.parseInt(JOptionPane.showInputDialog(null,"Por Favor Elija Una Opción \n\t 1. Bicileta \n\t 2. Carro"));
        switch (input){
            case 1:
                bici.Acelerar();
                for (int i=60;i<=0;i++){
                    System.out.println("Tiempo Hasta llegar a Destino: "+i);
                }
                bici.Detener();
                    break;
            case 2:
                carro.Acelerar();
                for (int i=60;i<=0;i++){
                    System.out.println("Tiempo Hasta llegar a Destino: "+i);
                }
                carro.Detener();
                break;
        }
    }
}

abstract class Vehiculo {
    abstract void Acelerar();

    void Detener() {
        System.out.println("El Vehiculo se Ha Detenido");
    }
}

class Coche extends Vehiculo{
    void Acelerar(){
        System.out.println("El Coche esta acelerando");
    }

    @Override
    void Detener() {
        System.out.println("El Coche se Ha Detenido");
    }
}

class Bicicleta extends Vehiculo{
    void Acelerar(){
        System.out.println("La Bicicleta esta acelerando");
    }

    @Override
    void Detener(){
        System.out.println("La Bicicleta se ha Detenido");
    }
}