/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopracticodos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Emi
 */
public class FuncionesPrograma {

  public static String getFechaString(Date fecha){
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
     String getFechaString = sdf.format(fecha);
     
     
     
     return  getFechaString;
  }  
  public static Date getFechaDate(int dia, int mes, int anio){
    
         
        LocalDate LD = LocalDate.of(anio, mes, dia);
        Date getFechaDate = java.sql.Date.valueOf(LD);
    
    return getFechaDate;
    }
 
}
