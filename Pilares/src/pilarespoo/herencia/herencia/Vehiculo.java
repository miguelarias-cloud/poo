package pilarespoo.herencia.herencia;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadActual;

    public Vehiculo() {
    }


    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }

    public void acelerar(int incremento) {
        velocidadActual += incremento;
        System.out.println("Velocidad actual: " + velocidadActual + "k/h");
    }

    public void frenar() {
        velocidadActual = 0;
        System.out.println("Vehiculo detenido");
    }

    public void mostrarInfo() {
        System.out.println("Marca " + marca + " modelo " + modelo + " Velocidad actual " + velocidadActual + "k/h");
    }
}
