import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner MiScanner = new Scanner(System.in);
        int N = 5; // valor por defecto en caso de que el valor introducido no sea válido

        System.out.print("Cuántas fichas de dominó, mínimo 1 ;) !! : ");
        try {
            N = MiScanner.nextInt();
            if (N < 1) {
                System.out.println("Te dije que no puede ser menor que 1. Se usarán 5 por defecto.");
                N = 5;
            }
        } catch (Exception e) {
            System.out.println("NO VÁLIDO, Usaré 5 por defecto.");
            N = 5;
        }
        MiScanner.close();

        // cadena de hilos, lectura: atras -> adelante
        Thread siguiente = null;
        for (int i = N; i >= 1; i--) {
            String nombre = "Hilo-" + i;
            Thread nuevo = new Fichita(nombre, siguiente);
            siguiente = nuevo;
        }

        // último hilo creado, primero en la cadena (Hilo-1)
        if (siguiente != null) {
            siguiente.start();
        }
    }
}