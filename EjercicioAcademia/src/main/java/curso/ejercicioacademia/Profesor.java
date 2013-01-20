package curso.ejercicioacademia;

import java.util.HashSet;

/**
 *
 * @author EM
 */
public class Profesor extends Persona{
    
    private static int idsProfesores = 0;

    public Profesor() {
        setId(idsProfesores);
        idsProfesores++;
        setAsignaturas(new HashSet<Asignatura>());
    }

    public Profesor(String nombre) {
        this();
        setNombre(nombre);        
    }
    
    @Override
    public String toString() {
        return "Profesor{" + "id=" + this.getId() + ", nombre="
                                 + this.getNombre() + '}';
    }

    @Override
    protected Profesor clone() {
        Profesor p = new Profesor(this.getNombre());
 
        return p;
    }
}
