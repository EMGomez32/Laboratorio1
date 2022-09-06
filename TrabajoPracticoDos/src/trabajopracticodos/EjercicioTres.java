/*
3- Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -
999) y por medio del uso de las operaciones matemáticas módulo 10 y división 
por 10 efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida 
del algoritmo 14.
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 * @author Emiliano
 */
public class EjercicioTres {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int numeroIngresado=0;
        do{
         System.out.println("Ingrese un numero de tres cifras (100 al 999): ");
        numeroIngresado= lt.nextInt();   
        }while(numeroIngresado<100 || numeroIngresado>999);
        int unidad= numeroIngresado%10;
        int decena= (numeroIngresado/10)%10;
        int centena = (numeroIngresado/10)/10;
        int salida= unidad+decena+centena;
        System.out.println("La suma de los 3 digitos es :"+salida);
    }
    
}
