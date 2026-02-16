package pilarespoo.abstraccion;

public class Main {
    public static void main(String[] args) {

        TiendaOnline gadgetshop = new TiendaOnline();
        //Pago muñeco
        ProcesadorDePago pagoTarjeta = new ProcesadorTarjeta(70000, "COP", "2743747237432832", "112");
        //Pago serum
        ProcesadorDePago pagoPayPal = new ProcesadorPayPal(80000, "COP", "daniel@icloud", "123456789");

        gadgetshop.procesarCompra(pagoTarjeta);
        System.out.println("---------------");
        gadgetshop.procesarCompra(pagoPayPal);

    }
}
