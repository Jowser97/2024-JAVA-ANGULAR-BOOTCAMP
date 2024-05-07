package Arrays1D;

import java.util.Scanner;

public class ej6rotarArray {

	/*Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.*/
	
	public static void main(String[] args) {

		int[] array = new int[15];
		generarArray(array);
		
	}
	
	public static void generarArray(int[] array) {

		System.out.println("Introduce 15 valores:");

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el valor " + (i + 1) + ":");
			array[i] = Integer.parseInt(sc.nextLine());
		}
	}

}
