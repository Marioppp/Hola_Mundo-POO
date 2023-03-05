
package eva_1_18_static;

public class EVA_1_18_STATIC {

    public static void main(String[] args) {
        Prueba Obj = new Prueba ();
        Obj.mensaje();
       Prueba.mensajeEstatico();
        System.out.println("PI: "+ Math.PI);
    }
}
     class Prueba {
        public void mensaje (){
            System.out.println("Hola:D");
        }
        public static void mensajeEstatico(){
            System.out.println("Hola Estatico");
        }
    }
