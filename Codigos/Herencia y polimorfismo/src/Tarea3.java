import javax.swing.*;
public interface Tarea3 {
    static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Buenos Días Bienvenido al Sistema de  Conducción Automatizada : 'Conducción Sonora'");
        Anfibia Conductor=new Anfibia();
        int input=Integer.parseInt(JOptionPane.showInputDialog(null,"Que Desea Hacer el Día de Hoy:\n\t 1. Conducir \n\t 2. Navegar"));

        switch (input){
            case 1:
                Conductor.conducir();
                break;
            case 2:
                Conductor.navegar();
                break;
        }
    }
}
interface Conducible{
   void conducir();
}
interface Navegable{
    void navegar();
}

//2 interfaces a 1 Clase Para la Herencia Multiple

class Anfibia{
    void conducir(){
        System.out.println("Conduciendo Hasta Llegar a mi Destino");
    }
    void navegar(){
        System.out.println("Navegaremos Navegaremos En el Mar el Mar el Mar");
    }
}