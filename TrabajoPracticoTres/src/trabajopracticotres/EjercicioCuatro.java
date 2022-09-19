/*
 4. Escriba una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un
arreglo unidimensional.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y muestre el rango
(diferencia entre el mayor y el menor) de los elementos en el arreglo 
 */
package trabajopracticotres;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        mayorMenor();
        
    }
    public static float []cargaArreglo(){
        float arreglo[]=new float[20];
       Scanner lt = new Scanner(System.in);
        System.out.println("Ingrese los valores numericos del arreglo: ");
        for( int i=0 ;i<20 ;i++){
         arreglo[i]=lt.nextFloat();
            }
            return arreglo; 
    }  
    public static void  mayorMenor(){
        float [] arreglo= cargaArreglo(); 
        float mayor=arreglo[0], menor = arreglo[0];
   
        for(int i=1; i <arreglo.length;i++){
            if(arreglo[i]>mayor){
                mayor=arreglo[i];
            }
       if (arreglo[i]<menor){
           menor=arreglo[i];
       }
       
   }
   float rango=mayor-menor;
       System.out.println("El mayor numero ingresado es: "+mayor);
       System.out.println("El menor numero ingresado es: "+menor);
       System.out.println("El mrango es: "+rango);
   
}
}
