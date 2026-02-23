package pilarespoo.encapsulamiento;


public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaDavivienda = new CuentaBancaria("75764669", "Daniel");

        cuentaDavivienda.depositar(900000000000000.0);
        System.out.printf("Su saldo actual: " + cuentaDavivienda.getSaldo() + "\n");
        cuentaDavivienda.retirar(10000000.0);
        System.out.printf("Su saldo actual después de retirar: " + cuentaDavivienda.getSaldo());
    }
}
