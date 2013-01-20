package curso.ejercicioacademia;

import java.util.Set;

/**
 * Clase Persona de Academia
 * @author EM
 */
public abstract class Persona {
    
    //private static int idsPersonas = 0;
    
    private int id;
    private String nombre;
    private Set<Asignatura> asignaturas;

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

    public Set<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    
    public void setAsignaturas(Set<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    public abstract void addAsignatura(Asignatura asignatura);
    
    public abstract void removeAsignatura(Asignatura asignatura);

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        hash = 29 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Persona)) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public abstract String toString();

    @Override
    protected abstract Object clone();
    
}
