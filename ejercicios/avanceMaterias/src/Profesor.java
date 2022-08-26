package paquete;

/**
 *
 * @author Ale Castillo
 */
public class Profesor {
    private String nombre;
    private String economico;
    //constructor por emosion
    public Profesor() {
    }
    //constructor por parametros
    public Profesor(String nombre, String economico) {
        this.nombre = nombre;
        this.economico = economico;
    }
    //setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEconomico() {
        return economico;
    }

    public void setEconomico(String economico) {
        this.economico = economico;
    }

    @Override
    public String toString() {
        return "\nNombre:\n" + nombre + ", \nNo. económico=" + economico;
    }
    
    
    
}
