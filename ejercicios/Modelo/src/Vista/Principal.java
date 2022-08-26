package Vista;

import Modelo.Alumno;
import Modelo.Profesor;
import Modelo.Persona;

/**
 *
 * @author Ale Castillo
 */
public class Principal {
    public static void main(String[] args) {
        Alumno unAlumno = new Alumno();
        
        unAlumno.setEdad(20);
        unAlumno.setNombre("Alejandra");
        unAlumno.setMatricula("2182003586");
        
        Profesor unProfesor = new Profesor();
        unProfesor.setEdad(46);
        unProfesor.setNombre("Josue");
        unProfesor.setEconomico("21789364");
        
        /*Alumno otroAlumno = new Alumno("Alejandra", 25, "2172003586");
        Profesor otroProfesor = new Profesor("Josue", 46, "243324324");
        Profesor profe3 = new Profesor("Alan", 70, "3273874383");
               
        //System.out.println(unAlumno.obtenerGrupoEtario());
        //System.out.println(unProfesor.obtenerGrupoEtario());
        /*System.out.println(otroAlumno.obtenerGrupoEtario());
        System.out.println(otroProfesor.obtenerGrupoEtario());*/
        
        
        //System.out.println(otroAlumno);
        /*System.out.println(otroProfesor);
        System.out.println(otroProfesor.obtenerGrupoEtario());
        System.out.println(profe3);
        System.out.println(profe3.obtenerGrupoEtario());*/
        
        Alumno alumno1 = new Alumno("Alejandra", 11, "2172003586");
        Alumno alumno2 = new Alumno("Alejandra", 25, "2172003586");
        Alumno alumno3 = new Alumno("Alejandra", 75, "2172003586");
        
        System.out.println(alumno1.obtenerGrupoEtario());
        System.out.println(alumno2.obtenerGrupoEtario());
        System.out.println(alumno3.obtenerGrupoEtario());
        
        Persona unaPersona = new Alumno("Alex", 23, "123910");
        System.out.println(unaPersona.obtenerGrupoEtario());
        
        
    }
}
