package TA5;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej13 {

	public static void main(String[] args) {
		
		/*Crea una aplicacion llamada CalculadoraInversa, nos pedira 2
		operandos (int) y un signo aritmetico (String), segun este ultimo se
		realizara la operacion correspondiente. Al final mostrara el resultado
		en un cuadro de texto*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a la Calculadora Inversa.");
		//Pido que el usuario introduzca los dos valores
		System.out.println("Por favor introduzca dos valores.");
		
		//Intruduccion del valor a
		String aIntro = sc.nextLine();
		double a = Double.parseDouble(aIntro);		

		//Introduccion del valor b
		String bIntro = sc.nextLine();
		double b = Double.parseDouble(bIntro);
		
		//Los transformo en double para que pueda darme decimales el resultado
		
		//Informo de cuales son los dos valores		
		System.out.println("Su valor a es: " + a + "\nSu valor b es: " + b);
		
		//Aqui indico que simbolo aritmetico se debe utilizar para la operacion deseada
		System.out.println("\n¿Que operacion matematica quiere realizar? Introduzca "
				+ "el simbolo indicado a continuacion." + "\nSuma: +" + "\nResta: -"
				+ "\nProducto: *" + "\nDivision: /" + "\nPotencia: ^ (siendo a^b)" +
				"\nResto: %");
		
		String op = sc.nextLine();
		
		switch (op) {
			case "+":
				JOptionPane.showInternalMessageDialog(null,
				"La suma de " + a + " + " + b + " es igual a : "
				+ (a+b) + ".");
				break;
			case "-":
				JOptionPane.showInternalMessageDialog(null,
				"La diferencia de " + a + " - " + b + " es igual a : "
				+ (a-b) + ".");
				break;
			case "*":
				JOptionPane.showInternalMessageDialog(null,
				"El producto de " + a + " * " + b + " es igual a : "
				+ (a*b) + ".");
				break;
			case "/":
				JOptionPane.showInternalMessageDialog(null,
				"La division de " + a + " / " + b + " es igual a : "
				+ (a/b) + ".");
				break;
			case "^":
				JOptionPane.showInternalMessageDialog(null,
				"La potencia de " + a + " elevado a " + b + " es igual a : "
				+ (Math.pow(a,b)) + ".");
				break;
			case "%":
				JOptionPane.showInternalMessageDialog(null,
				"El resto de " + a + " y " + b + " es igual a : "
				+ (a%b) + ".");
				break;
			default:
				JOptionPane.showInternalMessageDialog(null,
				"No ha introducido un signo aritmetico disponible.");
				
		
			
		sc.close();	
		
		}
		
	}

}
