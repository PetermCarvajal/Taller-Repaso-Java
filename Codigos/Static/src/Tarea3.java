import javax.swing.*;

public class Tarea3 {
    /*

    Tarea 3:
    Crea una clase Juego que tenga una variable static para almacenar el número total de jugadores.
     Cada vez que se cree un nuevo jugador, esta variable debe incrementarse.

     */
}

class Juego{
    static int totalJugadores=0;
    public static void main(String[] args) {
        boolean Salir=false;
        do {
            totalJugadores++;
            if (totalJugadores%5==0) {
                try {
                    System.out.println("Total de Jugadores: " + totalJugadores);
                    int Sal = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Ya Ingresaron Todos los Jugadores? \n\t 1. Si \n\t 2. No"));
                    if (Sal==1) {
                        Salir=true;
                    }
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Debes ingresar un numero");
                }

            }

        }while(!Salir==true);
    }

}
