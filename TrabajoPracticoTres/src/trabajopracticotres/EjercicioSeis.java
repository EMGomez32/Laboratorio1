/*
 6. Realice una búsqueda secuencial en un arreglo unidimensional de tamaño 50 generado
aleatoriamente mediante la función java random.
Realice una búsqueda secuencial de la siguiente forma:
- se lee el valor que se desea buscar,
- se compara la primera posición;
- si son iguales,
- fin de la búsqueda.
- De lo contrario, compararlo con la segunda posición, y así sucesivamente.
- Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje
apropiado.
- Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por
primera vez.

 */
package trabajopracticotres;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int array[] = cargaArreglo();
        
        System.out.println("Ingrese el numero que desea buscar en el arreglo(a-100): ");
        int numero = lt.nextInt();
        int resultado=busqueda(array,numero);
        if(resultado !=50){
            System.out.println("El numero "+numero+" fue encontrado en la posicion: "+resultado);
        }
        else{
            System.out.println("El numero no fue encontrado");
        }
        mostrar(array);
    }
    public static int []cargaArreglo(){
        int arreglo[]=new int[50];
        
        for( int i=0 ;i<50 ;i++){
         arreglo[i]=(int)(Math.random()*100+1);
            }
            return arreglo;
    }
    public static int  busqueda(int array[], int numero){
        int resultado=0;
               
        for(int i=0 ;i<50 ;i++){
           if(array[i]== numero){
               resultado=i;
               i=50;
           } 
           else{
               resultado=50;
           }    
        }
        
        return resultado;
    }
       public static void mostrar(int arreglo[]){
            System.out.println("El arreglo que ingreso es :");
        System.out.print("[\t");
        for( int i=0 ;i<50 ;i++){
            System.out.print(arreglo[i]+"\t");
            }
            System.out.println("]"); 

       }
}
