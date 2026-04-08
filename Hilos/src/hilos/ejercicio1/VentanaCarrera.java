package hilos.ejercicio1;

import javax.swing.*;
import java.awt.*;

public class VentanaCarrera extends JPanel {
    Pelota p1=new Pelota(50, Color.red,this);
    Pelota p2=new Pelota(100, Color.blue,this);

    public void iniciar(){
        new Thread(p1).start();
        new Thread(p2).start();
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        p1.dibujar(g);
        p2.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Carrera de pelotas");
        VentanaCarrera ventana = new VentanaCarrera();
        frame.add(ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        ventana.iniciar();
    }
}
