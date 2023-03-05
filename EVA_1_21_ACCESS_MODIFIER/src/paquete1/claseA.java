
package paquete1;

import paquete2.ClaseE;


public class claseA {
    public int publicA;
    int DefaultA;
    private int privateA;
    public void prueba(){
        //todas estas clases estan en paquete 1
        ClaseB objB = new ClaseB();
        //con este objeto puedo ver lo publico y default:D
        ClaseC objC = new ClaseC();
        ClaseD objD = new ClaseD();
        //tambien con estos objetos vere lo publico y default
        
        //clases paquete 2
        ClaseE objE = new ClaseE ();
        
       //todoo lo default ahora es invisible
       //la clase F es default, por eso no es visible para clase A
      // claseF objF = new ClaseF ();
    }
}
class ClaseB{
    public int publicB;
    int DefaultB;
    private int privateB;
}
