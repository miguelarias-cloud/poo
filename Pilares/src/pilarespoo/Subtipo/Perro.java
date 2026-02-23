package pilarespoo.Subtipo;

public class Perro implements IAnimal{
    private String nombre="Perro";

    //constructor por defecto
    public Perro(){}
    //constructor con parametros
    public Perro(String nombre){
        this.nombre=nombre;
    }

    //Getter
    public String getNombre(){
        return nombre;
    }
    //setter
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre+ " hace: ¡Guau!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre+ " caminando");
    }

    @Override
    public void comer() {
        System.out.println(nombre+ " comiendo");
    }
}
