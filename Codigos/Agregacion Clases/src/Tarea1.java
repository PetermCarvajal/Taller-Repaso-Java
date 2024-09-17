import java.util.*;

public class Tarea1 {
/*

Tarea 1:
Crea una clase Curso que contenga una lista de objetos de tipo Estudiante. Cada estudiante debe tener un nombre.
 En la clase Curso, crea un método que imprima los nombres de los estudiantes.

 */
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

            Estudiante estu1 = new Estudiante("Juan");
            Estudiante estu2 = new Estudiante("Maria");
            Estudiante estu3 = new Estudiante("Pedro");

            estudiantes.add(estu1);
            estudiantes.add(estu2);
            estudiantes.add(estu3);

            Curso curso = new Curso("Ingles", estudiantes);

            curso.mostrarEstudiantes();
        }
    }

    class Estudiante {
        String nombre;

        Estudiante(String nombre) {
            this.nombre = nombre;
        }
    }

    class Curso {
        String nombre;
        ArrayList<Estudiante> estudiantes;

        Curso(String nombre, ArrayList<Estudiante> estudiantes) {
            this.nombre = nombre;
            this.estudiantes = estudiantes;
        }

        void mostrarEstudiantes() {
            System.out.println("Estudiantes en el curso de " + this.nombre + ":");
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante.nombre);
            }
        }
    }

