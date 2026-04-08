package hilos.ejercicio2;

public class ContadorLogico implements Runnable{
    private int segundos=0;
    private boolean corriendo=true;
    private Runnable alCambiar;

    public ContadorLogico(Runnable accion){
        this.alCambiar=accion;
    }

    public int getSegundos(){
        return segundos;
    }


    @Override
    public void run() {
        while(corriendo){
            segundos++;
            alCambiar.run();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
