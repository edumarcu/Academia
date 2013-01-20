package curso.ejercicioacademia.application;

import curso.ejercicioacademia.*;
import java.util.Map;

public class App {
    public static void main( String[] args ) {

        //Persona p = new Alumno ("Edu");
        Academia academia = new Academia("SuperAcademia", "@Academia");
        System.out.println("Academia: ");
        System.out.println(academia);
    }
    
    public String printAsignaturas(Academia academia){
        String str = "Las asignaturas de la academia son: ";
        
        for (Asignatura a : academia.getAsignaturas().values()){
            str += "\n\t" + a.getNombre();
        }
        return str;
    }
    
    public String printProfesores(Academia academia){
        String str = "Los profesores de la academia son: ";
        
        for (Profesor p : academia.getProfesores().values()){
            str += "\n\t" + p.getNombre();
        }
        return str;
    }
    
    public String printAulas(Academia academia){
        String str = "Las aulas de la academia son: ";
        
        for (Aula a : academia.getAulas().values()){
            str += "\n\t" + a.getNombre();
        }
        return str;
    }
    
    public String printAlumnos(Academia academia){
        String str = "Los alumnos de la academia son: ";
        
        for (Alumno a : academia.getAlumnos().values()){
            str += "\n\t" + a.getNombre();
        }
        return str;
<<<<<<< HEAD
=======
>>>>>>> Academia y App
>>>>>>> origin/master
    }
}
