package Paisaje;

import javax.swing.*;
import java.awt.*;

public class PanelPaisaje extends JPanel {
    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        //Definir colores
        Color colorCielo = new Color(119, 192, 237);
        Color verde1= new Color(0, 80, 17);
        Color verde2= new Color(71, 128, 63);
        Color verde3= new Color(29, 110, 14);
        Color colorTroncos=new  Color(37, 26, 26);
        Color verde4=new  Color(13, 48, 2);
        Color colorAvion=new  Color(39, 38, 38);
        g.setColor(verde1);
        g.setColor(verde2);
        g.setColor(verde3);
        g.setColor(colorCielo);
        g.setColor(colorTroncos);
        g.setColor(verde4);
        g.setColor(colorAvion);

        //Color de fondo
        setBackground(colorCielo);

        //Dibujar sol
        g.setColor(Color.yellow);
        g.fillOval(750, -150, 300, 300);

        //Dibujar arboles
        g.setColor(colorTroncos);
        g.fillRect(150,400,25,150);
        g.fillRect(425,415,15,100);
        g.fillRect(650,400,20,150);

        g.setColor(verde4);
        int[] x1={110,172,215};
        int[] y1={425,300,425};
        g.fillPolygon(x1,y1,3);
        int[] x2={110,172,215};
        int[] y2={375,250,375};
        g.fillPolygon(x2,y2,3);
        int[] x3={635,660,685};
        int[] y3={450,325,450};
        g.fillPolygon(x3,y3,3);
        g.setColor(verde1);
        g.fillOval(410,400,50,50);


        //Dibujar montañas
        g.setColor(verde1);
        g.fillOval(75,475,950,950);

        g.setColor(verde2);
        g.fillOval(525, 375, 750, 750);

        g.setColor(verde3);
        g.fillOval(-250,500,900,900);

        //Dibujar avioncito :D
        g.setColor(colorAvion);
        g.fillOval(300,110,35,5);
        int[] x4={300,330,300};
        int[] y4={105,110,120};
        g.fillPolygon(x4,y4,3);
        g.setColor(Color.white);
        g.drawLine(200,105,300,105);
        g.drawLine(250,110,300,110);
        g.drawLine(200,120,300,120);




    }
}
