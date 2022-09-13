
package trabajopracticouno;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioOnce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lt= new Scanner(System.in);
        String contrasenia= "Emiliano#32";
        String pasword;
        int i=1;
        do{
            System.out.println("Ingrese su contraseña*-*-*-* INTENTO: "+i);
            pasword=lt.next();
        if(pasword.equals(contrasenia)){
            System.out.println("Acceso Correcto");
            i=4;
            
        }
        else{
            i++;
        }
        }while(i<=3);
        
        
        
    }
    
}
