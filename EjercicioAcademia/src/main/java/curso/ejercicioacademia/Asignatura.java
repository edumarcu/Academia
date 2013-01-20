package curso.ejercicioacademia;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Asignatura {
    private static int id;
    private String nombre;
    private Profesor profesor;
    private Aula aula;
    private int horas;
    private Date inicio;
    private Date fin;
    private Set<Alumno> alumnos = new HashSet<Alumno>();
    
    public Asignatura(){
        this.id += 1;
    }
}
