package Modelo;

/**
 *
 * @author Ale Castillo
 */
public class Alumno extends Persona{
    private String matricula;
    
    public Alumno(){
        
    }
    
    public Alumno(String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;        
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String obtenerGrupoEtario(){
    String grupo = super.obtenerGrupoEtario();
    
        if(grupo.equals("Juventud"))
            return "El alumno pertenece a " + grupo;
        else if(grupo.equals("Infancia") || grupo.equals("Niñez") || grupo.equals("Adolescencia")){
            return "Verifica la edad";
        }
        else
            return "La edad es muy grande";
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatricula: " + matricula;
    }
    
    
   
}

