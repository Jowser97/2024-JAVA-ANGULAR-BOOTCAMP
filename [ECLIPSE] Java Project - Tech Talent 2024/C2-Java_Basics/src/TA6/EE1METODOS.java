package TA6;

import java.util.Scanner;

public class EE1METODOS {

	public static void main(String[] args) {
		
		/*escribe un programa que dado dos String compruebe si los dos primeros
		caracteres son iguales.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribeme dos textos, comprobaremos si los dos primeros caracteres"
				+ " son iguales!");
		
		System.out.println("Escribe el primer texto:");
		String string1 = sc.nextLine ();
		
		System.out.println("Escribe el segundo texto:");
		String string2 = sc.nextLine ();
		
		comprobacion(string1, string2);
		
		sc.close();
	}

	public static void comprobacion (String string1, String string2) {
		
		if (string1.substring(0, 2).equals(string2.substring(0, 2))) {
            System.out.println("Los dos primeros caracteres son iguales.");
        } else {
            System.out.println("Los dos primeros caracteres no son iguales.");
        }
		
	}

}
