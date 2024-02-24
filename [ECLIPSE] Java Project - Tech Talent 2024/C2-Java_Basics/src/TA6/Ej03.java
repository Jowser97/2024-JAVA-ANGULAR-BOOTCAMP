package TA6;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		
	/*Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos por 
	parámetro para que nos indique si es o no un número primo, debe devolver true si es primo sino 
	false. Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
	primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido.");
		System.out.println("Veamos si un numero es primo o no.");
		
		boolean primo = esPrimo(Integer.parseInt(sc.nextLine()));
		
		if (primo) {
			System.out.println("El numero introducido es primo.");
			}else {
				System.out.println("El numero introducido NO es primo.");
		}		
	}
	
	public static  boolean esPrimo(int num) {
		
    	
		if (num <= 1) {
            return false;
        }
		
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
	}
}
