package Paisaje2;

import javax.swing.*;
import java.awt.*;

public class Paisaje2 extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //definir colores
        Color CB= new Color(161,235,255);
        g.setColor(CB);
        Color C1= new Color(104,156,118);
        g.setColor(C1);
        Color C2=new Color(40,156,65);
        g.setColor(C2);
        Color C3=new Color(81,156,40);
        g.setColor(C3);
        Color C4=new Color(79,186,12);
        g.setColor(C4);
        Color C5=new Color(217,199,106);
        g.setColor(C5);
        Color C6=new Color(107,103,95);
        g.setColor(C6);

        //Background
        setBackground(CB);

        //Primera capa
        g.setColor(C1);
        int[] x1={800,620,572,560,480,376,340,308,240,212,0,0,800};
        int[] y1={140,140,160,180,182,184,196,214,220,232,296,700,700};
        g.fillPolygon(x1,y1,13);

        //Segunda capa
        g.setColor(C2);
        int[] x2={0,80,160,200,212,230,256,276,290,300,312,326,348,376,384,406,436,452,466,480,488,488,0};
        int[] y2={240,242,244,248,252,260,272,292,302,312,318,324,334,340,348,364,388,396,398,406,420,700,700};
        g.fillPolygon(x2,y2,23);

        //Tercera capa
        g.setColor(C3);
        int[] x3={0,36,62,82,104,122,130,130,0};
        int[] y3={360,380,408,432,458,474,486,700,700};
        g.fillPolygon(x3,y3,9);
        g.fillOval(-326,484,688,428);

        //Cuarta capa
        g.setColor(C6);
        int[] x5={378,390,410,440,458,474,488,500,492,488,480,466,436,406,384,376,348};
        int[] y5={338,344,360,380,388,396,404,414,424,420,406,398,388,364,348,340,334};
        g.fillPolygon(x5,y5,17);

        //Quinta capa
        g.setColor(C4);
        g.fillOval(260,330,1480,740);
        g.fillOval(380,288,880,824);

        //Sexta capa
        g.setColor(C5);
        int[] x6={542,560,572,660,720,760,800,800,764,740,702,632,600,564,546,538,532};
        int[] y6={380,382,380,372,360,358,352,360,368,372,374,384,388,392,394,394,388};
        g.fillPolygon(x6,y6,17);
    }
}
