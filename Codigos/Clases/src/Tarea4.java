public class Tarea4 {

    /*

    Ejercicio interactivo:
	Crea un objeto de la clase Persona y asigna valores a sus atributos. Luego, añade un método que imprima la edad de la persona.


     */
    public static void main(String[] args) {

        Persona persona=new Persona("Carlos",23);
    }
}
class Persona{

    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;

        System.out.println("Persona "+nombre+" Edad:"+edad);
    }

}

