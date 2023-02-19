
package eva1_5_circulo;

import javax.swing.JOptionPane;

public class Circulo {
   private double radio;
   private double perimeter;
   private double area;

   public void Circulo (){
     radio = Integer.parseInt(JOptionPane.showInputDialog("escribe el radio de tu circulo"));
      JOptionPane.showInputDialog("el radio seleccionado fue: "+ radio  +" presiona enter para calcular :D" );
        perimeter = Math.PI * (radio* radio);
        area = Math.PI * (radio*2);
         System.out.println("el perimetro es: "+ perimeter);
         System.out.println("el area es: "+ area);

                
                
                

   }
   
}
