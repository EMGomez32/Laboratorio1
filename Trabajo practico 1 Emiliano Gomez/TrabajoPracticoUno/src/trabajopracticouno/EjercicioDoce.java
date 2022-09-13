/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticouno;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioDoce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner lt= new Scanner(System.in);
        int numero;
    do{
        System.out.println("Ingrese el dia de la semana");
        numero=lt.nextInt();
    }while(numero<1 || numero>7);    
    switch(numero){
        case 1 -> System.out.println("Dia laboral Lunes");
        case 2 -> System.out.println("Dia laboral Martes");
        case 3 -> System.out.println("Dia laboral Miercoles");
        case 4 -> System.out.println("Dia laboral Jueves");
        case 5 -> System.out.println("Dia laboral Viernes");
        case 6 -> System.out.println("Dia no laboral Sábado");
        case 7 -> System.out.println("Dia no laboral Domingo");
    }
    }
    
}
