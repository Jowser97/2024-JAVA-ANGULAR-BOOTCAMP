package TA5;

public class Ej09 {

	public static void main(String[] args) {
		
		/*Muestra los numeros del 1 al 100, divisibles entre 2 y 3. Utiliza
		el bucle que desees*/
		
				
		for (int n = 1; n<=100; n++) {
			if (n%2 == 0 || n%3 == 0)//Se usa || para añadir otra condicion
			System.out.println(n);
			
		}
	}
}
