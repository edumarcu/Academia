package curso.ejercicioacademia;

/**
 *
 * @author EM
 */
public class Aula {
    private String nombre;
    private int capacidad;
    private boolean tieneProyector;

    public Aula() {
    }
    
    public Aula(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tieneProyector = false;
    }

    public Aula(String nombre, int capacidad, boolean tieneProyector) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tieneProyector = tieneProyector;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean getTieneProyector() {
        return tieneProyector;
    }

    public void setTieneProyector(boolean tieneProyector) {
        this.tieneProyector = tieneProyector;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        hash = 53 * hash + this.capacidad;
        hash = 53 * hash + (this.tieneProyector ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aula other = (Aula) obj;
        if (this.nombre != other.nombre) {
            return false;
        }
        if (this.capacidad != other.capacidad) {
            return false;
        }
        if (this.tieneProyector != other.tieneProyector) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aula{" + "nombre=" + nombre + ", capacidad=" + capacidad + ", tieneProyector=" + tieneProyector + '}';
    }

    @Override
    public Aula clone() {
        Aula a = new Aula(this.nombre, this.capacidad, this.tieneProyector);
        return a;
    }
    
}
