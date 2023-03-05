/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_1_2o_calculos_geometricos;

/**
 *
 * @author medez
 */
public class GEOMETRIA {
    public static final double PI = 3.1416;
    //perimetro de un circulo 
    public static double perimetroCirculo(double radio){
        return PI * (radio * 2);
    }
            public static double areaCirculo (double radio){
                return PI * (radio * radio );
            }
    public static double volumenEsfera (double radio){
        return (4.0/3.0) * (PI * (radio * radio * radio));
    }
}
