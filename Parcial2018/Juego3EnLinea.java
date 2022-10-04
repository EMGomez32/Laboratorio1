package recuperatoriouno;

/**
 *
 * @author Maximiliano Gomez
 */
public class Juego3EnLinea {

    private final char JUGADOR1 = 'O';
    private final char JUGADOR2 = 'X';
    private final char VACIO = '-';

    private boolean turno;
    private char area[][];

    public Juego3EnLinea() {
        this.turno = true;
        this.area = new char[10][10];
        this.inicializarTablero();
    }

    private void inicializarTablero() {

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                area[i][j] = VACIO;
            }
        }
    }

    public boolean finPartida() {
        if (tableroLleno()
                || coincidenciaLinea() != VACIO
                || coincidenciaColumna() != VACIO) {
            return true;
        }
        return false;
    }

    public boolean tableroLleno() {
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[0].length; j++) {
                if (area[i][j] == VACIO) {
                    return false;
                }
            }
        }
        return true;
    }

    private char coincidenciaLinea() {

        char simbolo;
        boolean coincidencia;
        for (int i = 0; i < area.length; i++) {

            coincidencia = true;

            simbolo = area[i][0];
            if (simbolo != VACIO) {
                for (int j = 1; j < 3; j++) {

                    if (simbolo != area[i][j]) {
                        coincidencia = false;
                    }
                }

                if (coincidencia) {
                    return simbolo;
                }
            }
        }

        return VACIO;
    }

    private char coincidenciaColumna() {

        char simbolo;
        boolean coincidencia;

        for (int j = 0; j < area.length; j++) {

            coincidencia = true;

            simbolo = area[0][j];
            if (simbolo != VACIO) {
                for (int i = 1; i < 3; i++) {

                    if (simbolo != area[i][j]) {
                        coincidencia = false;
                    }
                }

                if (coincidencia) {
                    return simbolo;
                }
            }
        }

        return VACIO;
    }

    public void mostrarGanador() {
        char simbolo = coincidenciaLinea();
        if (simbolo != VACIO) {
            ganador(simbolo, 1);
            return;
        }

        simbolo = coincidenciaColumna();
        if (simbolo != VACIO) {
            ganador(simbolo, 2);
            return;
        }
        System.out.println("Hay empate");
    }

    private void ganador(char simbolo, int tipo) {

        switch (tipo) {
            case 1:
                if (simbolo == JUGADOR1) {
                    System.out.println("Ha ganado el Jugador 1 por linea");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por linea");
                }
                break;
            case 2:
                if (simbolo == JUGADOR1) {
                    System.out.println("Ha ganado el Jugador 1 por columna");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por columna");
                }
                break;
        }
    }

    public void insertar(int fila, int columna) {
        if (turno) {
            this.area[fila][columna] = JUGADOR1;
        } else {
            this.area[fila][columna] = JUGADOR2;
        }
    }

    public void mostrarArea() {
        for (int i = 0; i < this.area.length; i++) {
            for (int j = 0; j < this.area[0].length; j++) {
                System.out.print(this.area[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void mostrarTurnoActual() {

        if (turno) {
            System.out.println("Le toca al jugador 1");
        } else {
            System.out.println("Le toca al jugador 2");
        }
    }

    public void cambiaTurno() {
        this.turno = !this.turno;
    }

    public boolean validarP(int fila, int columna) {
        if (fila >= 0 && fila < area.length && columna >= 0 && columna < area.length) {
            return true;
        }
        return false;
    }

    public boolean hayValorPosicion(int fila, int columna) {
        if (this.area[fila][columna] != VACIO) {
            return true;
        }

        return false;
    }

}
