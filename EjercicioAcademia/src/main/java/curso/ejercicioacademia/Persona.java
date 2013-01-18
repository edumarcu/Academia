package curso.ejercicioacademia;

/**
 * Clase Persona de Academia
 * @author EM
 */
public abstract class Persona {
    
    //private static int idsPersonas = 0;
    
    private int id;
    private String nombre;

    public Persona() {
    }
    
    public Persona(String nombre) {
        this();
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public abstract int hashCode(); 

    @Override
    public abstract boolean equals();

    @Override
    public abstract String toString();
    
    // falta clone y equals
}
