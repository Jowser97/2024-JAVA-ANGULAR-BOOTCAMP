package TA5;

import javax.swing.JOptionPane;

public class Ej03 {

	public static void main(String[] args) {
		
		/*Modificar el ejercicio 2 para que pida el nombre que quiero introducir
		con el metodo JOptionPane*/
		
		String name = JOptionPane.showInputDialog("Por favor, introduzca su "
				+ "nombre.");
		
		JOptionPane.showMessageDialog(null, "¡Bienvenido a Java "+name+ "!");
				
	}

}
