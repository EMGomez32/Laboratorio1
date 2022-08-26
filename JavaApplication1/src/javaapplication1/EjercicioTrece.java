
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioTrece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String opcion;
        Scanner lt=new Scanner(System.in);
       //do{
        System.out.println("Ingrese el numero q desea saber si es primo");
        int numero =lt.nextInt();
        int bandera=5;
        if(numero<=0 || numero==1||numero==4 ){
            System.out.println("el numero ingresado: "+numero+" no es primo");
            bandera=1;
        }
        
            for(int x=2;x<numero/2;x++){
            if(numero%x==0)
                System.out.println("el numero ingresado: "+numero+" no es primo");
            bandera=1;       
        }
        if(bandera<=10){
            System.out.println("el numero ingresado: "+numero+" es primo");
        }
        //System.out.println("Desea averiguar otro numero s/n");
        //opcion=lt.next();
       //}while(opcion.equals("si"));
    }
    
}
