package Paisaje2;

import javax.swing.*;
import java.awt.*;

public class Main  extends JFrame {
    public Main() {
        setTitle("Paisaje");
        setSize(800,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        Paisaje2 panel=new Paisaje2();
        add(panel);
    }
    public static void main(String[] args) {
        new Main();
    }
}
