package TA6;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		/*6) Crea una aplicación que nos cuente el número de cifras de un número entero positivo
		(hay que controlarlo) pedido por teclado. Crea un método que realice esta acción, pasando
		el número por parámetro, devolverá el número de cifras.*/
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Bienvenido al cuentanumeros!");
		System.out.println("Introduzca un numero positivo:");
		
		int numIntro = Integer.parseInt(sc.nextLine());
		
		if (numIntro < 0) {
			System.out.println("No ha ingresado un numero positivo. Vuelva a ejecutar el programa.");
		}else {
			System.out.println("Para el numero " +numIntro+ ", el numero de cifras es: " 
					+ contadorCifras(numIntro));
		}
				
		sc.close();
	}
	
	
	public static int contadorCifras(int numero) {
		if (numero == 0) {
			return 1;
		}
		
		int contador = 0;
		while (numero != 0) {
			numero = numero / 10;
			contador++;
		}
		return contador;

	}
}