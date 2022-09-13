/*
 3. Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y crear
una función que rellene el array o arreglo con los múltiplos de un numero pedido por
teclado. Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el array
contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.
 */
package trabajopracticotres;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamanio, multiplicador;
        Scanner lt = new Scanner(System.in);
        do{
            System.out.println("Ingrese el tamanio del arreglo que desea caragar: ");
            tamanio= lt.nextInt();
        }while(tamanio<0);
       
            System.out.println("Ingrese el multiplicador: ");
            multiplicador= lt.nextInt();
            muestra(multiplicador, tamanio);
        
    }

    public static int []cargaArreglo(int multiplicador, int tamanio){
        int arreglo[]=new int[tamanio];
        System.out.println("Ingrese los valores numericos del arreglo: ");
        for( int i=0 ;i<tamanio ;i++){
         arreglo[i]=multiplicador*(i+1);
            }
            return arreglo; 
    }
    public static void muestra(int multiplicador, int tamanio){
        int arreglo[]= cargaArreglo(multiplicador, tamanio);
        
        System.out.println("El arreglo que ingreso es :");
        System.out.print("[\t");
        for( int i=0 ;i<tamanio ;i++){
            System.out.print(arreglo[i]+"\t");
            }
        System.out.println("]");
    }
    
    
        }

