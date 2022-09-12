/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopracticodos;

/**
 *
 * @author Emi
 */
public class RecursividadVeintidos {
    public int Suma(int num){
        if(num==0){
            return 0;
        } else {
            return Suma(num/10) + num%10;
        }
        
    }
}
