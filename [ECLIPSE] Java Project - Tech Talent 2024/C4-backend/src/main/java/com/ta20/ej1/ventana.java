package com.ta20.ej1;

import java.awt.*;
import javax.swing.*;

public class ventana extends JFrame {

	private JFrame panel = new JFrame();

	public ventana() {

		JFrame ventana = new JFrame("Ventana con Controles Básicos");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(true);
		ventana.setSize(400, 300);
		
		JLabel etiqueta = new JLabel("Hola, soy una etiqueta!");
		getContentPane().add(etiqueta, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		ventana ventana = new ventana();

	}

}
