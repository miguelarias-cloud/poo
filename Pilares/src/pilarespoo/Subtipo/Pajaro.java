package pilarespoo.Subtipo;

public class Pajaro implements IAnimal{

    private String nombre="pajaro";

    //constructor por defecto
    public Pajaro(){}
    //constructor con parametros
    public Pajaro(String nombre) {
        this.nombre = nombre;
    }
    //getter
    public String getNombre() {
        return nombre;
    }
    //setter
    public void setNombre(String nombre) {}

    @Override
    public void hacerSonido() {
        System.out.println(nombre+ " hace: ¡pio!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre+" Volando");
    }

    @Override
    public void comer() {
        System.out.println(nombre+" comiendo");
    }
}
