package pilarespoo.abstraccion;

public class ProcesadorPayPal extends ProcesadorDePago {
    private String email;
    private String password;

    public ProcesadorPayPal(double monto, String moneda, String email, String password) {
        super(monto, moneda);
        this.email = email;
        this.password = password;

    }

    public ProcesadorPayPal(double monto, String moneda) {
        super(monto, moneda);
    }

    @Override
    public boolean procesarPago() {
        System.out.println("Procesando pago con PayPal " + email);
        return true;
    }

    @Override
    public boolean validarDatos() {

        return email != null && email.contains("@") && email.length() >= 10
                && password != null && password.length() >= 8;
    }
}
