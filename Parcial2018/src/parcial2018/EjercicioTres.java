
package parcial2018;

import java.util.Scanner;

public class EjercicioTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j','k','l','m','n','o', 
'p','q','r','s','t','u','v','w','x','y','z', ' '};
    
    int [] palabras = new int [10];
    Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese 10 numeros entre 0 y 26");
        for(int i=0; i<10;i++){
            do{
              palabras[i]=lt.nextInt();
            }while(palabras[i]<0||palabras[i]>26);
        }
        char []cadena=new char[10]; 
    for(int i=0; i<10;i++){
        cadena[i]= alfabeto[palabras[i]];
    }       
   for(int i=0; i<10;i++){
       System.out.print(palabras[i]+"\t");   
   }
        System.out.println("");
   for(int i=0; i<10;i++){
       System.out.print(cadena[i]+"\t");   
   }
}          
      

}
