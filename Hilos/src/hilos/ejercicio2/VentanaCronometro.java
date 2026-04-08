package hilos.ejercicio2;

import javax.swing.*;
import java.awt.*;

public class VentanaCronometro extends JFrame {
    private ContadorLogico logico;
    private JLabel panel;

    public VentanaCronometro(){
        setTitle("Cronometro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(new FlowLayout());
        setVisible(true);

        panel=new JLabel("0");
        panel.setFont(new Font("Arial",Font.BOLD,500));
        add(panel);

        logico=new ContadorLogico(()->{
            panel.setText(String.valueOf(logico.getSegundos()));
        });

        new Thread(logico).start();

    }
    public static void main(String[] args){
        new VentanaCronometro();
    }
}
