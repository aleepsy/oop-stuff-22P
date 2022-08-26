/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package paquete;
//import java.util.ArrayList;

/**
 *
 * @author Ale Castillo
 */
public class Principal {

    public static void main(String[] args) {
        /*Operacion op = new Operacion();
        ArrayList<Integer> n = new ArrayList<>();
        
        for (int i = 1; i <= 5; i++) {
            n.add(i);
        }
        
        System.out.println(op.sumar(n));
        System.out.println(op.sumar(5, 5));
        System.out.println(op.sumar("Alejandra", "Perez"));*/
        
        Mensaje mensaje1 = new Mensaje();
        Mensaje mensaje2 = new Mensaje("Hola");
        Mensaje mensaje3 = new Mensaje("Hola", "Ale");
        Mensaje mensaje4 = new Mensaje("Hola", "Ale", 25);
        
        System.out.println("Mensaje 1 "+mensaje1.getTexto());
        System.out.println("Mensaje 2 "+mensaje2.getTexto());
        System.out.println("Mensaje 3 "+mensaje3.getTexto());
        System.out.println("Mensaje 4 "+mensaje4.getTexto());
    }
}
