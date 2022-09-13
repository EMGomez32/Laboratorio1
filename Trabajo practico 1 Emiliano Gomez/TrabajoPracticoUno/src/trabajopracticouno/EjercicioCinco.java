
package trabajopracticouno;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el numero que desea saber si es divisible por 2 ");
        int numero=lt.nextInt();
        if(numero%2==0)
        {
            System.out.println(numero+" Es divisible por 2");
        }
        else {
            System.out.println(numero+" No es divisible por 2");
        }
        
    }
    
}
