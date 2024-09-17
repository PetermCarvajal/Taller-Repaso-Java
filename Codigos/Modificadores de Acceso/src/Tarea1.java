import javax.swing.*;
public class Tarea1 {
/*
Tarea 1: Usar private
Escribe una clase llamada Coche con los atributos private marca y modelo. Luego, crea métodos públicos setMarca, getMarca, setModelo, y getModelo para asignar y obtener el valor de estos atributos.
 */
    public static void main(String[]args){
        Coche carro = new Coche();
        JOptionPane.showMessageDialog(null,"Buenos Días Bienvenido a el Programa para Privatizar Los Valores de ... que contiene  una Clase");
        int Modelo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Modelo de su Coche"));
        String Marca=JOptionPane.showInputDialog("Ingrese la Marca de su Coche");
        carro.setMarca(Marca);
        carro.setModelo(Modelo);
        JOptionPane.showMessageDialog(null,"Su Coche: "+carro.getMarca()+"\n Identificado con el Modelo: "+carro.getModelo()+"\n\t Ha sido Confirmado como un Vehiculo Defectuoso");
    }
}
class Coche {
    private int modelo;
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public int getModelo(){
        return modelo;
    }

    public void setModelo(int modelo){
        this.modelo=modelo;
    }
}
