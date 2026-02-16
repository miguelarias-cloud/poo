public class Carro extends Vehiculo{
    //Clase hija Carro

    //declaracion de atributos
    public String nombre="Mustang";

    //metodo hereado de la clase padre
    @Override
    public void info() {
        System.out.println(nombre + ": Motor V8, Ford, el mejor del mundo :)\n" );

    }
}
