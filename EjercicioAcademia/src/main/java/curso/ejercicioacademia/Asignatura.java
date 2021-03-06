package curso.ejercicioacademia;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Asignatura {
    private static int idsAsignaturas = 0;
    private int id = 0;
    private String nombre;
    private Profesor profesor;
    private Aula aula;
    private int horas;
    private Date inicio;
    private Date fin;
    private Set<Alumno> alumnos = new HashSet<Alumno>();
    
    public Asignatura(){
        setId(idsAsignaturas);
        idsAsignaturas++;
    }

    public Asignatura(String nombre) {
        this();
        this.nombre = nombre;
    }

    public Asignatura(String nombre, int horas, Date inicio, Date fin) {
        this();
        this.nombre = nombre;
        this.horas = horas;
        this.inicio = inicio;
        this.fin = fin;
    }
    
    @Override
    public String toString() {
        return "Asignatura{" + "id=" + this.getId() 
                            + ", nombre=" + this.getNombre()
                            + ", aula=" + this.getAula() + '}';
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

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
        if (!profesor.getAsignaturas().contains(this)){
            profesor.addAsignatura(this);
        }
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
        if (!aula.getAsignaturas().contains(this)){
            aula.addAsignatura(this);
        }
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public void addAlumno(Alumno alumno){
        alumnos.add(alumno);
        if (!alumno.getAsignaturas().contains(this)){
            alumno.addAsignatura(this);
        }       
    }
    
    public void removeAlumno(Alumno alumno){
        alumnos.remove(alumno);
        if (!alumno.getAsignaturas().contains(this)){
            alumno.removeAsignatura(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Asignatura other = (Asignatura) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
