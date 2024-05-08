package TA19ej02peliculas;

import javax.swing.*;

import java.awt.Component;
import java.awt.event.*;

public class Grafico extends JFrame {

	private JPanel contentPane = new JPanel();

	public Grafico() {
		setTitle("-- Peliculas --");
		setSize(500, 250);
		setLocationRelativeTo(null); // Centrar la ventana en la pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel texto1 = new JLabel("Escribe el titulo de una pelicula");
		texto1.setBounds(43, 20, 250, 20);
		contentPane.add(texto1);

		JTextField textoInsert1 = new JTextField("...");
		textoInsert1.setBounds(43, 70, 180, 20);
		contentPane.add(textoInsert1);

		JButton boton1 = new JButton("Añadir");
		boton1.setBounds(65, 120, 120, 20);
		contentPane.add(boton1);

		JLabel texto2 = new JLabel("Peliculas");
		texto2.setBounds(360, 20, 80, 20);
		contentPane.add(texto2);
		
		JComboBox comboBox1 = new JComboBox<>();
		comboBox1.setBounds(320, 70, 141, 22);
		contentPane.add(comboBox1);
		
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Se obtiene el texto mediante getText
				String nombre = textoInsert1.getText();
				comboBox1.addItem(nombre);// Mostrar un mensaje en un JOptionPane
				double op1 = Double.parseDouble(textOP1.getText());
			}
		});

	}
}