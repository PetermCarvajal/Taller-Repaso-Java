import javax.swing.*;
import java.util.ArrayList;

public class EjercicioFinal {
    public static void main(String[] args) {

        ArrayList<Animales> animales = new ArrayList<>();

        animales.add(new Labrador());
        animales.add(new Siames());
        animales.add(new Pajaro());

        for (Animales animal : animales) {
            animal.Comer();
            if (animal instanceof Volador) {
                ((Volador) animal).Volador();
            }
        }
    }
}

interface Volador {
    void Volador();
}

abstract class Animales {
    abstract void Comer();
}

class Labrador extends Perro {
    @Override
    public void Volador() {
        JOptionPane.showMessageDialog(null, "El Labrador no puede volar");
    }
}

class Siames extends Gato {
    // No necesita implementar Volador ya que Gato no lo implementa
}

class Pajaro extends Animales implements Volador {
    @Override
    public void Comer() {
        JOptionPane.showMessageDialog(null, "El Pajaro está comiendo");
    }

    @Override
    public void Volador() {
        JOptionPane.showMessageDialog(null, "El Pajaro está volando");
    }
}

abstract class Perro extends Animales implements Volador {
    @Override
    public void Comer() {
        JOptionPane.showMessageDialog(null, "El Perro está comiendo");
    }
}

abstract class Gato extends Animales {
    @Override
    public void Comer() {
        JOptionPane.showMessageDialog(null, "El Gato está comiendo");
    }
}
