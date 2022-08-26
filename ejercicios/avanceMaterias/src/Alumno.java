package paquete;

/**
 *
 * @author Ale Castillo
 */
public class Alumno {
    private String matricula;
    private String nombre;
    //constructor por omision
    public Alumno() {
    }
    //constructor por parametros
    public Alumno(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }
    //setters y getters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    //

    @Override
    public String toString() {
        return "\nNombre:\n" + nombre + "\nMatricula:" + matricula;
    }
    
    
    
}
