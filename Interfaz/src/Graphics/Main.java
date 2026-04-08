package Graphics;
import javax.swing.*;

//1. Crear la ventana principal

//Jframe conviete la clase en una ventana grafica

public class Main extends JFrame {
    //Crear el constructor del main

    //2. Configurar el objeto
    public Main() {

       //Titulo
       setTitle("Primera ventana");

       //Tamaño
        setSize(800,600);

        //Centrar
        setLocationRelativeTo(null);

        //Cerrar programa desde la ventana (si, la X)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Mostrar ventana
        setVisible(true);

        //Agregar el panel al JFrame
        Panel panel = new Panel();
        add(panel);

    }
    public static void main(String[] args) {
        //Ejecutar ventana
        new Main();
    }
}
