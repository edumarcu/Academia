package curso.ejercicioacademia;

/**
 *
 * @author EM
 */
public class Aula {
    private int nombre;
    private int capacidad;

    public Aula() {
    }
    
    public Aula(int nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    
    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.nombre;
        hash = 79 * hash + this.capacidad;
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
        return true;
    }

    @Override
    public String toString() {
        return "Aula{" + "nombre=" + nombre + ", capacidad=" + capacidad + '}';
    }

    @Override
    public Aula clone() {
        Aula a = new Aula(this.nombre, this.capacidad);
        return a;
    }
    
}
