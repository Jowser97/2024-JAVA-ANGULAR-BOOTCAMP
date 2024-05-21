package com.ta20.ej2.botones1y2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class botones extends JFrame {

	private JPanel contentPane = new JPanel();
	private JButton boton1;
	private JButton boton2;
	private JLabel texto;

	public botones() {
		setTitle("-- Ventana ejercicio 2 --");
		setSize(400, 300);
		setLocationRelativeTo(null); // Centrar la ventana en la pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Al cerrar ventana, se finaliza el programa

		// Para poder centrar las cosas
		contentPane.setLayout(new FlowLayout());
		setContentPane(contentPane);

		texto = new JLabel("");
		contentPane.add(texto);

		boton1 = new JButton("Boton 1");
		contentPane.add(boton1);

		boton2 = new JButton("Boton 2");
		contentPane.add(boton2);

		setVisible(true);

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText("Has pulsado: Boton 1");
			}
		});

		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				texto.setText("Has pulsado: Boton 2");
			}
		});

	}

	public static void main(String[] args) {

		botones app = new botones();
	}

}
