/*
 1. ¿Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?

 */
package trabajopracticotres;

/**
 *
 * @author Emiliano
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arreglo= new int [10];
            
        for(int i=0; i<=10; i++){
            System.out.println("arreglos"+arreglo[i]);
        }
        
    }
    
} 

/* El error que nos larga es "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10"
    falta completar

*/
    

