/*
 * 20- Cree una clase Fracción con dos atributos numéricos enteros, numerador y
denominador. Agregue un constructor sobrecargado (debe contener como
parámetros el numerador y el denominador) que cree el objeto Fracción
correspondiente.
Agregue a la clase los siguientes 4 métodos e implemente los mismos:
public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
……….
}
Cree una clase OperacionesFraccion que contenga un método main donde se
solicite al usuario el ingreso de 4 valores numéricos enteros con los cuales se
crearan 2 objetos Fracción y finalizada la creación de los mismos se ejecutaran
los 4 métodos implementados anteriormente asignando el resultado a una
nueva variable de tipo Fracción y mostrando por pantalla el resultado de las
operaciones realizadas.

 */
package trabajopracticodos;

import java.util.Scanner;


public class OperacionesFraccion {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Ingrese la primer fraccion");
        Fraccion a =new Fraccion(lt.nextInt(),lt.nextInt());
        System.out.println("Ingrese la segunda fraccion");
        Fraccion b =new Fraccion(lt.nextInt(),lt.nextInt());
        Fraccion suma=a.sumarFracciones(a, b);
        System.out.println("La suma de las fracciones es : "+ suma.getNumerador()+"/"+suma.getDenominador());
        Fraccion resta= a.restarFracciones(a, b);
        System.out.println("La resta de las fracciones es : "+ resta.getNumerador()+"/"+resta.getDenominador());
        Fraccion multiplicacion=a.multiplicarFracciones(a, b);
        System.out.println("La multiplicacion de las fracciones es : "+ multiplicacion.getNumerador()+"/"+multiplicacion.getDenominador());
        Fraccion division=a.dividirFracciones(a, b);
        System.out.println("La divisionde las fracciones es : "+ division.getNumerador()+"/"+division.getDenominador());
    }
    
}
