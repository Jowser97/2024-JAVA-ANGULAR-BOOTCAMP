package TA5;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		
		/*Realiza una aplicacion que nos pida un numero de ventas a introducir,
		despues nos pedira tantas ventas por teclado como numeros de ventas se
		hayan indicado. Al final mostrara la suma de todas las ventas. 
		Piensa que se repite y que no.*/
			
		Scanner sc = new Scanner(System.in);
		
		double ganancias = 0;
		
		System.out.println("Introduce un numero de ventas");
		
		String ventasIntro = sc.nextLine ();
		
		int numVentas = Integer.parseInt(ventasIntro);
	
		System.out.println("Felicitaciones por las " +numVentas+ " ventas.");
		
		for (int i = 0; i<numVentas; i++) {
			System.out.println("Cuanto has ganado con el cliente " +(i+1));
			String venta = sc.nextLine ();
			double dineroVenta = Double.parseDouble(venta);
			ganancias = dineroVenta + ganancias;
			}
		System.out.println("Las ganancias totales son: " +ganancias+ "€");
			
		sc.close();
		
	}
}
