/*
 5. Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares
del 1 al 100, de los cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético
 */
package trabajopracticotres;


public class EjercicioCinco {

    public static void main(String[] args) {
       int arreglo[]= cargaArreglo();
       float prom= promedio(arreglo);
       int resultado[]= mayorMenor(arreglo, prom);
        mostrar(arreglo, prom, resultado);
    }
   public static int []cargaArreglo(){
        int arreglo[]=new int[20];
        int x;
        for( int i=0 ;i<20 ;i++){
        do{
          x = (int)(Math.random()*100+1);  
        }while( x%2!=0);
            arreglo[i]=x;
        }
            return arreglo; 
    }   
   public static float promedio(int arreglo[]){
       float promedio, suma=0;
       for(int i =0;i<20;i++){
           suma+= arreglo[i];
       }
       promedio=suma/20;
       return promedio;
   }
   public static int  []mayorMenor(int arreglo[], float prom){
       int resultado[]=new int[3];
       int mayor=0, menor=0,igual=0;
        for(int i=0; i <20;i++){
             if(arreglo[i]>prom){
                mayor++;
                }
             if (arreglo[i]<prom){
                menor++;
                }
             if(arreglo[i]==prom){
                igual++;
                }
        }
        resultado[0]=mayor;
        resultado[1]=menor;
        resultado[2]= igual;
        return resultado;
        }
   public static void mostrar(int arreglo[],float prom, int resultado[]){
      System.out.println("El arreglo que ingreso es :");
        System.out.print("[\t");
        for( int i=0 ;i<20 ;i++){
            System.out.print(arreglo[i]+"\t");
            }
        System.out.println("]"); 
        System.out.println("su promedio aritmético es :"+prom);
        System.out.println("los números iguales al promedio aritmético son: "+resultado[2]);
        System.out.println("los números mayores que el promedio aritmético son: "+resultado[0]);
        System.out.println("los números  menores que el promedio aritmético son: "+resultado[1]);
   }
   
}
   
   

