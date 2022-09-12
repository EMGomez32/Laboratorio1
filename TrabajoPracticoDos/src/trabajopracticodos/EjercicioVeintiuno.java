/*
 21- Codifique un programa que solicite un número entero mayor a cero y que
mediante recursión sume todos los números números naturales desde el
número ingresado hasta 1.
Ejemplo: Ingreso 10
El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioVeintiuno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        RecursividadVeintiuno recur = new RecursividadVeintiuno();
        int numero;
        do{
          System.out.println("Ingrese un numero entero mayor a cero");
         numero= lt.nextInt();  
        }while(numero<=0);
        System.out.println("El resultado de la suma es : "+recur.suma(numero));
        
    }
    
}
