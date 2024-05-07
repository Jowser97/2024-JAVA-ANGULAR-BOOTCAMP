package TA19ej01saludador;

import javax.swing.*;
import java.awt.event.*;

public class Grafico extends JFrame {

	private JPanel contentPane = new JPanel();

	public Grafico() {
		setTitle("-- Saludador --");
		setSize(400, 300);
		setLocationRelativeTo(null); // Centrar la ventana en la pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel campo = new JLabel("-- Escribe un nombre para saludar. --");
		campo.setBounds(85, 40, 230, 20);
		contentPane.add(campo);

		JTextField introducirNombre = new JTextField();
		introducirNombre.setBounds(85, 120, 230, 20);
		contentPane.add(introducirNombre);

		JButton boton = new JButton("¡Saludar!");
		boton.setBounds(140, 200, 100, 23);
		contentPane.add(boton);

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Se obtiene el texto mediante getText
				String nombre = introducirNombre.getText();
				// Mostrar un mensaje en un JOptionPane
				JOptionPane.showMessageDialog(Grafico.this, "¡Hola, " + nombre + "!");
			}
		});

	}
}