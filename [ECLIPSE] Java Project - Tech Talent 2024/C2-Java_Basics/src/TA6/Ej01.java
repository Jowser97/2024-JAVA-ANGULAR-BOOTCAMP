package TA6;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {

		/*1) Crea una aplicación que nos calcule el área de un circulo, cuadrado o
		triangulo. Pediremos que figura queremos calcular su área y según lo
		introducido pedirá los valores necesarios para calcular el área. Crea un
		método por cada figura para calcular cada área, este devolverá un número
		real. Muestra el resultado por pantalla.*/
		

		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"INTRODUZCA UNA DE LAS SIGUIENTES FIGURAS PARA CALCULAR EL AREA: \nCUADRADO" 
						+ "\nTRIANGULO\nCIRCULO");

		String figura = scanner.nextLine();
		figura = figura.toUpperCase();

		switch (figura) {
		case "CIRCULO":
			System.out.println("Introduzca el valor del radio.");
			String radio = scanner.nextLine();
			int r = Integer.parseInt(radio);
			System.out.println("El area del circulo es: " + (circulo(r)) + ".");
			break;
			
		case "TRIANGULO":
			System.out.println("Introduzca el valor de la base.");
			String base = scanner.nextLine();
			int b = Integer.parseInt(base);
			System.out.println("Introduzca el valor de la altura.");
			String altura = scanner.nextLine();
			int h = Integer.parseInt(altura);
			System.out.println("El area del triangulo es: " + triangulo(b, h) + ".");
			break;
			
		case "CUADRADO":
			System.out.println("Introduzca el valor del lado.");
			String lado = scanner.nextLine();
			int l = Integer.parseInt(lado);
			System.out.println("El area del circulo es: " + cuadrado(l) + ".");
			break;
		default:
			System.out.println("No ha introducido una figura correcta.");

			scanner.close();

		}

	}

	public static double circulo(int radio) {
			double resultadoCirculo = (Math.pow(radio, 2) * Math.PI);
		return resultadoCirculo;
	}
	public static double triangulo(int base, int altura) {
			double resultadoTriangulo =  base * altura / 2;
		return resultadoTriangulo;
	}
	public static double cuadrado(int lado) {
			double resultadoCuadrado = lado * lado;
		return resultadoCuadrado;
	}

}
