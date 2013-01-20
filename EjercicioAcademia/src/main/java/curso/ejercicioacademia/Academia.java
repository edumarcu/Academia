package curso.ejercicioacademia;

import java.util.HashMap;
import java.util.Map;

public class Academia {
    private String nombre;
    private String direccion;
    
    Map<Integer,Alumno> alumnos = new HashMap<Integer, Alumno>();
    Map<Integer,Profesor> profesores = new HashMap<Integer, Profesor>();
    Map<Integer,Asignatura> asignaturas = new HashMap<Integer, Asignatura>();
    Map<String,Aula> aulas = new HashMap<String, Aula>();
    
    public void add(Alumno alumno){
        alumnos.put(alumno.getId(),alumno);
    }
    public void add(Profesor profesor){
        profesores.put(profesor.getId(),profesor);
    }
    public void add(Asignatura asignatura){
        asignaturas.put(asignatura.getId(),asignatura);
    }
    public void add(Aula aula){
        aulas.put(aula.getNombre(),aula);
    }
    
    public void remove(Alumno alumno){
        alumnos.remove(alumno.getId());
    }
    public void remove(Profesor profesor){
        profesores.remove(profesor.getId());
    }
    public void remove(Asignatura asignatura){
        asignaturas.remove(asignatura.getId());
    }
    public void remove(Aula aula){
        aulas.remove(aula.getNombre());
    }
    
    public String getAsignaturas(){
        String str = "Las asignaturas de la academia son: ";
        
        for (Asignatura a : asignaturas.values()){
            str += "\n\t" + a.getNombre();
        }
        return str;
    }
}
