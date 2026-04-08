package Contador;

import javax.swing.*;
import java.awt.*;

public class panelContador extends JPanel {
    int segundos=0;
    Timer timer;
    public panelContador() {
        timer=new Timer(1000,evento-> {
            segundos ++;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.black);
        Font font = new Font("Arial", Font.BOLD, 30);
        g.setFont(font);
        if(segundos==10) {
            g.setColor(Color.green);
            g.drawString("El tiempo llego a 10 segundos !", 5, 250);
            timer.stop();
        }


        g.setColor(Color.green);
        g.drawString("Tiempo: "+segundos,5,200);

    }


}
