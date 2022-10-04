
import java.util.Scanner;

/*
 EJERCICIO 4
Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o
igual a 10. Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú
con estas opciones:
a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
c) Suma de una columna que se pedirá al usuario (controlar que elija una
correcta)
d) Sumar la diagonal principal
e) Sumar la diagonal inversa
f) La media de todos los valores de la matriz
IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se
deberán de ejecutar, simplemente mostrar un mensaje que diga que debes
rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de cada una de
las opciones del menú.
 */
public class EjercicioCuatro {

    public static void main(String[] args) {
       Scanner lt = new Scanner(System.in);
       int X=0;
       while(X<4 || X>10){
           System.out.println("Ingrese el valor entero X: ");
           X=lt.nextInt();
       }
       
       menu(X);
    } 
     public static void menu(int x){
         Scanner lt = new Scanner(System.in);
         boolean salir=false, bandera = true;
         String opcion;
         int matriz[][]= new int [x][x];
        if(bandera){
             matriz=rellenarMatriz(matriz);
             
         }
         
         while(!salir){
          System.out.println("-----------------------------------------------");
             System.out.println("a) Rellenar TODA la matriz de números");
             System.out.println("b) Suma de una fila que se pedirá al usuario");
             System.out.println("c) Suma de una columna que se pedirá al usuario");
             System.out.println("d) Sumar la diagonal principal");
             System.out.println("e) Sumar la diagonal inversa");
             System.out.println("f) La media de todos los valores de la matriz");
             System.out.println("g) Salir");
          System.out.println("-----------------------------------------------");
             System.out.println("Ingrese la opcion deseada");
             opcion= lt.nextLine();
             if(opcion.equals("a")){
                matriz=rellenarMatriz(matriz);
             }else if(opcion.equals("b")){
                 sumaFila(matriz) ;   
             }else if(opcion.equals("c")){
                 sumaColumna(matriz);       
             }else if(opcion.equals("d")){
                 sumaDiagonalPrincipal(matriz);            
             }else if(opcion.equals("e")){
                 sumaDiagonalInversa(matriz);                
             }else if(opcion.equals("f")){
                  media(matriz) ;                  
             }else if(opcion.equals("g")){
                   salir = true;  
             }else{
                   System.out.println("Opción Incorrecta. Intente nuevamente.");
                   System.out.println("----------------------");
                   }
                                 
         
    }
     }
    public static int [][]rellenarMatriz(int matriz[][]){
     Scanner lt= new Scanner(System.in);
       int matrizCargada[][]= new int[matriz.length][matriz[0].length];  
       for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[0].length;j++){
                System.out.println("Ingrse el valor ["+i+"]["+j+"]: "); 
                matrizCargada[i][j]=lt.nextInt();
            }
           } 
       return  matrizCargada;   
    }
    public static void sumaFila(int matriz[][]){
        Scanner lt = new Scanner(System.in);
        int suma=0, f=-1;
        while(f>=matriz.length||f<0){
            System.out.println("Ingrese la  fila que desee sumar (0 al"+matriz.length+"): ");
            f=lt.nextInt();
        }
        
        for(int j=0; j<matriz[0].length;j++){
            suma+=matriz[f][j];
        }
        
        System.out.println("La suma de la fila: "+f+" es: "+suma); 
    }
    public static void sumaColumna(int matriz[][]){
       Scanner lt = new Scanner(System.in);
        int suma=0, c=-1;
        while(c>=matriz[0].length|| c<0){
            System.out.println("Ingrese la  columna que desee sumar (0 al"+(matriz[0].length-1)+"): ");
            c=lt.nextInt();
        }
        
        for(int i=0; i<matriz[0].length;i++){
            suma+=matriz[i][c];
        }
        
        System.out.println("La suma de la columna: "+c+" es: "+suma); 
    }
    public static void sumaDiagonalPrincipal(int matriz [][]){
        int suma=0;
        for(int i=0; i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                if(i==j){
                    suma+=matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: "+suma);
    }
    public static void sumaDiagonalInversa(int matriz [][]){
        int resultado = 0;
        int i = 0, j = matriz.length - 1;
        while (i < matriz.length && j >= 0) {
            resultado += matriz[j][i];
            i++;
            j--;
        }

        System.out.println("La suma de la diagonal inversa es: \n" + resultado );

    }
    public static void media (int matriz[][]){
      int suma=0,  contador=0;
      float media;
        for(int i=0; i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                
                    suma+=matriz[i][j];
                contador ++;
            }
        }
        media=suma/contador;
        System.out.println("La media de la matriz es : "+media);  
    }
    
}
