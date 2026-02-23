package pilarespoo.abstraccion;

public class ProcesadorTarjeta extends ProcesadorDePago {

    private String numeroTarjeta;

    private String cvv;

    public ProcesadorTarjeta(double monto, String moneda, String numeroTarjeta, String cvv) {
        super(monto, moneda);
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
    }

    public ProcesadorTarjeta(double monto, String moneda) {
        super(monto, moneda);
    }

    @Override
    public boolean procesarPago() {
        System.out.println("Procesando tarjeta ****" + numeroTarjeta.substring(12));
        return true;
    }

    @Override
    public boolean validarDatos() {
        return numeroTarjeta != null && numeroTarjeta.length() == 16
                && cvv != null && cvv.length() == 3;
    }
}
