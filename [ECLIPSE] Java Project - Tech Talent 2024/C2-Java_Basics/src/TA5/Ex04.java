package TA5;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		/*Ejercicio: escribe un programa que dado un número, calcule si es 
		primo o no. Un número primo es un número natural mayor que 1 que 
		tiene únicamente dos divisores distintos: él mismo y el 1*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido.");
		System.out.println("Introduzca un numero para ver si es o no primo.");
		int numIntro = sc.nextInt();
		
		if (esPrimo(numIntro)) {
			System.out.println(numIntro + " es primo.");
			System.out.println("if");
		}else{ 
			System.out.println(numIntro + " no es primo.");
		
		}
		
		sc.close();
	}

	public static boolean esPrimo(int checkNum) {
        if (checkNum <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(checkNum); i++) {
            if (checkNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
