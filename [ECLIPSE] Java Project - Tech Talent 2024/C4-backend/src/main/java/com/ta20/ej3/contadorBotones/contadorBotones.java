package com.ta20.ej3.contadorBotones;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class contadorBotones extends JFrame {

	private JPanel contentPane = new JPanel();
	private JButton boton1;
	private JButton boton2;
	private JLabel texto1;
	private JLabel texto2;
	private int contador1 = 0;
	private int contador2 = 0;

	public contadorBotones() {
		setTitle("-- Ventana ejercicio 3 --");
		setSize(250, 300);
		setLocationRelativeTo(null); // Centrar la ventana en la pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Al cerrar ventana, se finaliza el programa

		contentPane.setLayout(new FlowLayout());
		setContentPane(contentPane);

		texto1 = new JLabel("Boton 1: " + contador1 + " veces");
		contentPane.add(texto1);

		texto2 = new JLabel("Boton 2: " + contador2 + " veces");
		contentPane.add(texto2);

		boton1 = new JButton("Boton 1");
		contentPane.add(boton1);

		boton2 = new JButton("Boton 2");
		contentPane.add(boton2);

		setVisible(true);

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador1++;
				texto1.setText("Boton 1: " + contador1 + " veces");// Hay que actualizar el label
			}
		});

		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador2++;
				texto2.setText("Boton 2: " + contador2 + " veces");
			}
		});
	}

	public static void main(String[] args) {

		contadorBotones app = new contadorBotones();

	}
}
