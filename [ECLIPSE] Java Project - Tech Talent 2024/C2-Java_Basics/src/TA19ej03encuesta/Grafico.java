package TA19ej03encuesta;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Component.*;
import java.awt.event.*;

public class Grafico extends JFrame {

	private JPanel contentPane = new JPanel();

	public Grafico() {

		setTitle("-- Encuesta --");
		setSize(300, 420);
		setLocationRelativeTo(null); // Centrar la ventana en la pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel etiqueta = new JLabel("Seleccione un sistema operativo");
		etiqueta.setBounds(23, 5, 200, 20);
		contentPane.add(etiqueta);

//		JTextField textoref = new JTextField("REFERENCIA");
//		textoref.setBounds(43, 40, 100, 20);
//		contentPane.add(textoref);

		JRadioButton botonOpcion1 = new JRadioButton("Windows", false);
		botonOpcion1.setBounds(43, 30, 80, 23);
		contentPane.add(botonOpcion1);

		JRadioButton botonOpcion2 = new JRadioButton("Mac", false);
		botonOpcion2.setBounds(43, 56, 80, 23);
		contentPane.add(botonOpcion2);

		JRadioButton botonOpcion3 = new JRadioButton("Linux", false);
		botonOpcion3.setBounds(43, 82, 80, 23);
		contentPane.add(botonOpcion3);

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(botonOpcion1);
		bgroup.add(botonOpcion2);
		bgroup.add(botonOpcion3);

		JLabel etiqueta1 = new JLabel("Elija una o varias especialidades");
		etiqueta1.setBounds(23, 125, 200, 20);
		contentPane.add(etiqueta1);

		JCheckBox check1 = new JCheckBox("Programación", false);
		check1.setBounds(43, 150, 110, 23);
		contentPane.add(check1);

		JCheckBox check2 = new JCheckBox("Diseño gráfico", false);
		check2.setBounds(43, 176, 110, 23);
		contentPane.add(check2);

		JCheckBox check3 = new JCheckBox("Administración", false);
		check3.setBounds(43, 202, 115, 23);
		contentPane.add(check3);

		JLabel etiqueta2 = new JLabel("Indique cuantas horas dedica al ordenador");
		etiqueta2.setBounds(23, 240, 300, 20);
		contentPane.add(etiqueta2);

		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		slider.setBounds(43, 260, 115, 60);
		contentPane.add(slider);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);

		JButton boton = new JButton("Enviar");
		boton.setBounds(90, 330, 100, 23);
		contentPane.add(boton);

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				StringBuilder respuestas = new StringBuilder();

				if (botonOpcion1.isSelected() || botonOpcion2.isSelected() || botonOpcion3.isSelected()) {

					if (botonOpcion1.isSelected()) {
						respuestas.append("Sistema Operativo: Windows\n\t");
					}
					if (botonOpcion2.isSelected()) {
						respuestas.append("Sistema Operativo: Mac\n\t");
					}
					if (botonOpcion3.isSelected()) {
						respuestas.append("Sistema Operativo: Linux\n\t");
					}

					if (check1.isSelected() || check2.isSelected() || check3.isSelected()) {

						respuestas.append("Especialidad/es:\n");

						if (check1.isSelected()) {
							respuestas.append("Programación\n");
						}
						if (check2.isSelected()) {
							respuestas.append("Diseño gráfico\n");
						}
						if (check3.isSelected()) {
							respuestas.append("Administración\n");
						}
					}

					// Obtener el valor del slider de horas dedicadas (chatgpt)
					int horasDedicadas = slider.getValue();
					respuestas.append("Horas dedicadas al ordenador: ").append(horasDedicadas).append("\n");

					// Mostrar las respuestas en un JOptionPane
					JOptionPane.showMessageDialog(Grafico.this, respuestas.toString(), "Respuestas",
							JOptionPane.INFORMATION_MESSAGE);

				} else {

					JOptionPane.showMessageDialog(Grafico.this, "Por favor seleccione un sistema operativo", "error",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
	}
}
