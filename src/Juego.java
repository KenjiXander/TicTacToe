public class Juego {
    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;

    public Juego() {
        tablero = new Tablero();
        jugador1 = new Jugador("Jugador 1", 'X');
        jugador2 = new Jugador("Jugador 2", 'O');
    }

    public void iniciarJuego() {
        tablero.mostrarTablero();

        while (true) {
            realizarMovimiento(jugador1);
            tablero.mostrarTablero();
            if (tablero.verificarGanador(jugador1.getFicha())) {
                System.out.println(" Ganó: " + jugador1.getNombre());
                break;
            } else if (tablero.tableroLleno()) {
                System.out.println("EMPATE");
                break;
            }
            realizarMovimiento(jugador2);
            tablero.mostrarTablero();
            if (tablero.verificarGanador(jugador2.getFicha())) {
                System.out.println("Ganó: " + jugador2.getNombre());
                break;
            }
        }
    }


    private void realizarMovimiento(Jugador jugador) {
        do {
            int[] coordenadas = jugador.hacerMovimiento();
            if (tablero.realizarMovimiento(coordenadas[0], coordenadas[1], jugador.getFicha())) {
                break;
            }
        } while (true);
    }
}
