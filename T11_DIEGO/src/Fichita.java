import java.util.Random;

public class Fichita extends Thread {
    private Thread siguiente;
    private static final Random numerito = new Random();

    // Constructor para los hilos !!
    public Fichita(String nombre, Thread siguiente) {
        super(nombre);
        this.siguiente = siguiente;
    }

    @Override
    public void run() {
        // En caso de haber hilos en cola, se ejecutarán
        if (siguiente != null) { // Condición para que esto suceda
            siguiente.start();
        }

        // 5 iteraciones para cada hilo tal cual pide la tarea
        for (int i = 1; i <= 5; i++) {
            System.out.println("[" + getName() + "] Iteración " + i);
            try {
                // Esperamos entre 100 y 600 ms para cada impresión del bucle
                Thread.sleep(100 + numerito.nextInt(501)); // entre 100 mas numero random entre 0 y 500 = 100 - 600
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        // Esperamos a que el siguiente hilo termine (si existe)
        // Es decir, si se quiere ejecutar el hilo 4, esta no puede empezar antes de que finalice el hilo 3
        if (siguiente != null) {
            try {
                siguiente.join(); // Bloquea el hilo hasta que el hilo siguiente termine
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        // Mostrar por consola que el hilo finalizó
        System.out.println("Acabó hilo " + getName());
    }
}