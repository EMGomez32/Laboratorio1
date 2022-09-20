
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Emi
 */
public class EjercicioDosFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lt= new Scanner(System.in);
           System.out.println("Ingrese un valor x");
           int x= lt.nextInt();
           System.out.println("Ingrese un valor y");
           int y=lt.nextInt();
           System.out.println("Ingrese los valores de su primer matriz");
           int primerMatriz[][]=ingresoMatrices(x, y);
           System.out.println("Ingrese los valores de su segunda matriz");
           int segundaMatriz[][]=ingresoMatrices(y, x);
           int terceraMatriz[][]=multiplicacionMatrice(primerMatriz, segundaMatriz, x);
           mostrar(primerMatriz);
           System.out.println("*");
           mostrar(segundaMatriz);
           System.out.println("=");
           mostrar(terceraMatriz);
    }
    public static int [][]ingresoMatrices(int x, int y){
        Scanner lt= new Scanner(System.in);
        int matrizCargada[][]= new int[x][y];
      
       for(int i=0; i<x;i++){
            for(int j=0; j<y;j++){
                System.out.println("Ingrse el valor ["+i+"]["+j+"]: "); 
                matrizCargada[i][j]=lt.nextInt();
            }
           } 
       return matrizCargada;
    }
    public static int [][]multiplicacionMatrice(int primeraMatriz[][],int segundaMatriz[][], int x){
        int resultante[][]=new int [x][x];
        for(int i=0; i<x;i++){
            for(int j=0; j<x;j++){
                for(int k=0; k<resultante.length;k++){
                    resultante[i][j]+=primeraMatriz[i][k]*segundaMatriz[k][j];
  
                }
            }
           }
        return resultante;
    }
    public static void mostrar(int matriz[][]){
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
               System.out.println(" ");
           }
    }
}
