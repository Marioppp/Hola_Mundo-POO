
package paquete1;

import paquete2.ClaseE;

public class ClaseC {
    public int publicC;
    int DefaultC;
    private int privateC;
    public void prueba (){
        ClaseB ObjB = new ClaseB();
        
        
        ClaseE ObjE = new ClaseE();
        //la clase F ezta en otro paquete y es default, por lo tanto
        // es invisible
        
    }
}
class ClaseD{
    public int publicD;
    int DefaultD;
    private int privateD;
    
}
