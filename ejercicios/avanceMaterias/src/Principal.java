package paquete;

/**
 *
 * @author Ale Castillo
 */
public class Principal {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("2172003586", "Alejandra");
        Alumno alumno2 = new Alumno("2193005467", "Fernando");
        Profesor unProfe = new Profesor("Josue Padilla", "1290932");
        
        Curso unCurso = new Curso("CSI82", "17:30", "POO", "1151044");
        
        unCurso.agregarProfesor(unProfe);
        unCurso.agregarAlumno(alumno1, alumno2);
        
        System.out.println(unCurso);
        
    }
}
