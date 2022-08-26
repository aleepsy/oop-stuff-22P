
package paquete;

/**
 *
 * @author Ale Castillo
 */
public class Curso {
    //atributos
    private String horario;
    private String grupo;
    
    private Profesor profesor;
    private Alumno alumno1;
    private Alumno alumno2;
    private UEA uea;
    

   //constructor por omision
    public Curso() {
        uea = new UEA();
    }
    //constructor por parametrizacion

    public Curso(String horario, String grupo) {
        this.horario = horario;
        this.grupo = grupo;        
    }
    
    public Curso(String horario, String grupo, String nombreUEA, String clave) {
        this.horario = horario;
        this.grupo = grupo; 
        uea = new UEA(nombreUEA, clave);
    }
    
    //setter y getters
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    public void agregarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    public Alumno getAlumno1() {
        return alumno1;
    }

    public Alumno getAlumno2() {
        return alumno2;
    }
    
    public void agregarAlumno(Alumno alumno1, Alumno alumno2){
        this.alumno1 = alumno1;
        this.alumno2 = alumno2;
    }

    public UEA getUea() {
        return uea;
    }

    public void setUea(String nombreUEA, String clave) {
        uea.setClave(clave);
        uea.setNombreUEA(nombreUEA);
    }    
    
    
    @Override
    public String toString() {
        return "\nHorario:\n" + horario + ", \nGrupo: " + grupo + ", \nProfesor: " + profesor + "\nAlumno 1 "+alumno1+"\nAlumno 2"+alumno2;
    }
    
    
    
}
