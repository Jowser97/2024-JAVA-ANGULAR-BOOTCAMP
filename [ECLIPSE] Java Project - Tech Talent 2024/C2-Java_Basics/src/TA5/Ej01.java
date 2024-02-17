package TA5;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		
		//Ej01 Declara 2 variables numericas, e indica cual es mayor de los dos.
		
		//Declaro las dos variables
		int a = 1;
		int b = 2;
		
		//Indico cuales son las dos variables en consola
		System.out.println("El valor de la variable a es " +a+ " y el valor de"
				+ " la variable b es " +b+ " .");
		
				
		if (a<b) {
			System.out.println("El valor de " +a+ " es menor que " +b+ ".");
		}else{
				
			if (a>b) {
				System.out.println("El valor de " +a+ " es mayor que " +b+ ".");
			}else {
				System.out.println("El valor de " +a+ " es igual que " +b+ ".");
			}
		}	
	}
}