/*
  mi niña bonita mi dulce princesa me siento en las nubes cuando tu me besas
y siento que vuelo mas alto que el cielo pipipi
*/
package eva1_2_clases_java;
//DATOS----> ATRIBUTOS O MIEMBROS DE LA CLASE
public class Persona {
   private  String Nombre;
   private String apellidos;
   private int edad;
  private char genero;
  //METODOS -----> COMPORTAMIENTO DE LA CLASE 
  //LEER ---> GET (obtener)
  //ESCRIBIR ------> SET (asignar)
  //Modificador de acceso, valor de retorno, nombre del metodo (argumentos)(implementacion)
  public String getNombre (){
      
      
   return Nombre;
  }
    public void setNombre (String valor){
         Nombre = valor;   
    }
public int getedad(){
    return edad;
}
    public void setedad ( int valor){
         edad = valor;
    }
    public char getgenero(){
        return genero;
    }
    public void setgenero (char valor){
        genero = valor;
    }
    public String getapellidos(){
       return apellidos; 
    }
    public void setapellidos(String valor){
        apellidos = valor;
    }
    public void imprimirDatos (){
        System.out.println("nombre: " +Nombre +" apellido: "+ apellidos +"Edad: "+ edad+"Genero:  "+genero  );
        System.out.println("");
    }
}
