public class Tablero {
    private char[][] tablero;

    public Tablero() {
        tablero = new char[3][3];
        for(int fila = 0; fila < 3; fila++) {
            for(int columna = 0; columna < 3; columna++) {
                tablero[fila][columna] = ' ';
            }
        }
    }

    public void mostrarTablero(){

        System.out.println("\n " + "1" + "|" + " " + "2" + " " + "|" + "3" + " ");
        System.out.println("---------");
        System.out.println(" " + "4" + "|" + " " + "5" + " " + "|" + "6" + " ");
        System.out.println("---------");
        System.out.println(" " + "7" + "|" + " " + "8" + " " + "|" + "9" + " \n");

        System.out.println(" ↓↓↓↓↓↓↓ ");

        System.out.println("\n " + tablero[0][0] + "|" + " " + tablero[0][1] + " " + "|" + tablero[0][2] + " ");
        System.out.println("---------");
        System.out.println(" " + tablero[1][0] + "|" + " " + tablero[1][1] + " " + "|" + tablero[1][2] + " ");
        System.out.println("---------");
        System.out.println(" " + tablero[2][0] + "|" + " " + tablero[2][1] + " " + "|" + tablero[2][2] + " ");
    }


    public boolean realizarMovimiento(int fila, int columna, char jugador) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
            tablero[fila][columna] = jugador;
            return true;
        }
        return false;
    }

    public boolean tableroLleno() {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (tablero[fila][columna] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean verificarGanador(char jugador) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugador && tablero[1][j] == jugador && tablero[2][j] == jugador) {
                return true;
            }
        }

        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }

        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }

        return false;
    }

}
