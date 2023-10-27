import java.util.Scanner;

public class Jugador {
    private String nombre;
    private char ficha;

    public Jugador(String nombre, char ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public char getFicha() {
        return ficha;
    }

    public int[] hacerMovimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(nombre + ", ingrese el numero de la ubicacion: ");
        int ubicacion = scanner.nextInt();
        if(ubicacion == 1){
            return new int[]{0, 0};
        } if (ubicacion == 2){
            return new int[]{0, 1};
        } if (ubicacion == 3){
            return new int[]{0, 2};
        } if (ubicacion == 4){
            return new int[]{1, 0};
        } if (ubicacion == 5){
            return new int[]{1, 1};
        } if (ubicacion == 6){
            return new int[]{1, 2};
        } if (ubicacion == 7){
            return new int[]{2, 0};
        } if (ubicacion == 8){
            return new int[]{2, 1};
        } if (ubicacion == 9){
            return new int[]{2, 2};
        } else{
            return null;
        }

    }
}
