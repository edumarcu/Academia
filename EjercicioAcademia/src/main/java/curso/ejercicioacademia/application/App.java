package curso.ejercicioacademia.application;

import curso.ejercicioacademia.*;
import java.util.Map;

public class App {
    public static void main( String[] args ) {

        //Persona p = new Alumno ("Edu");
        Academia academia = new Academia("SuperAcademia", "Calle falsa 123");
        System.out.println("Academia: ");
        System.out.println(academia);
        
        // Alumnos
        Alumno alumnos[] = {
            new Alumno ("Edu Ard"),
            new Alumno ("Miliki pequeño"),
            new Alumno ("Alfredo de los Santos")
        };

        for (Alumno alumno : alumnos){
            academia.add(alumno);
        }
        
        // Profesores
        Profesor profesores[] = {
            new Profesor ("Mr. Hyde"),
            new Profesor ("Señor Astucia"),
            new Profesor ("Jorge Sánchez")
        };

        for (Profesor profesor : profesores){
            academia.add(profesor);
        }
        
        
        //System.out.println(printAlumnos(academia));
        //System.out.println(printProfesores(academia));
    }
    
    public static String printAsignaturas(Academia academia){
        String str = "Las asignaturas de la academia son: ";
        
        for (Asignatura a : academia.getAsignaturas().values()){
            str += "\n\t" + a.getNombre();
        }
        return str;
    }
    
    public static String printProfesores(Academia academia){
        String str = "Los profesores de la academia son: ";
        
        for (Profesor p : academia.getProfesores().values()){
            str += "\n\t" + p.getNombre();
        }
        return str;
    }
    
    public static String printAulas(Academia academia){
        String str = "Las aulas de la academia son: ";
        
        for (Aula a : academia.getAulas().values()){
            str += "\n\t" + a.getNombre();
        }
        return str;
    }
    
    public static String printAlumnos(Academia academia){
        String str = "Los alumnos de la academia son: ";
        
        for (Alumno a : academia.getAlumnos().values()){
            str += "\n\t" + a.getNombre();
        }
        return str;
    }
}
