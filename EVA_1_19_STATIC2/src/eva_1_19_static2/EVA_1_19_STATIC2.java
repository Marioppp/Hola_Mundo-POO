
package eva_1_19_static2;

public class EVA_1_19_STATIC2 {
 double x = 100;

    public static void main(String[] args) {
    EVA_1_19_STATIC2 obj = new EVA_1_19_STATIC2 ();
    mensajeEstatico();
    System.out.println(obj.x);
    obj.mensajeNoEstatico();
    }
    public  void mensajeNoEstatico(){
        System.out.println("MENSAJE NO ESTATICO");
    }
    public static void mensajeEstatico(){
        System.out.println("MENSAJE  ESTATICO");
    }
}
