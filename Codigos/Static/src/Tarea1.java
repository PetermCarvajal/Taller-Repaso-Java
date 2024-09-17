public class Tarea1 {

    /*

    Tarea 1:
    Escribe un programa en Java que defina una clase con una variable static. Crea varios objetos y muestra cómo se comparte la variable entre ellos.

     */

    static class Contador {
        static int contador = 0;

        public static void main(String[] args) {

            while (contador <=20) {
                contador++;

                if (contador == 10) {
                    System.out.println(contador);
                    break;
                }
            }
            while (contador>=-50) {
                System.out.println("Valor Inicial del Contador: "+contador);
                contador--;
                if (contador == -10) {
                    System.out.println(contador);
                    break;
                }
            }
        }
    }
}