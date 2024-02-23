package TA5;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
	
	/*Lee un numero por teclado e indica si es divisible entre 2 (resto=0),
	si no lo es tambien debemos indicarlo*/
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Vamos a comprobar si un numero es divisible entre 2.");
	System.out.println("\nPor favor, introduzca un numero.");
	
	String valor = sc.nextLine ();
	sc.close();
	
	System.out.println("Has elegido el valor " +valor+ ".");
	
	//Convertimos string en int
	int num = Integer.parseInt(valor);
	
	//Genero variable resto para que cualquier numero dividido entre 2, el resto sea igual a 0.
	int resto = (num % 2);
	
	if (resto==0) {
		System.out.println("\n¡Su valor " + num + " es divisible entre 2!");
		
		}else{
			System.out.println("\nEl numero seleccionado " + num + 
					" no es divisible entre 2...");
		}	
	}
}
