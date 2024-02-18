package TA5;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		
		/*Realiza una aplicacion que nos pida un numero de ventas a introducir,
		despues nos pedira tantas ventas por teclado como numeros de ventas se
		hayan indicado. Al final mostrara la suma de todas las ventas. 
		Piensa que se repite y que no.*/
			
		Scanner sc = new Scanner(System.in);	//Para poder escribir en consola
		
		double ganancias = 0; //genero double para poder sumarle luego el dineroVenta añadido
		
		System.out.println("Introduce un numero de ventas");
		
		String ventasIntro = sc.nextLine (); //Aqui se introduce el numero de ventas
		
		int numVentas = Integer.parseInt(ventasIntro);
	
		System.out.println("Felicitaciones por las " +numVentas+ " ventas.");
		
		for (int i = 0; i<numVentas; i++) { 
			//i = ventas iniciales (0); siempre que i sea menor que numVentas introducido; incremento
			System.out.println("Cuanto has ganado con el cliente " +(i+1));
			//este sys.out se repetira siempre que i<numVentas
			String ventaIntro = sc.nextLine ();
			double dineroVenta = Double.parseDouble(ventaIntro);
			ganancias = dineroVenta + ganancias;
			//este siempre aumentara las ganancias de manera que siempre se sumara el dinero introducdo + ganancias ya acumuladas 
			}
		System.out.println("Las ganancias totales son: " +ganancias+ "€");
			
		sc.close();
		
	}
}
