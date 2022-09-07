/*
11- Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
compareToIgnoreCase)
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioOnce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner lt = new Scanner(System.in);
        String palabraUno, palabraDos;  
        System.out.println("Ingrese dos palabras para comparar si son iguales");
        System.out.println("Ingrese la primer palabra");
        palabraUno= lt.nextLine();
        System.out.println("Ingrese la segunda palabra");
        palabraDos= lt.nextLine();
        System.out.println("Metodo equals: ");
        if(palabraUno.equals(palabraDos)){
            System.out.println("Las pabras coinciden");
        }
        else{
            System.out.println("Las palabras son distintas");
        }
        System.out.println("Metodo compareTo");
        if(palabraUno.compareTo(palabraDos)==0){
            System.out.println("Las pabras coinciden");
        }
        else{
            System.out.println("Las palabras son distintas");
        }
        System.out.println("Metodo compareToIgnoreCase");
        if(palabraUno.compareToIgnoreCase(palabraDos)==0){
            System.out.println("Las pabras coinciden");
        }
        else{
            System.out.println("Las palabras son distintas");
        }
         
    }
    
}
