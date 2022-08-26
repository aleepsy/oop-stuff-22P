package paquete;

/**
 *
 * @author Ale Castillo
 */
public class UEA {
    private String nombreUEA;
    private String clave;
    
    //constructor por omision
    public UEA() {
    }
    //constructor por parametros
    public UEA(String nombreUEA, String clave) {
        this.nombreUEA = nombreUEA;
        this.clave = clave;
    }
    //setters y getters
    public String getNombreUEA() {
        return nombreUEA;
    }

    public void setNombreUEA(String nombreUEA) {
        this.nombreUEA = nombreUEA;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "\nUEA:\n" + nombreUEA + ", \nClave:" + clave;
    }
    
    
    
}
