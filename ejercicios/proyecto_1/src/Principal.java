package paquete;

import java.util.ArrayList;

/**
 *
 * @author Ale Castillo
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Celular> catalogo = new ArrayList<>();
        
        Celular celular1 = new Celular("Apple", "iPhone 13", 20999);
        catalogo.add(celular1);
        
        catalogo.add(new Celular("Samsung", "S22", 25000));
        catalogo.add(new Celular("Huawei", "P30 Lite", 9000));
        
        
        //for(String x : nombres){
          //  System.out.println(x);
        }
 }
