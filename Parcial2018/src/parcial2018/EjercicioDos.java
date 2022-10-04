
package parcial2018;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
       String cadenaMin;
       boolean espacio;
       do{
       cadenaMin= validacionMin();
       espacio=sinEspacio(cadenaMin);
       }while(espacio==true);
        System.out.println("Entrada: ");
        System.out.println(cadenaMin);
       separacion(cadenaMin);   
    }

    public static String validacionMin(){
        Scanner lt =new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una cadena de 50 caracteres y sin espacio");
        cadena=lt.nextLine();
        while(cadena.length()<50){
            System.out.println("Cadena No Valida");
            System.out.println("Ingrese nuevamente");
            cadena=lt.nextLine();
        } 
        return cadena;
    }
   public static boolean sinEspacio(String cadena){
       boolean bandera=false;
       for(int i=0;i<cadena.length();i++){
           char caracter= cadena.charAt(i);
           if(caracter == ' ') {
               bandera=true;
             i=cadena.length();
               System.out.println("Cadena No Valida");
           }
        }
      return bandera;     
       }
    public static void separacion(String cadena){
        String letras="" , numeros="";
        for(int i=0;i<cadena.length();i++){
            char carac= cadena.charAt(i);
         if(carac == '1'||carac == '2'||carac == '3'||carac == '4'||carac == '5'
            ||carac == '6'||carac == '7'||carac == '8'||carac == '9'||carac == '0'){
                numeros +=carac;
            }
         
        }
        for(int i =0;i<=9;i++){
           cadena=cadena.replace(String.valueOf(i),"");
        }
        
        System.out.println("SALIDA: ");
        System.out.println(cadena);
        System.out.println(numeros);
        
    }   
       
   } 

