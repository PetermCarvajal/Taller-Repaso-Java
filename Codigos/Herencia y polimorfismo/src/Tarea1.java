public class Tarea1 {

    public static void main(String[] args) {
        Coche v1 = new Coche();
        v1.Mover();
    }

}
class Vehiculo{

    private int velocidadMaxima;

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public void Mover(){
        System.out.println("Moviendo");
    }
}
class Coche extends Vehiculo{

    private int velocidadMaxima;

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    public void Mover(){
        System.out.println("El Coche se Mueve");
    }

}
