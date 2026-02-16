package pilarespoo.abstraccion;

public class TiendaOnline {
    public void procesarCompra(ProcesadorDePago procesadorDePago) {
        procesadorDePago.ejecutarPago();
    }
}
