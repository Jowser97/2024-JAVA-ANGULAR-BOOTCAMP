package TA5;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
	
	/*Calcula el area de un circulo, el radio siendo pedido por teclado, luego habra
	luego habra que convertir el string en double*/
	
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Hoy calcularemos el area de una circumferencia.");
	System.out.println("Introduzca el radio de la circumferencia.");
		
	String radio = sc.nextLine ();
	sc.close();
	
	//Aqui podremos ver si el radio se introduce correctamente
	System.out.println("El radio es: "+radio+".");
	
	//Transformo string en double
	double r = Double.parseDouble(radio);
	
	//Aqui calculamos el area
	System.out.println("El area de la circumferencia es: " + (Math.PI*Math.pow(r, 2))
			+ ".");
		
	}

}
