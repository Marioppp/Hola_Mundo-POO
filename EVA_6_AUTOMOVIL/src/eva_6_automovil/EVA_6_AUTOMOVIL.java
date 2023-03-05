
package eva_6_automovil;

public class EVA_6_AUTOMOVIL {

    public static void main(String[] args) {
       /*
        MODELO, 
        PLACAS,
        AÑO, 
        DUEÑO,
        MARCA
        constructores default y con argumentos 
        calcular adeudo (regresar el valor del adeudo)
        2000 y anteriores $1500
        2001 --2005 $2000 
        2006 - 2010 $2500
        2011 - 2015 $3000
        2016 -2023  $4000
        */
       Automoviliño aut1 = new Automoviliño ();
       aut1.setAño(2000);
       aut1.setDueño("Mario Mendez");
       aut1.setMarca("Nissan");
       aut1.setModel("Versa");
       aut1.setPlacas("1583E23");
        System.out.println("el año es: "+ aut1.getAño());
        System.out.println("la marca es: "+aut1.getMarca());
        System.out.println("Modelo: "+ aut1.getModel());
        System.out.println("Placas: "+ aut1.getPlacas());
         aut1.automoviliño();
       
    }
    
}
