package Paquete;

/**
 *
 * @author Ale Castillo
 */
public class Motor {
    private String numSerie;
    private float potencia;

    public Motor() {
    }

    public Motor(String numSerie, float potencia) {
        this.numSerie = numSerie;
        this.potencia = potencia;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
    
    
}
