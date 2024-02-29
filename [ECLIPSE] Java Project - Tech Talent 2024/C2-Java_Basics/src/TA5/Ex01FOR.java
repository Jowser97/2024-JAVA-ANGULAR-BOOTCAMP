package TA5;

public class Ex01FOR {
	
	public static void main(String[] args) {
		
		/*Ejercicio: escribe un programa que imprima toda la tabla de multiplicar del 5
		(desde 0 hasta 10). Con metodo for*/
		
		
		int j = 0;
		
		for (int n = 3; n <= 10; n++){
			System.out.println("5 * " + n + " = " + (5*n));
			
		}
		
		for (int i = 10; i >= 0; i--) {
			System.out.println("5 * " + i + " = " + (5*i));
		}
		
		while (j<=10) {
			System.out.println("5 * " + j + " = " + (5*j));
			j++;
		}
	}
}
