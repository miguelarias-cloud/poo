package pilarespoo.Subtipo;

public class Gato implements IAnimal{
    private String nombre="Gato";

    //constructor por defecto
    public Gato() {}
    //constructor con parametros
    public Gato(String nombre) {
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
        System.out.println(nombre+" ¡Meow!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre+" caminando");
    }

    @Override
    public void comer() {
        System.out.println(nombre+ " comiendo");
    }
}
