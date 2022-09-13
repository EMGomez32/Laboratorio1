
package trabajopracticouno;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lt= new Scanner(System.in);
        float num;
        do{
          System.out.println("Ingrese un numero");
         num= lt.nextFloat();  
        }while(num <0);
        System.out.println("El numero ingresado es: "+num);
        
       
    }
    
}
