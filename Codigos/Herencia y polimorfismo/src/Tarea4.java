import javax.swing.*;
abstract class Tarea4 {
    public static void main(String[] args) {

        Guitarra instrumento=new Guitarra();
        instrumento.Tocar();
    }
}
abstract class InstrumentoMusical{

    //Implementa Pero no Define

    abstract void Tocar();
}
class Guitarra extends InstrumentoMusical{

    //Define el metodo De "Tocar"

    void Tocar(){
        System.out.println("Tocando la Guitarra");
    }
}