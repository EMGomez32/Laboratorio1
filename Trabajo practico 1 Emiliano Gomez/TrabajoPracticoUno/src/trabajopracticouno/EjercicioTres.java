/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticouno;

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
        Scanner lt = new Scanner(System.in);
               
        System.out.println("Ingrese el primer numero");
        int numeroUno=lt.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numeroDos=lt.nextInt();
        int suma= numeroUno+numeroDos;
        int resta= numeroUno-numeroDos;
        int multiplicacion= numeroUno*numeroDos;
        int division= numeroUno/numeroDos;
        int resto= numeroUno%numeroDos;
        System.out.println("El resultado de la Suma= "+suma);
        System.out.println("El resultado de la Resta= "+resta);
        System.out.println("El resultado de la Multiplicacion= "+multiplicacion);
        System.out.println("El resultado de la Division= "+division);
        System.out.println("El resultado del Resto = "+resto);
    }
    
}
