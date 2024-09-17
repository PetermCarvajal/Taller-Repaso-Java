import javax.swing.*;

public class Tarea2 {

    /*

        Tarea 3
    	Crea una clase Libro con los atributos titulo, autor y numPaginas. Luego, define un objeto miLibro y asigna valores a estos atributos.

     */
    public static void main(String[] args) {

        Libro miLibro = new Libro();

        String Libro=JOptionPane.showInputDialog("Ingrese el titulo del libro");
        String Autor =JOptionPane.showInputDialog("Ingrese el autor del libro");
        int numPaginas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de paginas que tiene libro"));

        miLibro.Constructor(Libro, Autor,numPaginas);
    }

}
class Libro{
    private String titulo;
    private String autor;
    private int numPaginas;

    public String setTitulo(String Titulo){
        this.titulo = Titulo;
        return Titulo;
    }

    public String setAutor(String Autor) {
    this.autor = Autor;
    return Autor;
    }

    public int setNumPaginas(int NumPaginas){
        this.numPaginas = NumPaginas;
        return NumPaginas;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getNumPaginas(){
        return numPaginas;
    }

    public void Constructor(String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        System.out.println("Titulo: "+titulo+"\n Autor: "+autor+"\nNumPaginas: "+numPaginas+"\n Se han Guardado Correctamente");
    }
}