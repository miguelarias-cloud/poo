package hilos.ejercicio3;

public class Cafeteria {
    public static void main(String[] args) {
        Runnable p1 = new TareaPrepararCafe("Americano");
        Runnable p2 = new TareaPrepararCafe("Espresso");
        Runnable p3 = new TareaPrepararCafe("Capuccino");


        Thread barista1 = new Thread(p1);
        Thread barista2 = new Thread(p2);
        Thread barista3 = new Thread(p3);

        barista1.start();
        barista2.start();
        barista3.start();
    }
}
