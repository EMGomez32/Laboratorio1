/*
17- Cree una clase FuncionesPrograma y codifique una función estática que reciba
como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
……….
}
Cree una clase Principal que contenga un método main y haga uso de la función
getFechaString.
 */
package trabajopracticodos;

import java.util.Date;

/**
 *
 * @author Emi
 */
public class EjercicioDiecisiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fecha= new Date();
        
        System.out.println(FuncionesPrograma.getFechaString(fecha));
    }
    
}
