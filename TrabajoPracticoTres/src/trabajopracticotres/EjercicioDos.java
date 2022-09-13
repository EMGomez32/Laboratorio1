/*
 2. Crea un array o arreglo unidimensional con un tamaño de 5, asignale los valores
numéricos manualmente (los que tú quieras) y muestralos por pantalla. Solicite los
números mediante un bucle.
 */
package trabajopracticotres;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []arreglo= new int [5];
        int i;
        Scanner lt = new Scanner(System.in);
        System.out.println("Ingrese los valores numericos del arreglo: ");
        for( i=0 ;i<5 ;i++){
         arreglo[i]=lt.nextInt();
            }
        System.out.println("El arreglo que ingreso es :");
        System.out.print("[\t");
        for( i=0 ;i<5 ;i++){
            System.out.print(arreglo[i]+"\t");
            }
        System.out.println("]");
    }
    
}
