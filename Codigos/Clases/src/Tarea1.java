import javax.swing.*;

public class Tarea1 {
    /*

    Tarea 1:
	Crea una clase llamada Coche con los atributos marca y modelo. Luego, define dos objetos de tipo Coche.

     */
    public static void main(String[] args) {

        String marca= JOptionPane.showInputDialog("Ingrese la marca");
        String modelo= JOptionPane.showInputDialog("Ingrese la modelo");

        Coche coche= new Coche();
        coche.setModelo(modelo);
        coche.setMarca(marca);

    }
}
class Coche{
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
}
