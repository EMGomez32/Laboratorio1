/*
13- Pedir el ingreso de dos cadenas por por teclado, indicar si la segunda cadena se
encuentra dentro de la primera (usar indexOf o contains).
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioTrece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        
        System.out.println("Ingrese la primer cadena (frase)");
        String cadena1 = lt.nextLine();
    System.out.println("Ingrese la segunda cadena (frase)");
    String cadena2 = lt.nextLine();
    
    boolean encontro =cadena1.contains(cadena2);
    
    if (encontro){
        System.out.println("La segunda cadena ingresada se encuentra dentro de la primer cadena");
        }
    else{
    System.out.println("La segunda cadena no se encuentra dentro de la primer cadena");
    }   
    }
    
}
