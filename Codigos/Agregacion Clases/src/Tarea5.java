import java.util.ArrayList;

public class Tarea5 {
    public static void main(String[] args) {

        Universidad universidad = new Universidad("Universidad ABC");

        Departamento depInformatica = new Departamento("Informática");
        Departamento depMatematicas = new Departamento("Matemáticas");

        universidad.agregarDepartamento(depInformatica);
        universidad.agregarDepartamento(depMatematicas);

        Profesor prof1 = new Profesor("Dr. Lopez");
        Profesor prof2 = new Profesor("Dra. Martinez");

        depInformatica.agregarProfesor(prof1);
        depInformatica.agregarProfesor(prof2);

        Estudiant est1 = new Estudiant("Juan");
        Estudiant est2 = new Estudiant("Maria");

        depMatematicas.agregarEstudiante(est1);
        depMatematicas.agregarEstudiante(est2);

        Curs curso1 = new Curs("Programación");
        Curs curso2 = new Curs("Algoritmos");

        prof1.agregarCurso(curso1);
        prof2.agregarCurso(curso2);

        est1.inscribirCurso(curso1);
        est2.inscribirCurso(curso2);

        universidad.mostrarDepartamentos();
    }
}

class Universidad {
    String nombre;
    ArrayList<Departamento> departamentos;

    Universidad(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    void mostrarDepartamentos() {
        System.out.println("Departamentos en " + this.nombre + ":");
        for (Departamento departamento : departamentos) {
            departamento.mostrarInformacion();
        }
    }
}

class Departamento {
    String nombre;
    ArrayList<Profesor> profesores;
    ArrayList<Estudiant> estudiantes;

    Departamento(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    void agregarEstudiante(Estudiant estudiante) {
        estudiantes.add(estudiante);
    }

    void mostrarInformacion() {
        System.out.println("Departamento de " + nombre);
        System.out.println("Profesores:");
        for (Profesor profesor : profesores) {
            System.out.println("- " + profesor.nombre);
        }
        System.out.println("Estudiantes:");
        for (Estudiant estudiante : estudiantes) {
            System.out.println("- " + estudiante.nombre);
        }
    }
}

class Profesor {
    String nombre;
    ArrayList<Curs> cursos;

    Profesor(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    void agregarCurso(Curs curs) {
        cursos.add(curs);
    }
}

class Estudiant {
    String nombre;
    ArrayList<Curs> cursos;

    Estudiant(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    void inscribirCurso(Curs curso) {
        cursos.add(curso);
    }
}

class Curs {
    String nombre;

    Curs(String nombre) {
        this.nombre = nombre;
    }
}
