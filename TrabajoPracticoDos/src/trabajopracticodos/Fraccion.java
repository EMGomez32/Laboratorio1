/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopracticodos;

/**
 *
 * @author Emi
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public Fraccion sumarFracciones(Fraccion a, Fraccion b){
     return new Fraccion((a.getNumerador() * b.getDenominador() + b.getNumerador() * a.getDenominador()),
                a.getDenominador() * b.getDenominador());
        
    }
public Fraccion restarFracciones(Fraccion a, Fraccion b){
return new Fraccion((a.getNumerador() * b.getDenominador() - b.getNumerador() * a.getDenominador()),
                a.getDenominador() * b.getDenominador());
    }
public Fraccion multiplicarFracciones(Fraccion a, Fraccion b){
return new Fraccion(a.getNumerador() * b.getNumerador(),
                a.getDenominador() * b.getDenominador());
    }
public Fraccion dividirFracciones(Fraccion a, Fraccion b){
return new Fraccion(a.getNumerador() * b.getDenominador(),
                a.getDenominador() * b.getNumerador());
    }
}

    

    
   