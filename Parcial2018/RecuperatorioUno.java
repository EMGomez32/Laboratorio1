package recuperatoriouno;

/**
 *
 * @author Maximiliano Gomez
 */
import java.util.Scanner;

public class RecuperatorioUno {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Juego3EnLinea tresLineas = new Juego3EnLinea();

        int f, c; //f= fila, c= columna
        boolean posValida, correcto;

        while (!tresLineas.finPartida()) {

            do {
                tresLineas.mostrarTurnoActual();
                tresLineas.mostrarArea();
                correcto = false;
                f = pedirInteger("Ingrese fila");
                c = pedirInteger("Ingrese columna");

                posValida = tresLineas.validarP(f, c);

                if (posValida) {
                    if (!tresLineas.hayValorPosicion(f, c)) {
                        correcto = true;
                    } else {
                        System.out.println(" Posicion ocupada!!!");
                    }
                } else {
                    System.out.println("La posicion no valida!!!");
                }
            } while (!correcto);
            tresLineas.insertar(f, c);
            tresLineas.cambiaTurno();
        }
        tresLineas.mostrarArea();
        tresLineas.mostrarGanador();
    }
    
    public static int pedirInteger(String mensaje) {
        System.out.println(mensaje);
        int numero = teclado.nextInt();
        return numero;
    }
}
