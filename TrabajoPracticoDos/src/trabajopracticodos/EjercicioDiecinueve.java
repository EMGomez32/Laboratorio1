/*
 19- Cree una clase OperacionMatematica con dos atributos numéricos decimales,
valor1 y valor2 y un atributo String de nombre operación. Cree los
correspondientes métodos get/set.
Agregue a la clase los siguientes 5 métodos:
private double sumarNumeros(){
return valor1 + valor2;
}
private double restarNumeros(){
return valor1 - valor2;
}
private double multiplicarNumeros(){
return valor1 * valor2;
}
private double dividirNumeros(){
return valor1 / valor2;
}
El quinto método será el siguiente:
public double aplicarOperacion(String operacion){
…………………..
}
Cree una clase Calculo que contenga un método main, donde cree una
instancia de la clase OperacionMatematica, asigne 2 valores para las variables
de la instancia y ejecute la función aplicarOperacion, pasando como parámetro
primero “+”, después “-”, a continuación “*” y finalmente “/”. Muestre por
pantalla el resultado de las operaciones.

 */
package trabajopracticodos;

import java.util.Scanner;

/**
 *
 * @author Emi
 */
public class EjercicioDiecinueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String operacion1;
        Scanner lt= new Scanner(System.in);
        OperacionesMatematica operacion = new OperacionesMatematica();
        
        System.out.println("Ingrese la operacion matematica que desea realizar \n"
                + " +(suma)\n -(resta)\n *(multiplicacion-9\n /(division)");
        operacion1= lt.nextLine();
        System.out.println("Ingrese el primer valor: ");
        operacion.setValor1(lt.nextDouble());
        System.out.println("Ingrese el segundo valor: ");
        operacion.setValor2(lt.nextDouble());
        
        
        System.out.println("la operacion soliciatada: "+operacion1+"Su resultado es :"+operacion.aplicarOperacion(operacion1));
        
    }
    
}
