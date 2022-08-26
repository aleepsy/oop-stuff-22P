package Modelo;

/**
 *
 * @author Ale Castillo
 */
public class Profesor extends Persona{
    private String economico;
    
    public Profesor(){
        
    }
    
    public Profesor(String nombre, int edad, String economico){
    super(nombre, edad);
    this.economico = economico;        
    }

    public String getEconomico() {
        return economico;
    }

    public void setEconomico(String economico) {
        this.economico = economico;
    }
    
    @Override
    public String obtenerGrupoEtario(){
        String grupo = super.obtenerGrupoEtario();
        if(grupo.equals("Adultez"))
            return "El profesor pertenece a " + grupo;
        else
            return "Verifica la edad";
    }

    @Override
    public String toString() {
        return super.toString() + "\nEconomico: " + economico;
    }   
}
