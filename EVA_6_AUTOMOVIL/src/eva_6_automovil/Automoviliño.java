
package eva_6_automovil;

import javax.swing.JOptionPane;

public class Automoviliño {
    
    private String Marca ;
    private String model;
    private String placas;
    private double año;
    private String dueño;
    private int Adeudo;
    
    public void setMarca (String Valor){
        Marca = Valor;
    }
    public String getMarca (){
       return Marca;
        
    }
    public void setModel ( String valor){
        model = valor;
    }
    public String getModel (){
        return model;
    }
    public void setPlacas (String valor){
        placas = valor;
    }
    public String getPlacas (){
        return placas;
    }
    public void setAño (double valor){
        año = valor;
    }
    public double getAño (){
        return año;
    }
    public void setDueño (String valor){
        dueño = valor;
    }
    public String getDueño (){
        return dueño;
    }
    
    public void automoviliño (){
        if (año <= 2000){
            Adeudo += 1500;
           
        }

        if (año > 2000 && año < 2006) {
             Adeudo += 2000;
             
         }
             if (año > 2005 && año < 2011) {
                 Adeudo += 2500;
                 ;
             }
                 if (año > 2010 && año < 2016) {
                      
                     Adeudo += 3000;
                   
                 }
                 if (año >  2015 && año < 2024) {
                   Adeudo += 4000;
                  
                 }
             JOptionPane.showInputDialog("el adeudo es: " + Adeudo);
   

            
        
            
        
    }
}
