package TA19ej04calculadorav2;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

public class Calculadorav2 extends JFrame {

	private JTextField textField;

//	FORMATO VENTANA
	public Calculadorav2() {
		setTitle("Calculadora");
		setSize(400, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//      CREAR PANEL
		JPanel panel = new JPanel();
		panel.setLayout(null);
		add(panel);

		// Crear JTextField
		textField = new JTextField("");
		textField.setBounds(43, 20, 300, 20);
		panel.add(textField);

		int xInicial = 20; // Posición inicial en x
		int yInicial = 120; // Posición inicial en y
		int xActual = xInicial;
		int yActual = yInicial;
		int espacioHorizontal = 70; // Espacio horizontal entre botones
		int espacioVertical = 70;

		for (int i = 1; i <= 9; i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setBounds(xActual, yActual, 60, 60);
			panel.add(button);
		
		// Agregar ActionListener al botón
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorBoton = ((JButton) e.getSource()).getText(); // Obtener el texto del botón
				textField.setText(textField.getText() + valorBoton); // Agregar el texto del botón al JTextField
			}
		});

		// Actualiza las coordenadas para el próximo botón
		xActual += espacioHorizontal;
		if (i % 3 == 0) {
			xActual = xInicial;
			yActual += espacioVertical;
		}
}
		// Crear botón de cero
		JButton button0 = new JButton("0");
		button0.setBounds(xInicial, yActual, 60, 60);
		panel.add(button0);

		// Agregar ActionListener al botón de cero
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
	}
}