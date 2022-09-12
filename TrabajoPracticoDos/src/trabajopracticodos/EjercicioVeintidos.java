/*
 22- Suma los dígitos de un número ingresado por el usuario de forma recursiva.
Ejemplo: el usuario ingresa 1596
El programa debe sumar 1 + 5 + 9 + 6
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioVeintidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lt= new Scanner(System.in);
        RecursividadVeintidos recu= new RecursividadVeintidos();
        System.out.println("Ingrese un numero: ");
        int numero= lt.nextInt();
        System.out.println("La suma es : "+recu.Suma( numero));
    }
    
}
