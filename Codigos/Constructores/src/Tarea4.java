import javax.swing.*;

public class Tarea4 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Bienvenidos A TonatiusSchool");

        String nombre=JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        String curso=JOptionPane.showInputDialog("Ingrese el curso del estudiante");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante"));

        Estudiante estudiante=new Estudiante(nombre,edad);
        Estudiante estudiante1=new Estudiante(nombre,curso,edad);
    }
}
class Estudiante{

    private String nombre;
    private String curso;
    private int edad;

    public String getNombre(){
        return nombre;
    }
    public String getCurso(){
        return curso;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    public  Estudiante(String nombre,int edad){

        this.nombre=nombre;
        this.edad=edad;

        JOptionPane.showMessageDialog(null,"Buenos Días Estudiante "+nombre+" de "+edad+" Años Curso Sin Asignar");
    }

    public Estudiante(String nombre,String curso,int edad){
        this(nombre,edad);
        this.curso=curso;

        JOptionPane.showMessageDialog(null,"Buenos Días Estudiante "+nombre+" de "+edad+" Años Cursando "+curso);
    }
}
