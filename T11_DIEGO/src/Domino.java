public class Domino {
    public static void main(String[] args) {

        Thread hilo5 = new Fichita("Hilo-5", null);
        Thread hilo4 = new Fichita("Hilo-4", hilo5);
        Thread hilo3 = new Fichita("Hilo-3", hilo4);
        Thread hilo2 = new Fichita("Hilo-2", hilo3);
        Thread hilo1 = new Fichita("Hilo-1", hilo2);

        hilo1.start();

    }
}