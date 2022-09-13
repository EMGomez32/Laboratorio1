/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticouno;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Emiliano
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Utilizo Scanner
        Scanner leerTeclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre= leerTeclado.nextLine();
        System.out.println("Bienvenido "+nombre);
        //Utilizo JOptionPane
        
       String nombreUno = JOptionPane.showInputDialog("Introduce tu nombre");
       JOptionPane.showMessageDialog(null, "Bienvenido "+nombreUno);
    }
    
}
