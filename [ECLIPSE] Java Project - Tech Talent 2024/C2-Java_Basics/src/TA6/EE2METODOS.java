package TA6;

import java.util.Scanner;

public class EE2METODOS {

	public static void main(String[] args) {
		
		/*EE2: escribe un programa que dado dos String compruebe si los dos primeros
		caracteres y los dos últimos son iguales.*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribeme dos textos, comprobaremos si los dos primeros caracteres"
				+ " son iguales!");
		
		System.out.println("Escribe el primer texto:");
		String string1 = sc.nextLine ();
		
		System.out.println("Escribe el segundo texto:");
		String string2 = sc.nextLine ();
		
		comprobacion2Primeros(string1, string2);
		comprobacion2Ultimos(string1, string2);
		
		
		sc.close();
	}

	public static void comprobacion2Primeros (String string1, String string2) {
		
		if (string1.substring(0, 2).equals(string2.substring(0, 2))) {
            System.out.println("Los dos primeros caracteres son iguales.");
        } else {
            System.out.println("Los dos primeros caracteres no son iguales.");
        }
		
	}
	
	public static void comprobacion2Ultimos (String string1, String string2) {
		
		String ultimosCaracteresString1 = string1.substring(string1.length() - 2);
		String ultimosCaracteresString2 = string2.substring(string2.length() - 2);
		
		if (ultimosCaracteresString1.equals(ultimosCaracteresString2)) {
            System.out.println("Los dos ultimos caracteres son iguales.");
        } else {
            System.out.println("Los dos ultimos caracteres no son iguales.");
        }
		
	}

}
