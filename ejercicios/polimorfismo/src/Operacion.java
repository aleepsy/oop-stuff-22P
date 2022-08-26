package paquete;
import java.util.ArrayList;

/**
 *
 * @author Ale Castillo
 */
public class Operacion {

    
    public int sumar(int n1, int n2){
        return n1 + n2;
    }
    
    public String sumar(String cad1, String cad2){
        return cad1+" "+cad2;
    }
    
    public Integer sumar(ArrayList<Integer> numeros){
        int sum = 0;
        for (Integer n : numeros) {
            sum += n;
        }
        return sum;
    }
}