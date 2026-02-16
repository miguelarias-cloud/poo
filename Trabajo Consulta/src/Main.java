public class Main{
    public static void main(String[] args){

        //En el main llamamos a los metodos de las diferentes clases

        //VEHICULO
        //Ejemplo de herencia y sobreescritura de metodos

        //se crea el objeto
        Vehiculo v1= new Carro();

        //se llama el metodo para mostrar la informacion de "v1"
        v1.info();


        //PERSONA
        //Ejemplo de sobrecarga y ploformismo

        //Se crea la persona varias veces, 1 para cada constructor diferente

        Persona p1= new Persona("Miguel", 16);
        //Persona p1= new Persona("Miguel");

        //metodo para mostrar la informacion de la persona
        p1.mostrarInfo(p1.getNombre(), p1.getEdad());
    }
}