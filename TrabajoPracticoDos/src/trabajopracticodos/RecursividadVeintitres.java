/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopracticodos;

/**
 *
 * @author Emi
 */
public class RecursividadVeintitres {
  public String vuelta(String cadena, int longitud){
      if(longitud==0){
            return cadena.charAt(longitud)+"";
        }
        else{
            return cadena.charAt(longitud)+vuelta(cadena, longitud-1);
        }
      
  }  
}
