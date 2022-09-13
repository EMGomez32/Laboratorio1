
package trabajopracticouno;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lt= new Scanner(System.in);
        int iva=21;
        System.out.println("Ingrese el precio del producto");
        float precio=lt.nextFloat();
        float precioFinal= (precio*iva/100)+precio;
        System.out.println("El valor a cobrar es : "+precioFinal);
    }
    
}
