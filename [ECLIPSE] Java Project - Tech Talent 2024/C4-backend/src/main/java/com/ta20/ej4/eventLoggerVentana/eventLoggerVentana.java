package com.ta20.ej4.eventLoggerVentana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class eventLoggerVentana extends JFrame {
	private JTextArea textArea;
	private JLabel label;
	private JButton boton;

	public eventLoggerVentana() {
		setTitle("Registro de eventos");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		label = new JLabel("Eventos de la ventana:");
		textArea = new JTextArea();
		textArea.setEditable(false);
		boton = new JButton("Borrar");

		JScrollPane scrollPane = new JScrollPane(textArea);

		add(label, BorderLayout.WEST);
		add(scrollPane, BorderLayout.CENTER);
		add(boton, BorderLayout.SOUTH);

		// Añadiendo manejadores de eventos para la ventana
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				logEvent("Ventana abierta");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				logEvent("Ventana cerrándose");
			}

			@Override
			public void windowClosed(WindowEvent e) {
				logEvent("Ventana cerrada");
			}

			@Override
			public void windowIconified(WindowEvent e) {
				logEvent("Ventana minimizada");
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				logEvent("Ventana restaurada");
			}

			@Override
			public void windowActivated(WindowEvent e) {
				logEvent("Ventana activada");
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				logEvent("Ventana desactivada");
			}
		});

		// Añadiendo manejadores de eventos para el ratón
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logEvent("Ratón clicado en la posición (" + e.getX() + ", " + e.getY() + ")");
			}
		});

		// Añadiendo manejadores de eventos para el teclado
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				logEvent("Tecla pulsada: " + e.getKeyChar());
			}
		});
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});

		setFocusable(true);
	}

	private void logEvent(String eventDescription) {
		textArea.append(eventDescription + "\n");
	}

	public static void main(String[] args) {

		eventLoggerVentana window = new eventLoggerVentana();
		window.setVisible(true);

	}
}