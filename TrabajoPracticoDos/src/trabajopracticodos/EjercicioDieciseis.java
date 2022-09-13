/*
16- Como transformo una variable tipo Double a una variable tipo double.
 */
package trabajopracticodos;

/**
 *
 * @author Emi
 */
public class EjercicioDieciseis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double Value = 12.34;
        String valueS= (String)Value;
        System.out.println(Value);
        double doubleValue = Double.parseDouble(Value);
        System.out.println("Converted value: "+doubleValue);
    }
    
}
