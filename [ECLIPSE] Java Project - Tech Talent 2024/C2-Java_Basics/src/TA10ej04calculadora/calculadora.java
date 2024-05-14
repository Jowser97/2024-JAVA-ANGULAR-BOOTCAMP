package TA10ej04calculadora;

import java.util.*;
import java.util.Scanner;

public class calculadora {

	private double x;
	private double y;

	public calculadora(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public calculadora(double x) {
		this.x = x;
	}

	public double suma() {
		return x + y;
	}

	public double resta() {
		return x - y;
	}

	public double multiplicacion() {
		return x * y;
	}

	public double potencia() {
		return (double) Math.pow(x, y);
	}

	public double raizCuadrada() {
		return (double) Math.sqrt(x);
	}

	public double raizCubica() {
		return (double) Math.cbrt(x);
	}

	public double division() {
		return x / y;
	}

	public static void main(String[] args) {

		System.out.println("-- Iniciando calculadora --");

		int x = 0;
		int y = 0;

		do {
			try {

				Scanner sc = new Scanner(System.in);
				System.out.println("Introduce dos valores.");
				System.out.print("x: ");
				x = sc.nextInt();
				System.out.print("y: ");
				y = sc.nextInt();

				break;

			} catch (InputMismatchException e) {

				System.out.println("No has introducido un valor numérico.");

			}

		} while (true);

		Scanner sc = new Scanner(System.in);
		calculadora calc = new calculadora(x, y);

		do {
			System.out.println("Elige la operación:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. Potencia");
			System.out.println("5. Raíz Cuadrada de x");
			System.out.println("6. Raíz Cúbica de x");
			System.out.println("7. División");
			System.out.print("Opción: ");

			int opcion;
			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debes ingresar un número entero.");
				continue;
			}

			double resultado = 0;

			switch (opcion) {
			case 1:
				resultado = calc.suma();
				break;
			case 2:
				resultado = calc.resta();
				break;
			case 3:
				resultado = calc.multiplicacion();
				break;
			case 4:
				resultado = calc.potencia();
				break;
			case 5:
				resultado = calc.raizCuadrada();
				break;
			case 6:
				resultado = calc.raizCubica();
				break;
			case 7:
				resultado = calc.division();
				break;
			default:
				System.out.println("Opción inválida. Debes elegir un número del 1 al 7.");
				continue;
			}

			System.out.println("Resultado: " + resultado);

		} while (true);

	}
}