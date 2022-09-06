/*
 4- Desarrolle un programa que ayude a una cajera a determinar el número de 
billetes y monedas que se necesitan de cada una de las siguientes 
denominaciones 200, 100, 50, 20, 10, 5, 2 y 1, y monedas de 0.50, 0.25, 0.10 y 
0.05 centavos para una cantidad de dinero dada. Ejemplo si la cantidad es 
1390,55 se necesitan 6 billetes de 200, 1 billete de 100, 1 billete de 50, 2 
billetes de 20, 1 moneda de 0.50 y una moneda de 0.05 centavos. 
 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioCuatro {


    public static void main(String[] args) {
       Scanner lt= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero: ");
        int billeteDoscientos=0,billeteCien=0, billeteCincuenta=0,billeteVeinte=0,
            billeteDiez=0,billeteUno=0,billeteDos=0,billeteCinco=0   ;
        float cantDinero = lt.nextFloat();
             
        
            while(cantDinero>=200){
               billeteDoscientos ++;
               cantDinero=cantDinero-200;
              }
            while(cantDinero>=100){
               billeteCien ++;
               cantDinero=cantDinero-100;
              }
            while(cantDinero>=50){
               billeteCincuenta ++;
               cantDinero=cantDinero-50;
              }
            while(cantDinero>=20){
               billeteVeinte ++;
               cantDinero=cantDinero-20;
              }
            while(cantDinero>=10){
               billeteDiez ++;
               cantDinero=cantDinero-20;
              }
            while(cantDinero>=5){
               billeteCinco ++;
               cantDinero=cantDinero-5;
              }
            while(cantDinero>=2){
               billeteDos ++;
               cantDinero=cantDinero-2;
              }
            while(cantDinero>=1){
               billeteUno ++;
               cantDinero=cantDinero-1;
              }
            int monedaCincuenta=0,monedaVeinticinco=0,monedaDiez=0,monedaCinco=0;
            
            cantDinero=cantDinero*100;      
            if(cantDinero!=0|| cantDinero!=5)
            {
                cantDinero+=1;
            }
           System.out.println(cantDinero);
           while(cantDinero>=50){
               monedaCincuenta ++;
               cantDinero=cantDinero-50;
              }
            while(cantDinero>=25){
               monedaVeinticinco ++;
               cantDinero=cantDinero-25;
              }
            while(cantDinero>=10){
               monedaDiez ++;
               cantDinero=cantDinero-10;
              }
            while(cantDinero>=5){
               monedaCinco ++;
               cantDinero=cantDinero-5;
              }
        if (billeteDoscientos!=0)System.out.println("cantidad de billetes de 200: "+billeteDoscientos);
        if (billeteCien!=0)System.out.println("cantidad de billetes de 100: "+billeteCien);
        if (billeteCincuenta!=0)System.out.println("cantidad de billetes de 50: "+billeteCincuenta);
        if (billeteVeinte!=0)System.out.println("cantidad de billetes de 20: "+billeteVeinte);
        if (billeteDiez!=0)System.out.println("cantidad de billetes de 10: "+billeteDiez);
        if (billeteCinco!=0)System.out.println("cantidad de billetes de 5: "+billeteCinco);
        if (billeteDos!=0)System.out.println("cantidad de billetes de 2: "+billeteDos);
        if (billeteUno!=0)System.out.println("cantidad de billetes de 1: "+billeteUno);
       
        if (monedaCincuenta!=0)System.out.println("cantidad de monedas de 0.50: "+monedaCincuenta); 
      if (monedaVeinticinco!=0) System.out.println("cantidad de monedas de 0.25: "+monedaVeinticinco); 
       if (monedaDiez!=0)System.out.println("cantidad de monedas de 0.10: "+monedaDiez); 
       if (monedaCinco!=0)System.out.println("cantidad de monedas de 0.05: "+ monedaCinco);
    }
    
}
