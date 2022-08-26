package Modelo;

/**
 *
 * @author Ale Castillo
 */
public class Persona{
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String obtenerGrupoEtario(){
        if(0<=edad && edad<=4)
            return "Infancia";
        else if(5<=edad && edad<=9)
            return "Niñez";
        else if(10<=edad && edad<=14)
            return "Adolescncia";
        else if(15<=edad && edad<=29)
            return "Juventud";
        else if(30<=edad && edad<=64)
            return "Adultez";
        else
            return "Tercera edad";
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "\nEdad: " + edad;
    }
}
