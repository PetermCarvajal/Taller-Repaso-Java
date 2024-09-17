public class Tarea2 {
    public static void main(String[] args) {
        Animal Pajaro=new Ave();
        Pajaro.HacerSonido();
    }
}
class Animal{
    public void HacerSonido(){
        System.out.println("Hacer sonido");
    }
}
class Ave extends Animal {
    public void HacerSonido(){
        System.out.println("El Ave Canta");
    }
}