package Paquete;

/**
 *
 * @author Ale Castillo 
 */
public class Reproductor {
    private String marca;
    private int anioElab;

    public Reproductor() {
    }

    public Reproductor(String marca, int anioElab) {
        this.marca = marca;
        this.anioElab = anioElab;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioElab() {
        return anioElab;
    }

    public void setAnioElab(int anioElab) {
        this.anioElab = anioElab;
    }
    
    
}
