/*

9- Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
Muéstralos en línea recta, separados por un espacio entre cada carácter.

 */
package trabajopracticodos;

import java.nio.charset.StandardCharsets;

/**
 *
 * @author Emi
 */
public class EjercicioNueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadena="La lluvia en Mendoza es escasa";
         char l;
         byte[]bytes= cadena.getBytes(StandardCharsets.US_ASCII);
         for(int i=0;i<cadena.length();i++){
             l=cadena.charAt(i);
             
             System.out.println(l+" = "+bytes[i]);
         }
    }
    
}
