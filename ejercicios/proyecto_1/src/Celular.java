package paquete;
/**
 *
 * @author Ale Castillo
 */
public class Celular {
    private String marca;
    private String modelo;
    private double precio;
    
    //constructores
    public Celular() {
    }

    public Celular(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Celular" + "\nMarca: " + marca + ",\nModelo: " + modelo + "\nPrecio: " + precio + "\n";
    }   

}