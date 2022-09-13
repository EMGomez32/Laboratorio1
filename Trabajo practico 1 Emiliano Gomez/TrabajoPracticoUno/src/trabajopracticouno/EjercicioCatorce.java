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
public class EjercicioCatorce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = new Double(Math.random()*100).intValue();
        int intentos=0;
        int bandera=0;
        do{
            System.out.println("ADIVINE EL NUMERO ");
            System.out.println("Ingrese el numero ");
            Scanner lt=new Scanner(System.in);
            int y=lt.nextInt();
            if(x==y){
                System.out.println("Felicitciones Adivinaste el numero");
                intentos+=1;
                System.out.println("Cantidad de intentos: "+intentos);
                bandera=10;
            }
            else{
                if(y>x){
                    System.out.println("El numero que ingresaste: "+y +" es mayor");
                    intentos+=1;
                }
                else{
                    System.out.println("El numero que ingresaste: "+y+" es menor");
                    intentos+=1;
                }
            }
        }while(bandera<5);
    }
    
}
