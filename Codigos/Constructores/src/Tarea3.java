public class Tarea3 {
    public static void main(String[] args) {
Casa casa = new Casa();
    }
}
class Casa{

    private String Direccion;

    public String getDireccion(){
        return Direccion;
    }
    public void setDireccion(String direccion){
        Direccion = direccion;
    }

    public Casa(){
        Direccion="\n\nSin Direccion";
        System.out.println(Direccion);
        }
    }
