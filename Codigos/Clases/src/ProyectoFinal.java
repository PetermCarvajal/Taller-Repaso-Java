import javax.swing.*;

public class ProyectoFinal {

    /*

    Proyecto final:
    1.	Crea una clase llamada CuentaBancaria con los atributos saldo y numeroCuenta.
    2.	Define los métodos depositar (para incrementar el saldo) y retirar (para reducir el saldo si es suficiente).
    3.	Crea objetos de la clase CuentaBancaria y prueba los métodos.

     */

    public static void main(String[] args) {

        cuentaBancaria accion=new cuentaBancaria();
        boolean Salir=false;
do{
    try {
        int input=Integer.parseInt(JOptionPane.showInputDialog(null,"Buenos Días que accion desea realizar \n 1. Depositar \n 2. Retirar \n 3.Salir"));
            switch (input){
                case 1:
                    accion.Depositar();
                    break;
                case 2:
                        accion.Retirar();
                        break;
                case 3:
                    Salir=true;
                    break;
            }

    }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null,"Por Favor Digite un Numero");
    }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error Al Realizar la Opreacion");
        }
}while(!Salir);

    }
}
class cuentaBancaria{

    int Saldo=100000;
    int numCuenta;

    public int setSaldo(int saldo){
        this.Saldo = saldo;
        return Saldo;
    }
    public int setNumCuenta(int numCuenta){
        this.numCuenta = numCuenta;
        return numCuenta;
    }

    public int getSaldo(){
        return Saldo;
    }
    public int getNumCuenta(){
        return numCuenta;
    }
    public void Depositar(){
        int input=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del deposito"));
        Saldo +=input;
        JOptionPane.showMessageDialog(null,"Su Nuevo Saldo es: "+Saldo);
    }
    public void Retirar(){
        int input=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a retirar"));
        if(input>Saldo){
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
        }else {
            Saldo -=input;
            JOptionPane.showMessageDialog(null, "Su Nuevo Saldo es: "+Saldo);
        }
    }
}