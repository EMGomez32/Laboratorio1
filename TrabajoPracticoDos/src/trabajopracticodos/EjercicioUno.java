/*1- CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y 
asigne el mismo a una variable valorDecimal de tipo double, aplique las 
operaciones de CASTING para convertir la variable a los siguientes tipos de 
datos, short, int, long, String, float investigue las diferentes formas de lograr la 
conversión. Muestre por pantalla el resultado de las conversiones.
 */
package trabajopracticodos;


import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioUno {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lt = new Scanner(System.in);
        System.out.println("Ingrese un valor decimal");
        double valorDecimal= lt.nextDouble();
        float valorFloat = (float)valorDecimal;
        short valorShort = (short)valorDecimal;
        int valorInt = (int) valorDecimal;
        long valorLong = (long)valorDecimal;
        String valorString = String.valueOf(valorDecimal);  
        System.out.println("El numero ingresado en tipo de dato:");
        System.out.println("Float: "+valorFloat);
        System.out.println("Short: "+valorShort);
        System.out.println("Int: "+valorInt);
        System.out.println("Long: "+valorLong);
        System.out.println("String: "+valorString);
    }
    
}
