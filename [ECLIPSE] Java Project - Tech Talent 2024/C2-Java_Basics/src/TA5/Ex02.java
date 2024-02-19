package TA5;

public class Ex02 {

	public static void main(String[] args) {
		/*Ejercicio: escribe un programa que imprima todas las tablas de multiplicar 
		del 1 al 9 (desde 0 hasta 10).*/
		
		for (int a = 1; a <= 9; a++) {			
			for (int b = 0; b <= 10; b++) {
			System.out.println(a + " * " + b + " = " + (a*b));
			
			}
			
		}

	}

}
