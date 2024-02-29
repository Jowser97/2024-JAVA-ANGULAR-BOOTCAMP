package TA5;

import java.util.Iterator;
import java.util.Scanner;

public class EESumaDeNumerosPrimos {

	public static void main(String[] args) {
		
		/*Desarrolla un programa que solicite al usuario un número entero y luego calcule 
		la suma de todos los números primos hasta ese número. Utiliza un bucle for o un bucle 
		while para iterar sobre los números y verifica si son primos.*/
		 
		System.out.println("--SUMA DE NUMEROS PRIMOS--");
		
		System.out.println("Introduce un numero. Sumaremos todos los numeros primos hasta el introducido.");
		
		Scanner sc = new Scanner(System.in);
		int limite = sc.nextInt();
		
		//Para almacenar la suma total
		int suma = 0;
		
		for (int numero = 2; i < limite; numero++) {
			boolean esPrimo = true;
			for (int i = 2; i <= limite / 2; i++) {
				if (limite % i == 0) {
					esPrimo = false;
					break;
			if (esPrimo) {
				suma += limite;
			            }
			
		} 
			
		}
		
		


	}

}
