 
package javaapplication34;

public class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;
    private String nomClient;
    public String getnomClient(){
        return nomClient;
    }
    public void setnomClient (String valor){
        nomClient = valor;
    }
    public String getnumeroCuenta(){
        return numeroCuenta;
    }
     public void setnumeroCuenta (String valor){
        numeroCuenta = valor;
    }
     public double getsaldo (){
         return saldo;
     }
     public void setsaldo (double valor){
         saldo = valor;
     }
     public CuentaBancaria (){
         numeroCuenta = "";
         saldo = 0.0;
         nomClient = "";
     }
     public CuentaBancaria (String nCuenta, double cant, String nCliente){
         numeroCuenta = nCuenta;
         saldo = cant;
         nomClient = nCliente;
     }
}
