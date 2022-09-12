/*
18- En la clase FuncionesPrograma codifique una función estática que reciba como
parámetro 3 valores enteros, día, mes, anio y retorne la fecha de tipo Date
correspondiente.
public static Date getFechaDate(int día, int mes, int anio){
……….
}
En la clase Principal creada en el punto anterior haga uso de la función
getFechaDate.
 */
package trabajopracticodos;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioDieciocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Date fecha;
         int dia,mes,anio;
         Scanner lt= new Scanner(System.in);
         System.out.println("Ingrese el dia");
         dia = lt.nextInt();
         System.out.println("Ingrese el mes");
         mes = lt.nextInt();
         System.out.println("Ingrese el año");
         anio = lt.nextInt();
         fecha =FuncionesPrograma.getFechaDate(dia, mes, anio);
         System.out.println("La fecha ingresada es: "+fecha);
    }
    
}
