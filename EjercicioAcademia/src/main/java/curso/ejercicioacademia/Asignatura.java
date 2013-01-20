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
<<<<<<< HEAD
    public void add(Alumno alumno){
        alumnos.add(alumno);
    }
    public void set(Profesor profesor){
        this.profesor = profesor;
    }
    
    public void set(Aula aula){
        this.aula = aula;
    }
}

class Profesor{
    
}
class Aula{
    
}
class Alumno{
    
}
=======
}
>>>>>>> origin/Edu
