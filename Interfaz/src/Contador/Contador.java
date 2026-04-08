package Contador;

import javax.swing.*;

public class Contador extends JFrame {
    public Contador() {
        setTitle("Contador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        panelContador contador = new panelContador();
        add(contador);

    }

    public static void main(String[] args) {
        new Contador();
    }
}
