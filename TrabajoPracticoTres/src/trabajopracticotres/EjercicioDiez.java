/*
 10)- Dado 2 array de enteros, el primero de tamaño 5 y el segundo de tamaño 10,
pedir los valores numéricos enteros para cargar cada uno de los arreglos, 
cree un tercer arreglo de tamaño 5 que contenga en cada posición la suma de la 
multiplicación de cada elemento del array uno, por cada elemento del array 2
ARRAY3= (posición 0 del arreglo 1 * posición 0 del arreglo 2) + 
(posición 0 del arreglo 1 * posición 1 del arreglo 2) + 
(posición 0 del arreglo 1 * posición 2 del arreglo 2) + .............+ 
(posición 4 del arreglo 1 * posición 9 del arreglo 2)
Use 2 estructuras iterativas anidadas para realizar el cálculo y asignación de 
los valores en el 3 array.
 */
package trabajopracticotres;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int array1[] = new int[5];
        int array2[] = new int[10];
        
System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero del arreglo 1 en la posicion " + (i+1));
            array1[i] = sc.nextInt();
        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero del arreglo 2 en la posicion " + (i+1));
            array2[i] = sc.nextInt();
        }
System.out.println("\n");
        int Array3[] = creacionArray3(array1, array2);
        System.out.println("El Array 3 es :");
        System.out.print("( ");
        for (int i = 0; i < 4; i++) {
            System.out.print(Array3[i] + " , ");
        }
        System.out.print(Array3[4] +" )");
        System.out.println(" ");
    }

    public static int[] creacionArray3(int array1[], int array2[]) {

        int array3[] = new int[5];

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {

                sum = (array1[i] * array2[j]) + sum;

            }
            array3[i] = sum;
        }

        return array3;
    }
    }
    

