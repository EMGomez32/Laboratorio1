
import java.util.Scanner;
/*
EJERCICIO 2
Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un
primer array de tamaño [X,Y] de tipo entero y almacene en cada posición un valor
entero que deberá ser ingresado por el usuario. A continuación cree un segundo
array de tamaño [Y,X] y almacene en cada posición un valor entero que deberá ser
ingresado por el usuario. Finalmente cree un tercer array de tamaño [X,Y] que será
el resultante de multiplicar cada una de las posiciones de las filas del array uno por
cada una de las posiciones de las columnas del array 2.
Muestre por pantalla cada uno de los arrays con sus valores.
 */
public class EjercicioDos {
       public static void main(String[] args) {
       Scanner lt= new Scanner(System.in);
           System.out.println("Ingrese un valor x");
           int x= lt.nextInt();
           System.out.println("Ingrese un valor y");
           int y=lt.nextInt();
           int primerMatriz[][]= new int[x][y];
           
           System.out.println("Ingrse los valores de la primer matriz");
           for(int i=0; i<x;i++){
            for(int j=0; j<y;j++){
                System.out.println("Ingrse el valor ["+i+"]["+j+"]: "); 
                primerMatriz[i][j]=lt.nextInt();
            }
           }
          int segundaMatriz[][]= new int[y][x]; 
          System.out.println("Ingrse los valores de la segunda matriz");
           for(int i=0; i<y;i++){
            for(int j=0; j<x;j++){
                System.out.println("Ingrse el valor ["+i+"]["+j+"]: "); 
                segundaMatriz[i][j]=lt.nextInt();
            }
           }
           int tercerMatriz[][]=new int[x][x];
           for(int i=0; i<x;i++){
            for(int j=0; j<x;j++){
                for(int k=0; k<primerMatriz.length;k++){
                    tercerMatriz[i][j]+=primerMatriz[i][k]*segundaMatriz[k][j];
  
                }
            }
           }
           System.out.println("La tercer matriz nos quedaria: ");
           for(int i=0; i<x;i++){
            for(int j=0; j<x;j++){
                System.out.print(tercerMatriz[i][j]+"\t");
            }
               System.out.println(" ");
           }
           
    }
    
}
