package com.ta20.memory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemoryGame {
    private static final int ROWS = 4; // Número de filas
    private static final int COLS = 4; // Número de columnas
    private static final int NUM_CARDS = ROWS * COLS; // Número total de cartas

    public static void main(String[] args) {
        JFrame frame = new JFrame("Juego de Memoria");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(ROWS, COLS)); // Crear GridLayout con 4 filas y 4 columnas

        // Crear botones para representar las cartas
        JButton[] cards = new JButton[NUM_CARDS];
        for (int i = 0; i < NUM_CARDS; i++) {
            cards[i] = new JButton("Card " + (i + 1));
            cards[i].addActionListener(new CardClickListener()); // Añadir ActionListener a cada carta
            panel.add(cards[i]); // Añadir cada carta al panel
        }

        frame.add(panel); // Añadir el panel al frame
        frame.setVisible(true); // Hacer visible el frame
    }

    // Clase interna para manejar el evento de clic en las cartas
    private static class CardClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            button.setText("Clicked!"); // Acción de ejemplo al hacer clic en la carta
        }
    }
}