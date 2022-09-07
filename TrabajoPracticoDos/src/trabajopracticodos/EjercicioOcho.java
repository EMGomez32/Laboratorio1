/*
8- Reemplaza todas las a del String anterior por una e. (aplique replace)

 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioOcho {

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
       String fraseNueva= frase.replace('a', 'e');
        System.out.println("La frase con el reemplazo de a por e es :"+fraseNueva);
    }
    }
    

