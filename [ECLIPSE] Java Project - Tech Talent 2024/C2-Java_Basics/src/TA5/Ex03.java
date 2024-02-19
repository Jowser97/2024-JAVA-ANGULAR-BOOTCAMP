package TA5;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/*escribe un programa que dado un número, sume dicho número con 
		todos los anteriores. Por ejemplo, para el número 5 el resultado 
		debería ser 15 (5 + 4 + 3 + 2 + 1).*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sumatorio.");
		System.out.println("Introduzca un numero, sumaremos todos los anteriores.");
		String numIntro = sc.nextLine ();
		
		int suma = 0;
		
		for (int x = Integer.parseInt(numIntro); x>=0; x--) {
			suma = suma + x;}
		
		System.out.println("La suma de todos los numeros anterior hasta 0 contando "
				+ "desde " + numIntro + " = " + suma + ".");
		sc.close();
		
	}

}
