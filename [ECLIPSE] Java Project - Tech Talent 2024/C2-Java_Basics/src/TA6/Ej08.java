package TA6;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		
		int matriz [] = new int [10];
		
		System.out.println("Dame un valor.");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<10 ; i++) { 	
			int numero = sc.nextInt(); 
			matriz[i] = numero;
		}
		
		sc.close();
		
	}

}
