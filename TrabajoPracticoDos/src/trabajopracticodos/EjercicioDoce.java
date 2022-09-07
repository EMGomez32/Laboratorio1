/*
12- Dada una cadena, extraer la cuarta y quinta letra usando el método substring
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioDoce {
    public static void main(String[] args) {
    Scanner lt = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase=lt.nextLine();
        System.out.println(frase.substring(3,4));
        System.out.println(frase.substring(4,5));
}
}

