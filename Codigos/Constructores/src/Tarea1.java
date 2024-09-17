import javax.swing.*;
public class Tarea1 {
    public static void main(String[]args){
    JOptionPane.showMessageDialog(null,"Buenos Días, Bienvenido al Programa De Diagnostico de Vehiculos");
    String marca=JOptionPane.showInputDialog(null,"Por Favor Ingrese su Marca");
    int modelo =Integer.parseInt(JOptionPane.showInputDialog(null,"Por Favor Ingrese Su Modelo"));
    coche carro=new coche(marca, modelo);
    }

}
class coche{

    private String marca;
    private int modelo;

    public String getMarca(){
        return marca;
    }
    public int getModelo(){
        return modelo;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(int modelo){
        this.modelo=modelo;
    }
    public coche(String marca,int Modelo){//Constructor, con parametros
        this.marca=marca;
        this.modelo=modelo;
        JOptionPane.showMessageDialog(null,"Su Modelo: "+Modelo+" de la Marca: "+marca+" Esta Clasificada como Defectuosa");
    }


}