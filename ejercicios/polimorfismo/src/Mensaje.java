package paquete;

/**
 *
 * @author Ale Castillo
 */
public class Mensaje {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    //constructores
    public Mensaje() {
        texto = "Hola Mundo";
    }
    
    public Mensaje(String texto, String nombre){
        this.texto = texto.concat(" ").concat(nombre);
    }
    
    public Mensaje(String texto, String nombre, Integer edad){
        this.texto = texto+" "+nombre+" "+edad;
    }

    public Mensaje(String texto) {
        this.texto = texto;
    }
    
    
    
    
    
    
}
