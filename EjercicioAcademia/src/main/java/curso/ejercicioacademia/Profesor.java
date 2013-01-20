package curso.ejercicioacademia;

/**
 *
 * @author EM
 */
public class Profesor extends Persona{
    
    private static int idsProfesores = 0;

    public Profesor() {
        setId(idsProfesores);
        idsProfesores++;
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
