package ProyectoFinal;
import java.util.TreeSet;
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;
    
    //método getter
    protected String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @param nombre 
     * inicializa un conjunto vacío de alumnos
     * y nombra al curso con el nombre que se haya introducido como
     * parámetro
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }
    
    /**
     * 
     * @param p 
     * recibe una persona y la añade a un conjunto
     * de alumnos
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
