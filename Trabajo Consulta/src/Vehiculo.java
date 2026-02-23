public class Vehiculo {
    //Clase padre vehiculo

    //declaracion de atributos
    public String tipo;

    //metodo para mostrar la informacion del vehiculo,  este metodo se sobreescribe en cada clase hija para mostrar su propia informacion
    public void info() {
        System.out.println("Es un vehiculo\n");
    }
}
