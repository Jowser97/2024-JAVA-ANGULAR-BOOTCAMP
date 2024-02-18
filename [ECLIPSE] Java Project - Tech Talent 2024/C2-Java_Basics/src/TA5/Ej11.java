package TA5;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		
		/*Crea una aplicacion que nos pida un dia de la semana y que nos diga si es un dia laboral o no.
		Usa switch para ello.*/
		
		System.out.println("Indica un dia de la semana y averigua si es un dia laboral o no.");
		
		//esto nos permite introducir un texto en consola
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine ();
		sc.close();
		
		//paso el texto a mayusculas para unificar los formatos
		dia = dia.toUpperCase();
		
		
		switch (dia) {
			case "LUNES": //pongo todos los dias en mayuscula, ya que el texto introducido siempre estara en mayuscula
				System.out.println("Lunes es laboral.");
				break;
			case "MARTES":
				System.out.println("Martes es laboral.");
				break;
			case "MIERCOLES":
				System.out.println("Miercoles es laboral.");
				break;
			case "JUEVES":
				System.out.println("Jueves es laboral.");
				break;
			case "VIERNES":
				System.out.println("Viernes es laboral.");
				break;
			case "SABADO":
				System.out.println("Sabado es laboral.");
				break;
			case "DOMINGO":
				System.out.println("Domingo no es laboral.");
				break;
			default://en caso de que no se haya introducido un dia de la semana nos saldra el system.out de la siguiente linea
				System.out.println("No has introducio un dia correcto.");
			
		}

	}

}
