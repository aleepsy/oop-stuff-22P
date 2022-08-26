package paquete;

/**
 *
 * @author Ale Castillo
 */
public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(double altura) {
        this.altura = altura;
    }

    public Cilindro(double altura, double radio) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Altura: " + altura;
    }
    
    public static void calcularArea(){
        
    }
    
    public static void calcularVolumen(){
        
    }
    
}
