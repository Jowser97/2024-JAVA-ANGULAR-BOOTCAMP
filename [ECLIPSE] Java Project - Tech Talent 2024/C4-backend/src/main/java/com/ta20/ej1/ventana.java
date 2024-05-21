package com.ta20.ej1;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ventana extends JFrame {

	private JPanel contentPane = new JPanel();
	private JLabel campo;
	private JSlider slider;

	public ventana() {

		setTitle("-- Ventana ejercicio 1 --");
		setSize(400, 300);
		setLocationRelativeTo(null); // Centrar la ventana en la pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Al cerrar ventana, se finaliza el programa

		//Para poder centrar las cosas
		contentPane.setLayout(new FlowLayout());
		setContentPane(contentPane);

		campo = new JLabel("-- ¡Hi! --");
		contentPane.add(campo, BorderLayout.CENTER);

		//Slider para cambiar el tamaño de la etiqueta
		slider = new JSlider(JSlider.HORIZONTAL, 10, 100, 20);
		slider.setMajorTickSpacing(10);
//		slider.setPaintTicks(true);
//		slider.setPaintLabels(true);

		//Accion para cambiar el tamaño de la etiqueta
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int size = slider.getValue();
				campo.setFont(new Font("Arial", Font.PLAIN, size));
			}
		});

		contentPane.add(slider);

		setVisible(true);

	}

	public static void main(String[] args) {
		ventana ventana = new ventana();
	}
}
