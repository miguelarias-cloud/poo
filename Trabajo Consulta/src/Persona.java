class Persona {
    //se declaran los atributos de la clase
    private String nombre;
    private int edad;

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //constructor sin parametros, a las variabes se les asignan valores para evitar errores a futuro
    Persona() {
        this.nombre = "n/a";
        this.edad = 0;
    }

    //constructor con solo un parametro
    Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    //mismo constructor pero con todos los parametros
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodo para mostrar la informacion de la persona
    public void mostrarInfo(String nombre, int Edad){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad);
    }

}