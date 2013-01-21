package curso.ejercicioacademia;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class Academia {
    private String nombre;
    private String direccion;
    
    Map<Integer,Alumno> alumnos = new HashMap<Integer, Alumno>();
    Map<Integer,Profesor> profesores = new HashMap<Integer, Profesor>();
    Map<Integer,Asignatura> asignaturas = new HashMap<Integer, Asignatura>();
    Map<String,Aula> aulas = new HashMap<String, Aula>();


    public Academia() {
    }
    
    public Academia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void addAlumno(Alumno alumno){
        alumnos.put(alumno.getId(),alumno);
    }
    public void addProfesor(Profesor profesor){
        profesores.put(profesor.getId(),profesor);
    }
    public void addAsignatura(Asignatura asignatura){
        asignaturas.put(asignatura.getId(),asignatura);
    }
    public void addAula(Aula aula){
        aulas.put(aula.getNombre(),aula);
    }
    
    public void removeAlumno(Alumno alumno){
        alumnos.remove(alumno.getId());
    }
    public void removeProfesor(Profesor profesor){
        profesores.remove(profesor.getId());
    }
    public void removeAsignatura(Asignatura asignatura){
        asignaturas.remove(asignatura.getId());
    }
    public void removeAula(Aula aula){
        aulas.remove(aula.getNombre());
    }
   
    public HashMap<Integer,Asignatura> getAsignaturas(){     
        return (HashMap) asignaturas;
    }
    
    public HashMap<Integer,Profesor> getProfesores(){     
        return (HashMap) profesores;
    }
        
    public HashMap<String,Aula> getAulas(){     
        return (HashMap) aulas;
    }
            
    public HashMap<Integer,Alumno> getAlumnos(){     
        return (HashMap) alumnos;
    }       

    @Override
    public String toString() {
        return "Academia{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
}
