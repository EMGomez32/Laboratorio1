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
public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lt= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numUno= lt.nextInt();
        System.out.println("Ingrese otro numero");
        int numDos= lt.nextInt();
        if (numUno == numDos)
        {
            System.out.println("Los Numeros son Iguales");
        }
        else
        {
            if(numUno>numDos)
            {
                System.out.println(numUno+"Es Mayor a :"+numDos);
            }
            else{
                System.out.println(numDos+" Es Mayor a :"+numUno);
            }
        }
        
    }
    
}
