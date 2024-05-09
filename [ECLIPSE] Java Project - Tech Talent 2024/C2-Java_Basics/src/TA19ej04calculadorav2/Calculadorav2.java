package TA19ej04calculadorav2;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;

public class Calculadorav2 extends JFrame {

	private JTextField textField;

//	FORMATO VENTANA
	public Calculadorav2() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);

		// Creamos el panel principal y aplicamos un GridLayout
		JPanel contentPane = new JPanel(new GridLayout(4, 4, 5, 5));

		// Creamos los botones y los añadimos al panel principal
		String[] botones = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };

		for (String textoBoton : botones) {
			JButton boton = new JButton(textoBoton);
			contentPane.add(boton);
		}

		add(contentPane, BorderLayout.CENTER);
		setVisible(true);
		
		JLabel etiqueta= new JLabel("Nombre");
		etiqueta.setBounds(43,20,100,20);
		contentPane.add(etiqueta);

	}
}