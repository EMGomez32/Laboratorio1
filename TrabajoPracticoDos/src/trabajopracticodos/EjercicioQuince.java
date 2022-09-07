/*
15- Indique que sucede si realizo la siguiente declaración de variable:
int numero = null;
¿Qué debo modificar para poder asignar null a la variable?

 */
package trabajopracticodos;

/**
 *
 * @author Emi
 */
public class EjercicioQuince {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
  /*    
   
    No se le puede asignar null a la variable numero, ya que nos da un error y no deja ejecutar el programa
    ya que no permite esto
    */  
    
    // int numero = null;
  
    /*
    
    Pero si se puede solucionar esto, usando integer y no int
    */
    
    Integer numero=null;
    
        
    System.out.println(numero);
    
    }
    
}
