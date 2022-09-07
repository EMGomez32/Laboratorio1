/*
 10- Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el
usuario lo pida y mostraremos el resultado por pantalla.
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int opcion=0;
        System.out.println("Ingrese una frase: ");  
        String frase = lt.nextLine();
        while (opcion < 1 || opcion > 3) {
            System.out.println("Ingrese la opción que desea: \n "
                    + "1- Convertir a Mayusculas.\n 2- Convertir a Minusculas. "
                    + "\n 3- Converir a Mayuscula y Mininuscula.");
            opcion = lt.nextInt();
            lt.nextLine();
        }

        switch (opcion) {
            case 1:
                System.out.println(frase.toUpperCase());
                break;
            case 2:
                System.out.println(frase.toLowerCase());
                break;
            case 3:
                System.out.println(frase.toUpperCase());
                System.out.println(frase.toLowerCase());
                break;
                
        }
    }
    
}
