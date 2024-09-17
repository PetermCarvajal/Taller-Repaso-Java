import javax.swing.*;
public class Tarea7 {
    public static void main(String[] args) {
        String input= JOptionPane.showInputDialog(null,"Por Favor Ingrese una Frase");
        JOptionPane.showMessageDialog(null,"Su Frase: "+input+"\n \tSu Frase en Mayusculas Sostenidas: "+input.toUpperCase()+"\n \tSu Frase en Minusculas Sostenidas: "+input.toLowerCase());
    }
}
