import javax.swing.*;
public class Tarea5 {
    public static void main(String[] args) {
        Estudiante Est =new Estudiante();
        Est.Hablar();
    }
}

class Persona{
    public void Hablar(){
        System.out.println("Balbuseando");
    }
}
class Estudiante extends Persona{
    public void Hablar(){
        super.Hablar();//LLamando el Metodo "Hablar"
        JOptionPane.showMessageDialog(null,"Hablando");
    }
}

