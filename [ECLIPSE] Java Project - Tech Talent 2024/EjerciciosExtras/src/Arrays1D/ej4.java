package Arrays1D;

import java.util.Random;

public class ej4 {

	/*
	 * Define tres arrays de 20 números enteros cada una, con nombres numero,
	 * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.
	 * En el array cuadrado se deben almacenar los cuadrados de los valores que hay
	 * en el array numero. En el array cubo se deben almacenar los cubos de los
	 * valores que hay en numero. A continuación, muestra el contenido de los tres
	 * arrays dispuesto en tres columnas
	 */

	public static void main(String[] args) {
		int[] numeros = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		rellenarArrayRandom(numeros);

		arrayCuadrado(numeros, cuadrado);

		arrayCubo(numeros, cubo);
		mostrarArraysEnColumnas(numeros, cuadrado, cubo);
	}

	public static void rellenarArrayRandom(int[] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(101);
		}
	}

	public static void mostrarArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void mostrarArraysEnColumnas(int[] array1, int[] array2, int[] array3) {

		System.out.println("Número\tCuadrado\tCubo");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i] + "\t" + array2[i] + "\t\t" + array3[i]);
		}
	}

	public static void arrayCuadrado(int[] array, int[] array2) {
	    for (int i = 0; i < array.length; i++) {
	        array2[i] = (int) Math.pow(array[i], 2);
	    }
	}
	
	public static void arrayCubo (int[] array, int[] array3) {
		for (int i = 0; i < array.length; i++) {
	        array3[i] = (int) Math.pow(array[i], 3);
	    }
	}
}