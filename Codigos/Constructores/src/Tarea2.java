import javax.swing.*;
public class Tarea2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Buenos Días, Bienvenido a la Biblioteca de Alejandria.");
        String Titulo=JOptionPane.showInputDialog("Ingrese el Titulo");
        String Autor=JOptionPane.showInputDialog("Ingrese el Autor");
        int anio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de Publicación"));

        Libro libro1=new Libro(Titulo,Autor);
        Libro Libro2=new Libro(Titulo,Autor,anio);

    }
}
class Libro{

    private String Titulo;
    private String Autor;
    private int anioPublicacion;

    public String getTitulo(){
        return Titulo;
    }
    public String getAutor(){
        return Autor;
    }
    public int GetAnioPublicacion(){
        return anioPublicacion;
    }

    public void SetTitulo(String Titulo){
        this.Titulo=Titulo;
    }
    public void SetAutor(String Autor){
        this.Autor=Autor;
    }
    public void SetAnioPublicacion(int anioPublicacion){
        this.anioPublicacion=anioPublicacion;
    }

    public Libro(String Titulo,String Autor){
        this.Titulo=Titulo;
        this.Autor=Autor;

        JOptionPane.showMessageDialog(null,"El Autor: "+Autor+" \n del Libro: "+Titulo+"\n Se ha Añadido a la Base de Datos");
    }

    //SobreCarga de Constructores

    public Libro(String Titulo,String Autor,int anioPublicacion){
        this.Titulo=Titulo;
        this.Autor=Autor;
        this.anioPublicacion=anioPublicacion;

        JOptionPane.showMessageDialog(null,"El Autor: "+Autor+"\n del Libro: "+Titulo+"\n Publicado el: "+anioPublicacion+" Se ha Añadido a la Base de Datos");
    }
}