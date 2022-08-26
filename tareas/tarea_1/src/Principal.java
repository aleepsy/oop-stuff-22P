package paquete;
import java.util.Scanner;
/**
 *
 * @author Ale P. Castillo
 */
public class Principal {

    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta(0001, "JP94", "Juan Perez", 18567.45);
        Cuenta cuenta2 = new Cuenta(0002, "AL93", "Alicia Lopez", 22350.66);
        Cuenta cuenta3 = new Cuenta(0003, "BS99", "Brenda Sanchez", 5467.40);
        
        System.out.println("\nBIENVENIDX\n");
        System.out.println("\t1. Crear cuenta con saldo inicial\n");
        System.out.println("\t2. Crear cuenta sin saldo\n");
        System.out.println("\t3. Ingresar saldo\n");
        System.out.println("\t4. Retirar saldo\n");
        System.out.println("\t5. Cambiar la clave\n");
        System.out.println("\t6. Consultar saldo\n");
        System.out.println("\t7. Mostrar información\n");
        System.out.println("\t8. Salir\n");
        
        Scanner e = new Scanner(System.in);
        System.out.println("Opcion: ");
        int x = e.nextInt();
        switch(x){
            //Agregar cuenta con saldo inicial
            case 1:
                Cuenta.nvaCuentaSaldo();
                break;
            //Agregar cuenta sin saldo inicial    
            case 2:
                Cuenta.nvaCuenta();
                break;
            //Validar cuenta e Ingresar saldo    
            case 3:
                Cuenta.ingresarSaldo(cuenta1, cuenta2, cuenta3);
                break;
            //Validar cuenta y retirar saldo
            case 4:
                Cuenta.retirarSaldo(cuenta1, cuenta2, cuenta3);
                break;
                
            //Cambiar clave
            case 5:
                Cuenta.cambiarClave(cuenta1, cuenta2, cuenta3);
                break;
            //Consultar saldo
            case 6:
                Cuenta.consultarSaldo(cuenta1, cuenta2, cuenta3);
                break;
                
            //Mostrar informacion
            case 7:
                Cuenta.consultarInfo(cuenta1, cuenta2, cuenta3);
                break;
            //Salir
            case 8:
                break;
        }
    }
}
