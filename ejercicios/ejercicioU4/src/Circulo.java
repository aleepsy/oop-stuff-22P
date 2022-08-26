package paquete;
import static java.lang.Math.*;
/**
 *
 * @author Ale Castillo
 */
public class Circulo {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Radio: " + radio;
    }
    
    public static float calcularArea(double r){
       float  a = (float) (PI * r);
       return a;
    }
    
}
