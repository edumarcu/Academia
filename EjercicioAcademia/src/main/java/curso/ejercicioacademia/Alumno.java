package curso.ejercicioacademia;

/**
 *
 * @author EM
 */
public class Alumno extends Persona{
    
    private static int idsAlumnos = 0;

    public Alumno() {
        setId(idsAlumnos);
        idsAlumnos++;
    }

    public Alumno(String nombre) {
        this();
        setNombre(nombre);        
    } 

    @Override
    public String toString() {
        return "Alumno{" + "id=" + this.getId() + ", nombre="
                                 + this.getNombre() + '}';
    }

    @Override
    protected Alumno clone() {
        Alumno a = new Alumno(this.getNombre());
 
        return a;
    }
}
