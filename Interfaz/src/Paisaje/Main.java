package Paisaje;

import Graphics.Panel;

import javax.swing.*;

public class Main extends JFrame {
    public Main() {

        //Titulo
        setTitle("Paisaje de chill");

        //Tamaño
        setSize(900,800);

        //Centrar
        setLocationRelativeTo(null);

        //Cerrar programa desde la ventana (si, la X)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Mostrar ventana
        setVisible(true);

        //Agregar el panel al JFrame
        Paisaje.PanelPaisaje panel = new PanelPaisaje();
        add(panel);

    }
    public static void main(String[] args) {
        //Ejecutar ventana
        new Paisaje.Main();
    }
}
