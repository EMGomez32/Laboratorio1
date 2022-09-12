/*
23- Crea un programa donde se pida el ingreso de una cadena y por medio de
recursión mostrar la cadena de forma inversa.
Ejemplo: Ingreso “computadora de escritorio”
Invertir cadena “oirotircse ed arodatupmoc”
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioVeintitres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        RecursividadVeintitres rec = new RecursividadVeintitres();
        String cadena ;
        System.out.println("Ingrese una frase ");
        cadena= lt.nextLine();
        System.out.println("la frase invertida es : "+ rec.vuelta(cadena, cadena.length()-1));
    }
    
}
