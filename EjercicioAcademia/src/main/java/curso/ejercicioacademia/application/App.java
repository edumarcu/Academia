package curso.ejercicioacademia.application;

import curso.ejercicioacademia.*;
import java.util.GregorianCalendar;
import java.util.Map;

public class App {
    public static void main( String[] args ) {

        //Persona p = new Alumno ("Edu");
        Academia academia = new Academia("SuperAcademia", "Calle falsa 123");
        System.out.println("Academia: ");
        System.out.println(academia);
        
        // Aulas
        Aula aulas[] = {
            new Aula ("Aula 01",20,true),
            new Aula ("Aula 02",22,true),
            new Aula ("Seminario",12,false),
            new Aula ("Aula magna",40,true)
        };

        for (Aula aula : aulas){
            academia.addAula(aula);
        }
        
        // Profesores
        Profesor profesores[] = {
            new Profesor ("Mr. Hyde"),
            new Profesor ("Señor Astucia"),
            new Profesor ("Jorge Sánchez")
        };

        for (Profesor profesor : profesores){
            academia.addProfesor(profesor);
        }
        
        // Asignaturas       
        GregorianCalendar hora1 = new GregorianCalendar(2013,1,1,9,0,0);
        GregorianCalendar hora2 = new GregorianCalendar(2013,1,1,14,0,0);
        GregorianCalendar hora3 = new GregorianCalendar(2013,1,1,16,0,0);
        GregorianCalendar hora4 = new GregorianCalendar(2013,1,1,20,0,0);
        
        Asignatura asignaturas[] = {
            new Asignatura ("Java",250,hora1.getTime(),hora2.getTime()),
            new Asignatura ("Física",250,hora1.getTime(),hora2.getTime()),
            new Asignatura ("Inglés",200,hora3.getTime(),hora4.getTime()),
            new Asignatura ("Química",50,hora3.getTime(),hora4.getTime()),
            new Asignatura ("Matemáticas",200,hora1.getTime(),hora2.getTime())
        };

        for (Asignatura asignatura : asignaturas){
            academia.addAsignatura(asignatura);
        }
        
        asignaturas[0].setProfesor(profesores[0]);
        asignaturas[1].setProfesor(profesores[0]);
        asignaturas[2].setProfesor(profesores[1]);
        asignaturas[3].setProfesor(profesores[1]);
        asignaturas[4].setProfesor(profesores[2]);
        
        aulas[0].addAsignatura(asignaturas[0]);
        aulas[0].addAsignatura(asignaturas[1]);
        aulas[1].addAsignatura(asignaturas[2]);
        aulas[1].addAsignatura(asignaturas[3]);
        aulas[1].addAsignatura(asignaturas[4]);
                
        // Alumnos
        Alumno alumnos[] = {
            new Alumno ("Edu Ard"),
            new Alumno ("Miliki pequeño"),
            new Alumno ("Julianito"),
            new Alumno ("Jeremias"),
            new Alumno ("Lolo"),
            new Alumno ("Manuel"),
            new Alumno ("Alfredo de los Santos")
        };

        for (Alumno alumno : alumnos){
            academia.addAlumno(alumno);
        }
        
        asignaturas[0].addAlumno(alumnos[0]);
        asignaturas[0].addAlumno(alumnos[1]);
        asignaturas[1].addAlumno(alumnos[0]);
        asignaturas[2].addAlumno(alumnos[1]);
        asignaturas[2].addAlumno(alumnos[2]);
        asignaturas[2].addAlumno(alumnos[3]);
        asignaturas[3].addAlumno(alumnos[2]);
        asignaturas[3].addAlumno(alumnos[3]);
        asignaturas[3].addAlumno(alumnos[4]);
        asignaturas[3].addAlumno(alumnos[5]);
        asignaturas[3].addAlumno(alumnos[6]);
        
        
        System.out.println(printAlumnos(academia));
        System.out.println(printProfesores(academia));
        System.out.println(printAsignaturas(academia));
        System.out.println(printAulas(academia));
        System.out.println("");   
        
        // Alumnos de una Asignatura
        System.out.println("Asignaturas de " + alumnos[2].getNombre());
        System.out.println(alumnos[2].getAsignaturas());
        System.out.println("");
        
        // Asignaturas de cada profesor
        System.out.println("");
        System.out.println("Asignaturas del profesor " + profesores[0].getNombre() 
                            + ": " + profesores[0].getAsignaturas());
        System.out.println("");
        
        // Asignaturas de un Aula
        System.out.println("Asignaturas del Aula " + aulas[1].getNombre());
        System.out.println(aulas[1].getAsignaturas());
        System.out.println("");

        // Asignaturas de cada profesor
        System.out.println("");
        System.out.println("Asignaturas del profesor " + profesores[0].getNombre() 
                            + ": " + profesores[0].getAsignaturas());
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
