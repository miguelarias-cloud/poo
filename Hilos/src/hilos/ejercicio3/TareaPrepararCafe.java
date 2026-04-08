package hilos.ejercicio3;

public class TareaPrepararCafe implements Runnable{

    private String tipoCafe;

    public TareaPrepararCafe(String tipoCafe) {
        this.tipoCafe=tipoCafe;
    }

    @Override
    public void run() {
        System.out.println("Empezando a preparar: "+tipoCafe);
        try{
            Thread.sleep(15000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Listo el pedido de: "+tipoCafe);
    }
}
