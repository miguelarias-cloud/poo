package pilarespoo.herencia.herencia;

public class Carro extends Vehiculo {
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;

    public Carro(int numeroPuertas, boolean tieneAireAcondicionado) {
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public Carro(String marca, String modelo, int numeroPuertas, boolean tieneAireAcondicionado) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public void abrirMaletero() {
        System.out.println("Maletero Abierto");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de puertas " + numeroPuertas + " ¿Tiene aire acondicionado? " + tieneAireAcondicionado);
    }
}
