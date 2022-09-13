
package trabajopracticouno;

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
          
         int numero, contador, i;
         Scanner Lt = new Scanner(System.in);
         System.out.println("Ingrese un numero para saber si es primo");
         numero = Lt.nextInt();
          contador=0;
         for(i=1; i<=numero;i++){
             if((numero%i)==0){
                 contador++;
             }
         }
         if(contador==2){
             System.out.println("el numero es primo");
         }else{
             System.out.println("el numero no es primo");
         }

    }
    
}
