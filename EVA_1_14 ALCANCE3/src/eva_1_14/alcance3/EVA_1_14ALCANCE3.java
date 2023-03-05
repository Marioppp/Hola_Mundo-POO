
package eva_1_14.alcance3;


public class EVA_1_14ALCANCE3 {

    public static void main(String[] args) {
        int x =11111; //todas las x se pueden visualizar ya que es visible para todo el main
        System.out.println(x);
        for (int i = 0; i < 10; i++) {// las variables i solo son visibles dentro del for
            System.out.println(i); 
            System.out.println(x);
        }
        for (int i = 0; i < 10; i++) {
            
            if (i == 5){
              System.out.println(x);
            }
        }
        
    }
    public static void Algo (int x){
        
    }
    public static void Algo2 (int x){
        
    }
}
