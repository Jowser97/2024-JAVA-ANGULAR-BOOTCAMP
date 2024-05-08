package TA19ej04calculadorav1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grafico extends JFrame {

    private JPanel contentPane = new JPanel();

    public Grafico() {
        setTitle("Calculadora");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        Font font = new Font("Arial", Font.BOLD, 14);
        panel.setFont(font);
        add(panel);

        JButton botonSuma = new JButton("+");
        botonSuma.setBounds(43, 120, 100, 23);
        panel.add(botonSuma);

        botonSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Grafico.this, "Botón Suma presionado");
            }
        });

        JButton botonResta = new JButton("-");
        botonResta.setBounds(160, 120, 100, 23);
        panel.add(botonResta);

        botonResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Grafico.this, "Botón Resta presionado");
            }
        });

        JButton botonMult = new JButton("×");
        botonMult.setBounds(43, 150, 100, 23);
        panel.add(botonMult);

        botonMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Grafico.this, "Botón Multiplicación presionado");
            }
        });

        JButton botonDiv = new JButton("÷");
        botonDiv.setBounds(160, 150, 100, 23);
        panel.add(botonDiv);

        botonDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Grafico.this, "Botón División presionado");
            }
        });
    }
}


