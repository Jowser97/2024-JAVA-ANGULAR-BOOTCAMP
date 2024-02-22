package TA6;

import java.util.Iterator;
import java.util.Scanner;

public class Ej09 {

	public static void main(String[] args) {
		
		/*9) Crea un array de números donde le indicamos por teclado el tamaño del 
		array, rellenaremos el array con números aleatorios entre 0 y 9. Al final 
		muestra por pantalla el	valor de cada posición y la suma de todos los valores.*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entra un tamaño de array: ");
		int size = scanner.nextInt();
			int sumarTotal = 0;
		
		int array[] = new int [size];
		
		for (int i = 0; i < array.length; i++) {
			array [i] = (int) (Math.random() * 10);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array [i]);
		}
		
		for (int i = 0; i < array.length; i++) {
			sumarTotal+=array[i];
			
		}
		
		scanner.close();	
		
		System.out.println("La suma total es: " + sumarTotal);	
	
	
	
	}

}
