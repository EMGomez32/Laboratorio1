
import java.util.Scanner;

/*
EJERCICIO 1
Crea un programa que pida por pantalla cuatro países y a continuación tres
ciudades de cada uno de estos países. Los nombres de ciudades deben
almacenarse en un array multidimensional cuyo primer índice sea el número
asignado a cada país y el segundo índice el número asignado a cada ciudad. Es decir
el array deberá tener un tamaño de 4x4
Ejemplo de resultados que debe mostrar el programa:
País: Argentina Ciudades: Buenos Aires Cordoba La Plata
País: España Ciudades: Madrid Lugo Sevilla
País: Francia Ciudades: Paris Niza Lyon
País: Italia Ciudades: Roma Napoles Sicilia

 */

/**
 *
 * @author Emi
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
      String paisesCiudades [][]= new String [4][4];
        System.out.println("Ingrese 4 paises");
        for(int i=0; i<4;i++){
            paisesCiudades[i][0]=lt.nextLine();
        }
        for(int i=0; i<4;i++){
            System.out.println("Ingrese 3 ciudades del pais: "+paisesCiudades[i][0]);
            for(int j=1;j<4;j++){
               paisesCiudades[i][j]=lt.nextLine(); 
            }
        }
        for(int i=0; i<4;i++){
            System.out.print("Pais: ");
            for(int j=0; j<4;j++){
               if (j==1){
                   System.out.print("ciudades:");
               }
                System.out.print(paisesCiudades[i][j]+"\t");
                if(j==3){
                    System.out.print("\n");
                }
            }
        }
    }
    
}
