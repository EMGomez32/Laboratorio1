/*
8. Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, por
ejemplo:
45-9-8-6-45-23-21-74-96-32-45-
Posteriormente aplique el método SPLIT de los String de Java para convertir la cadena en
un arreglo, y calcular la suma total de los elementos y el valor promedio calculado.

 */
package trabajopracticotres;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioOcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("ingreso de una cadena de números separadas por guiones medio");  
        String cadena= lt.nextLine();
        String arreglo[]=cadena.split("-");
        int arregloEntero[] = new int[arreglo.length];
       // convierto los datos de String a entero
        for(int i=0;i<arreglo.length;i++){
           System.out.println(arreglo[i]);
            arregloEntero[i] = Integer.valueOf(arreglo[i]);   
       }
       //
       float  sumaTotal=0,j=0;
       float prom;
       for(int i=0;i<arreglo.length;i++){
           sumaTotal+=arregloEntero[i];
           j++;
       }
        System.out.println("la suma total es :"+sumaTotal);
        prom=sumaTotal/j;
        System.out.println("El promedio es :"+prom);
    }
    }
    

