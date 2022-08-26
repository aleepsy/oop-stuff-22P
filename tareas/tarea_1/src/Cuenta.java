package paquete;
import java.util.Scanner;

/**
 *
 * @author Ale P. Castillo
 */
public class Cuenta{
    //atributos
    private int numero;
    private String clave;
    private String dueno;
    private double saldo;
    
    //constructores
    public Cuenta() {
    }

    public Cuenta(int numero, String clave, String dueno, double saldo) {
        this.numero = numero;
        this.clave = clave;
        this.dueno = dueno;
        this.saldo = saldo;
    }
    
    //getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public static void nvaCuentaSaldo(){
        System.out.println("\n-----NUEVA CUENTA CON SALDO-----");
                Scanner d = new Scanner(System.in);
                System.out.println("Nombre: ");
                String du = d.nextLine();
                System.out.println("Clave: ");
                String c = d.nextLine();
                System.out.println("Saldo inicial: ");
                double s = d.nextDouble();
                
                Cuenta cuenta4 = new Cuenta();
                
                cuenta4.setNumero(004);
                cuenta4.setClave(c);
                cuenta4.setDueno(du);
                cuenta4.setSaldo(s);
                
                System.out.println("\nCuenta creada con éxito");
                System.out.println("Cuenta #: " + cuenta4.getNumero() + "\nDueño: " + du + "\nSaldo: " + s);
    }
    
    public static void nvaCuenta(){
        System.out.println("\n-----NUEVA CUENTA SIN SALDO-----");
            Scanner d2 = new Scanner(System.in);
            System.out.println("Nombre: ");
            String du2 = d2.nextLine();
            System.out.println("Clave: ");
            String c2 = d2.nextLine();
                
            Cuenta cuenta5 = new Cuenta();
                
                cuenta5.setNumero(005);
                cuenta5.setClave(c2);
                cuenta5.setDueno(du2);
                
                System.out.println("\nCuenta creada con éxito");
                System.out.println("Cuenta #: " + cuenta5.getNumero() + "\nDueño: " + du2 + "\nSaldo: $0.00");
    }
    
    public static void ingresarSaldo(Cuenta cuenta1, Cuenta cuenta2, Cuenta cuenta3){
        System.out.println("\n-----INGRESAR SALDO-----");
        Scanner d3 = new Scanner(System.in);
        System.out.println("Nombre: ");
        String du3 = d3.nextLine();
        System.out.println("Clave: ");
        String c3 = d3.nextLine();
                
            if ((du3.equals(cuenta1.getDueno())) && (c3.equals(cuenta1.getClave()))){
                System.out.println("--------Cuenta validada-------");
                System.out.println("Saldo a ingresar: ");
                double s3 = d3.nextDouble();
                System.out.println("Saldo inicial: "+cuenta1.getSaldo());
                cuenta1.setSaldo(cuenta1.getSaldo() + s3);
                System.out.println("Saldo final: " + cuenta1.getSaldo());
            }
                
            else if ((du3.equals(cuenta2.getDueno())) && (c3.equals(cuenta2.getClave()))){
                System.out.println("--------Cuenta validada-------");
                System.out.println("Saldo a ingresar: ");
                double s3 = d3.nextDouble();
                System.out.println("Saldo inicial: "+cuenta2.getSaldo());
                cuenta2.setSaldo(cuenta2.getSaldo() + s3);
                System.out.println("Saldo final: " + cuenta2.getSaldo());
            }
                
            else if ((du3.equals(cuenta3.getDueno())) && (c3.equals(cuenta3.getClave()))){
                System.out.println("--------Cuenta validada-------");
                System.out.println("Saldo a ingresar: ");
                double s3 = d3.nextDouble();
                System.out.println("Saldo inicial: "+cuenta3.getSaldo());
                cuenta3.setSaldo(cuenta3.getSaldo() + s3);
                System.out.println("Saldo final: " + cuenta3.getSaldo());
            }
                
            else
                System.out.println("----Es necesario validar la cuenta con los datos correctos----\n");
    }
    
    public static void retirarSaldo(Cuenta cuenta1, Cuenta cuenta2, Cuenta cuenta3){
        System.out.println("\n-----RETIRAR SALDO-----");
        Scanner d4 = new Scanner(System.in);
        System.out.println("Nombre: ");
        String du4 = d4.nextLine();
        System.out.println("Clave: ");
        String c4 = d4.nextLine();
               
            if ((du4.equals(cuenta1.getDueno())) && (c4.equals(cuenta1.getClave()))){
                System.out.println("--------Cuenta validada-------");
                System.out.println("Saldo a retirar: ");
                double s4 = d4.nextDouble();
                  if(s4 > cuenta1.getSaldo()){
                        System.out.println("No puedes retirar una cantidad mayor a tu saldo");
                    }
            else if (s4 <= cuenta1.getSaldo()){
                    System.out.println("Saldo inicial: "+cuenta1.getSaldo());
                    cuenta1.setSaldo(cuenta1.getSaldo() - s4);
                    System.out.println("Saldo final: " + cuenta1.getSaldo());                        
                }
            }
                
            else if ((du4.equals(cuenta2.getDueno())) && (c4.equals(cuenta2.getClave()))){
                    System.out.println("--------Cuenta validada-------");
                    System.out.println("Saldo a retirar: ");
                    double s4 = d4.nextDouble();
                        if(s4 > cuenta2.getSaldo()){
                            System.out.println("No puedes retirar una cantidad mayor a tu saldo");
                        }
                    else if (s4 <= cuenta2.getSaldo()){
                            System.out.println("Saldo inicial: "+cuenta2.getSaldo());
                            cuenta2.setSaldo(cuenta2.getSaldo() - s4);
                            System.out.println("Saldo final: " + cuenta2.getSaldo());                        
                    }
            }
                
                else if ((du4.equals(cuenta3.getDueno())) && (c4.equals(cuenta3.getClave()))){
                    System.out.println("--------Cuenta validada-------");
                    System.out.println("Saldo a retirar: ");
                    double s4 = d4.nextDouble();
                        if(s4 > cuenta3.getSaldo()){
                            System.out.println("No puedes retirar una cantidad mayor a tu saldo");
                        }
                    else if (s4 <= cuenta3.getSaldo()){
                            System.out.println("Saldo inicial: "+cuenta3.getSaldo());
                            cuenta3.setSaldo(cuenta3.getSaldo() - s4);
                            System.out.println("Saldo final: " + cuenta3.getSaldo());                        
                    }
                }
                
                else
                    System.out.println("----Es necesario validar la cuenta con los datos correctos----\n");
    }
    
    public static void cambiarClave(Cuenta cuenta1, Cuenta cuenta2, Cuenta cuenta3){
        System.out.println("\n-----CAMBIO DE CLAVE-----");
        Scanner d5 = new Scanner(System.in);
        System.out.println("Nombre: ");
        String du5 = d5.nextLine();
        System.out.println("Clave: ");
        String c5 = d5.nextLine();
                
           if ((du5.equals(cuenta1.getDueno())) && (c5.equals(cuenta1.getClave()))){                    
             System.out.println("--------Cuenta validada-------");
             System.out.println("Ingresa tu nueva clave con al menos 8 caracteres");
             String pswd = d5.nextLine();
             int len = pswd.length();
                if(len >= 8){
                    cuenta1.setClave(pswd);
                    System.out.println("---Clave actualizada---");
                    System.out.println("Valida tus credenciales");
                    System.out.println("Nombre: ");
                    String du55 = d5.nextLine();
                    System.out.println("Clave");
                    String c55 = d5.nextLine();
                        if ((du55.equals(cuenta1.getDueno())) && (c55.equals(cuenta1.getClave()))){
                            System.out.println("--------Cuenta validada-------");
                        }
                }
                else System.out.println("Tu clave debe tener al menos 8 caracteres");
           }

           else if ((du5.equals(cuenta2.getDueno())) && (c5.equals(cuenta2.getClave()))){                    
                System.out.println("--------Cuenta validada-------");
                System.out.println("Ingresa tu nueva clave con al menos 8 caracteres");
                String pswd = d5.nextLine();
                int len = pswd.length();
                    if(len >= 8){
                        cuenta2.setClave(pswd);
                        System.out.println("---Clave actualizada---");
                        System.out.println("Valida tus credenciales");
                        System.out.println("Nombre: ");
                        String du55 = d5.nextLine();
                        System.out.println("Clave");
                        String c55 = d5.nextLine();
                            if ((du55.equals(cuenta2.getDueno())) && (c55.equals(cuenta2.getClave()))){
                                System.out.println("--------Cuenta validada-------");
                            }
                    }
                    else System.out.println("Tu clave debe tener al menos 8 caracteres");
                }
                
                else if ((du5.equals(cuenta3.getDueno())) && (c5.equals(cuenta3.getClave()))){                    
                    System.out.println("--------Cuenta validada-------");
                    System.out.println("Ingresa tu nueva clave con al menos 8 caracteres");
                    String pswd = d5.nextLine();
                    int len = pswd.length();
                    if(len >= 8){
                        cuenta3.setClave(pswd);
                        System.out.println("---Clave actualizada---");
                        System.out.println("Valida tus credenciales");
                        System.out.println("Nombre: ");
                        String du55 = d5.nextLine();
                        System.out.println("Clave");
                        String c55 = d5.nextLine();
                            if ((du55.equals(cuenta3.getDueno())) && (c55.equals(cuenta3.getClave()))){
                                System.out.println("--------Cuenta validada-------");
                            }
                    }
                    else System.out.println("Tu clave debe tener al menos 8 caracteres");
                }                
                
                else
                    System.out.println("----Es necesario validar la cuenta con los datos correctos----\n");
    }
    
    public static void consultarSaldo(Cuenta cuenta1, Cuenta cuenta2, Cuenta cuenta3){
        System.out.println("\n-----CONSULTAR SALDO-----");
                Scanner d6 = new Scanner(System.in);
                System.out.println("Nombre: ");
                String du6 = d6.nextLine();
                System.out.println("Clave: ");
                String c6 = d6.nextLine();
                
                if ((du6.equals(cuenta1.getDueno())) && (c6.equals(cuenta1.getClave()))){                    
                    System.out.println("--------Cuenta validada-------");
                    System.out.println("Hola, "+cuenta1.getDueno()+"\nTu saldo es: " + cuenta1.getSaldo());
                }
                
                else if ((du6.equals(cuenta2.getDueno())) && (c6.equals(cuenta2.getClave()))){                    
                    System.out.println("--------Cuenta validada-------");
                    System.out.println("Hola, "+cuenta2.getDueno()+"\nTu saldo es: " + cuenta2.getSaldo());
                }
                
                else if ((du6.equals(cuenta3.getDueno())) && (c6.equals(cuenta3.getClave()))){                    
                    System.out.println("--------Cuenta validada-------");
                    System.out.println("Hola, "+cuenta3.getDueno()+"\nTu saldo es: " + cuenta3.getSaldo());
                }
                
                else System.out.println("----Es necesario validar la cuenta con los datos correctos----\n");
    }
    
    public static void consultarInfo(Cuenta cuenta1, Cuenta cuenta2, Cuenta cuenta3){
                System.out.println("\n-----CONSULTAR INFORMACION-----");
                Scanner d7 = new Scanner(System.in);
                System.out.println("Nombre: ");
                String du7 = d7.nextLine();
                System.out.println("Clave: ");
                String c7 = d7.nextLine();
                
                if ((du7.equals(cuenta1.getDueno())) && (c7.equals(cuenta1.getClave()))){                    
                    System.out.println("--------Cuenta validada-------");
                    System.out.println("Tu informacion es la siguiente:\n");
                    System.out.println("No. Cuenta: "+cuenta1.getNumero()+"\nNombre: "+cuenta1.getDueno()+
                            "\nSaldo: "+cuenta1.getSaldo());
                }
                
                else if ((du7.equals(cuenta2.getDueno())) && (c7.equals(cuenta2.getClave()))){                    
                    System.out.println("--------Cuenta validada-------");
                    System.out.println("No. Cuenta: "+cuenta2.getNumero()+"\nNombre: "+cuenta2.getDueno()+
                            "\nSaldo: "+cuenta2.getSaldo());
                }
                
                else if ((du7.equals(cuenta3.getDueno())) && (c7.equals(cuenta3.getClave()))){                    
                    System.out.println("--------Cuenta validada-------");
                    System.out.println("No. Cuenta: "+cuenta3.getNumero()+"\nNombre: "+cuenta3.getDueno()+
                            "\nSaldo: "+cuenta3.getSaldo());
                }
                
                else System.out.println("----Es necesario validar la cuenta con los datos correctos----\n");
    }

    @Override
    public String toString() {
        return "Cuenta #: " + numero + "\nDueño: " + dueno + "\nSaldo: " + saldo;
    }   
}

