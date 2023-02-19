
package javaapplication34;

public class JavaApplication34 {

    public static void main(String[] args) {
    CuentaBancaria cuenta1 = new CuentaBancaria ("100", 100000, "Carlos Slim");
 
        System.out.println("Datos del cliente: "); System.out.println("/");
        System.out.println(cuenta1.getnomClient());
        System.out.println(cuenta1.getnumeroCuenta());
        System.out.println(cuenta1.getsaldo());
        
        System.out.println("___________________________________________");
        
        CuentaBancaria cuenta2 = new CuentaBancaria("09812389120", -5000, "Ricardo Ferreti");
         System.out.println("Datos del cliente: ");
        System.out.println(cuenta2.getnomClient());
        System.out.println(cuenta2.getnumeroCuenta());
        System.out.println(cuenta2.getsaldo());
                System.out.println("___________________________________________");

        CuentaBancaria cuenta3  = new CuentaBancaria("200", 109090, "Roberto Patiño");
          System.out.println("Datos del cliente: ");
        System.out.println(cuenta3.getnomClient());
        System.out.println(cuenta3.getnumeroCuenta());
        System.out.println(cuenta3.getsaldo());
                System.out.println("___________________________________________");
             
                  
                  
                 
                   
                   
    }
    
}
