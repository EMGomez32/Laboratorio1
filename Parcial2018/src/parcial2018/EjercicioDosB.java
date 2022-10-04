/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2018;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class EjercicioDosB {

        static String cadena ="";
    
    public static void main(String[] args) {
        double num;
        int cont=0;
        do{
            System.out.println("Ingrese numeros decimales");
            num = new Scanner(System.in).nextDouble();
            cont++;
            numCadena(num);
        }while(num>=0);
        System.out.println("Se ingresaron " + (cont-1) + " numeros");
        System.out.println("La cadena ingresada es " + cadena);
        System.out.println("Ingrese un valor positivo para agrupar la cadena");
        int elementosGrupo;
        String[] numCad = cadena.split("-");
        do {
            elementosGrupo=new Scanner(System.in).nextInt();
        } while (elementosGrupo<0 || elementosGrupo>numCad.length);
        agrupar(numCad, elementosGrupo);
    }
    public static void numCadena(double num){
        if(num<0){
            cadena = cadena.substring(0, cadena.length()-1);
        }else {
            cadena = cadena + String.valueOf(num) + "-";
        }
    }
    public static void agrupar(String[] numCad, int elementosGrupo){
        int cantGrupos= numCad.length/elementosGrupo;
        if (numCad.length%elementosGrupo!=0) {
            cantGrupos++;
   
        }
        String[] arregloGrupo= new String[cantGrupos];
        int j=0;
        for (int i = 0; i < arregloGrupo.length; i++) {
            arregloGrupo[i]= "";
        }
        for (int i = 0; i < numCad.length; i++) {
            if(i==0){
                arregloGrupo[j] = arregloGrupo[j] + numCad[i] + "-";
            }else{
                if (i%elementosGrupo==0) {
                  j++;
                  arregloGrupo[j] = arregloGrupo[j] + numCad[i] + "-";
                }else{
                  arregloGrupo[j] = arregloGrupo[j] + numCad[i] + "-";
                }
            }
        }
        for (int i = 0; i < arregloGrupo.length; i++) {
            System.out.println(arregloGrupo[i].substring(0, arregloGrupo[i].length()-1));
        }
    }
}
