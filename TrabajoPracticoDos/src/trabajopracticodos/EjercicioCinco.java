/*
 *5- Solicite el ingreso de un número y conviértalo a un String mediante
String.valueOf
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioCinco {
    public static void main(String[] args) {
    Scanner lt = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
    int numero = lt.nextInt();
    String numeroL = String.valueOf(numero);
    System.out.println("Numero en variable tipo String: "+ numeroL);
}
}