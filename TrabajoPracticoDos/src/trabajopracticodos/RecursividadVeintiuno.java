/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopracticodos;

/**
 *
 * @author Emi
 */
public class RecursividadVeintiuno {
    public int suma(int numero){
        if (numero>=2){
            int resultado = numero+ suma(numero-1);
            return resultado;
        }
        return 1;
    }
}
