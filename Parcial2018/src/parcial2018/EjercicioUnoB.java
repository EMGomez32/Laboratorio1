package parcial2018;

import java.util.Scanner;

public class EjercicioUnoB {
public static void main(String[] args) {
        String cadenas = "";
        String cadena;
        do {
            cadena = ingresarCadenaValida();
            tamanioCadena(cadena);
            contieneNumeros(cadena);
            cadenas += cadena + " ";
            esRepetida(cadena, cadenas);
        } while (!cadena.equals("000"));
        System.out.println("Las cadenas ingresadas son: " + cadenas);
    }

    public static String ingresarCadenaValida() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = sc.nextLine();
        if (cadena.trim().length() == 0) { // trim para quitar los espacios de los costados
            System.out.println("La cadena no puede estar vacía");
            return ingresarCadenaValida();
        }

        return cadena;
    }

    public static void tamanioCadena(String cadena) {
        System.out.println("El tamaño es de " + cadena.length());
    }

    public static void contieneNumeros(String cadena) {
        //if(cadena.contains(1)) // string contain es especifico a una cadena, mejor utilizar Regex
        int contador=0;
        for(int i=0;i<cadena.length();i++){
            char carac= cadena.charAt(i);
            if (carac == '1'||carac == '2'||carac == '3'||carac == '4'||carac == '5'
            ||carac == '6'||carac == '7'||carac == '8'||carac == '9'||carac == '0') { 
            System.out.println("Contiene números");
            i=cadena.length();
            }else{
               contador++; 
            }
        }
        if(contador== cadena.length()){
         System.out.println("No Contiene Numeros");   
        }
       
       
    }

    public static void esRepetida(String cadena, String cadenas) {
        String[] cadenasArray = cadenas.split(" ");
        if (cadenasArray.length == 1) {
            System.out.println("Es la primera");
            return;
        }

        if (cadenasArray[cadenasArray.length - 2].equals(cadena)) {
            System.out.println("La cadena es igual a la anterior");
        }else{
            System.out.println("No es igual a la anterior");
        }
    }
    
}
