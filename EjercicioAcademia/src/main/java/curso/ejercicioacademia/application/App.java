package curso.ejercicioacademia.application;

import curso.ejercicioacademia.*;

public class App {
    public static void main( String[] args ) {
        Academia aca = new Academia("Aca brothers","Calle falsa 123");
        
        // Alumnos
        Alumno alumnos[] = {
            new Alumno ("Edu Ard"),
            new Alumno ("Miliki pequeño"),
            new Alumno ("Alfredo de los Santos")
        };

        for (Alumno alumno : alumnos){
            aca.add(alumno);
        }
        
        
        
        System.out.println("Academia");
        System.out.println(aca.getAlumnos());
    }
}
