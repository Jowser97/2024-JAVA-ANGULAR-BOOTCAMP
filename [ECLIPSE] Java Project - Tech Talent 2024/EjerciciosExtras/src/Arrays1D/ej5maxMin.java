package Arrays1D;

import java.util.Scanner;

public class ej5maxMin {

	/*
	 * Escribe un programa que pida 10 números por teclado y que luego muestre los
	 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
	 * máximo y del mínimo respectivamente.
	 */

	public static void main(String[] args) {

		int[] numeros = new int[10];
		generarArray(numeros);
		obtenerValorMax(numeros);
		obtenerValorMin(numeros);

	}

	public static void generarArray(int[] array) {

		System.out.println("Introduce 10 valores:");

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el valor " + (i + 1) + ":");
			array[i] = Integer.parseInt(sc.nextLine());
		}
	}

	public static void obtenerValorMax(int[] array) {
		int maximo = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximo) {
				maximo = array[i];
			}
		}
		
		System.out.println("El valor maximo es:" + maximo);
	}

	public static void obtenerValorMin(int[] array) {
		int minimo = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}
		
		System.out.println("El valor minimo es:" + minimo);
	}
}
