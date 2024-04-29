package Arrays1D;

import java.util.Iterator;
import java.util.Scanner;

public class ej3 {

	/*Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.*/
	
	public static void main(String[] args) {
		
		int[] numeros = new int [9];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un numero. " + (i+1) +"/9 restantes");
			numeros[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (int j = numeros.length - 1; j>=0; j--) {
			System.out.println("El array inverso generado es el siguiente:");
			System.out.print(numeros[j] + ", ");
		}
	}
}
