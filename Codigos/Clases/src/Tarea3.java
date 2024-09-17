import javax.swing.*;

public class Tarea3 {

    /*

    •	Añade un método llamado mostrarDetalles en la clase Coche, que imprima la marca y modelo del coche.

     */
    public static void main(String[] args) {

        String marca= JOptionPane.showInputDialog("Ingrese la marca");
        String modelo= JOptionPane.showInputDialog("Ingrese la modelo");

        Coche1 coche= new Coche1();
        coche.setModelo(modelo);
        coche.setMarca(marca);
        coche.mostrarDetalle();
    }
}
class Coche1 {
    String marca;
    String Modelo;

    public String setModelo(String Modelo){
        this.Modelo = Modelo;
        return Modelo;
    }
    public String setMarca(String Marca){
        this.marca=Marca;
        return Marca;
    }
    public void mostrarDetalle(){
        JOptionPane.showMessageDialog(null,"Su Carro tiene las Siguientes Caracteristicas \n Marca: "+this.marca+"\n Modelo: "+this.Modelo);
    }
}

