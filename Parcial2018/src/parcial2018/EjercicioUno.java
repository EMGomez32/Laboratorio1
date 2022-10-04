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
public class EjercicioUno {

    public static void main(String[] args) {
       
       int ingreso, acumulado=0, cantidad=0;
      
       do{
           ingreso= ingreso();
           acumulado+= ingreso;
           cantidad++;
           System.out.println("ACUMULADO: "+acumulado);
       }while(acumulado<1000000);
        
        System.out.println("Se necesitaron "+cantidad+" ingresos para superar el millon");
    }
    public static int ingreso(){
        int ingreso;
       do{
         Scanner lt = new Scanner(System.in);
           System.out.println("Ingrese un numero entero entre 0 y 100000");
         ingreso =lt.nextInt();
       }while(ingreso<0|| ingreso>100000);
    return ingreso;     
    }
           
}
