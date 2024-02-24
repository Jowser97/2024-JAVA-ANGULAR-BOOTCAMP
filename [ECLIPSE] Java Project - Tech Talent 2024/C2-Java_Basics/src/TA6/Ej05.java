package TA6;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		/*5) Crea una aplicación que nos convierta un número en base decimal a binario. 
		Esto lo realizará un método al que le pasaremos el número como parámetro, 
		devolverá un String con el número convertido a binario. 
		Para convertir un número decimal a binario, debemos dividir entre 2 el número y el resultado de esa 
		división se divide entre 2 de nuevo hasta que no se pueda dividir más, el 
		resto que obtengamos de cada división formará el número binario, de abajo a arriba.*/
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("- CONVERSOR DE DECIMAL A BINARIO -");
		System.out.println("Introduce numero decimal a convertir:");
		
		int bin = Integer.parseInt(sc.nextLine());
		
		System.out.println("El binario de " + bin + " es: \n" + decimalBinario(bin));
		
		sc.close();
	}
	
	public static String decimalBinario(int decimal) {
		 if (decimal == 0) {
			 return "0";
		 }
		 
		 //Stringbuilder es para 
		 StringBuilder resultado = new StringBuilder();
		 
		 while (decimal > 0) {
			 int residuo = decimal % 2;
			 resultado.insert(0, residuo);
			 decimal /= 2;
		 }
		 return resultado.toString();
		 
	}

}
