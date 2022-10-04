/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2018;

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
       Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese tamanio del arreglo");
        int tamanio = sc.nextInt();
        int[] numerosTotal = new int[tamanio];
        int contador = 0;
        int contadorimpares = 0;
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese valor para la posicion " + i);
            numerosTotal[i] = sc.nextInt();
        }
        for (int i = 0; i < tamanio; i++) {
            if (numerosTotal[i] % 2 == 0) {
                contador += 1;
            } else {
                contadorimpares += 1;
            }
        }
        int[] numerosPares = new int[contador + 1];
        int[] numerosImpares = new int[contadorimpares + 1];
        int j = 0;
        int k = 0;
        for (int i = 0; i < tamanio; i++) {
            if (numerosTotal[i] % 2 == 0) {
                numerosPares[j] = numerosTotal[i];
                j += 1;
            } else {
                numerosImpares[k] = numerosTotal[i];
                k += 1;
            }
        }
        System.out.println("Pares");
        for (int i = 0; i < contador - 1; i++) {
            System.out.print(numerosPares[i] + "/");
        }
        System.out.println(numerosPares[contador - 1]);

        System.out.println("Impares");
        for (int i = 0; i < contadorimpares - 1; i++) {
            System.out.print(numerosImpares[i] + "/");
        }
        System.out.println(numerosImpares[contadorimpares - 1]);

        int[] multi = new int[contador];
        for (int i = 0; i < contador; i++) {
            for (int p = 0; p < contadorimpares; p++) {
                multi[i] += numerosPares[i] * numerosImpares[p];
            }
        }
        System.out.println("Matriz");
        for (int i = 0; i < contador - 1; i++) {
            System.out.print(multi[i] + "/");
        }
        System.out.println(multi[contador - 1]);
    }
    }
    

