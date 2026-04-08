package Graphics;

import javax.swing.*;
import java.awt.*;

//3. Crear un panel de dibujo
public class Panel extends JPanel {

    //4. Metodo que se ejecuta cada vez que la pantalla necesita dibujar o redibujar
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        //Dibujar una linea:

        //Poner color
        g.setColor(Color.blue);

        //dibujar la linea
        g.drawLine(50,50,350,50);

        //poner texto
        g.drawString("Hola mundo!",50,45);

        //Dibujar un rectangulo vacio:
        //elegir color
        g.setColor(Color.blue);
        //dibujar el rectangulo
        g.drawRect(50,50,550,450);

        //Dibujar un rectangulo con relleno:
        //elegir color
        g.setColor(Color.blue);
        //añadir el rectangulo
        g.fillRect(610,50,150,450);

        //Dibujar un circulo:
        //elegir color
        g.setColor(Color.blue);
        //dibujar ovalo
        g.drawOval(100,150,50,50);
        //dibujar ovalo con relleno
        g.fillOval(100,100,50,50);

        //Poner texto con fuente
        Font fuente = new Font("Arial",Font.BOLD,20);
        g.setFont(fuente);
        //poner color
        g.setColor(Color.black);
        //añadir el texto
        g.drawString("Miguel \"El carismático\" Arias ",100,100);

        //Añadir un color RGB:
        Color color1=new Color(19, 25, 50, 255);
        g.setColor(color1);

        g.fillRect(200,200,350,50);

        //Dibujar algo random :)
        g.setColor(color1);
        g.drawRect(200,260,350,50);
        g.drawString("hola",210,285);

        //coordenadas
        g.setColor(color1);
        g.drawString("0,0",5,15);
        g.setColor(color1);
        g.drawString("X,Y", 70,555);

    }


}
