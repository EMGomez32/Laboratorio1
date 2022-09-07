/*
7- Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas
vocales tiene en total (recorre el String con charAt)
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioSiete {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
       Scanner lt = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase= lt.nextLine();
        
        int cantidad=0;
        
        for(int i=0; i<frase.length(); i++){
            char vocal= frase.charAt(i);
           if(vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
             cantidad++;  
           }
        }
        System.out.println("Cantidad de vocales: "+cantidad);
    }

    
    
}
