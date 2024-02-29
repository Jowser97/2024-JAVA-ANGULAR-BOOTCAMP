package TA5;

import java.util.Scanner;

public class EEGeneradorDeSecuenciaFibonacci {

	public static void main(String[] args) {
		
		System.out.println("--SECUENCIA DE FIBONACCI--");
		System.out.println("La secuencia de fibonacci es una serie de números en la que "
				+ "cada número es la suma de los dos números anteriores.");
		
		System.out.println("Cuantos numeros quieres que tenga la secuencia.");
		
		Scanner sc = new Scanner(System.in);
		int cantidadSecuencia = sc.nextInt();
		
		int numeroAnterior = 0;
		int numeroActual = 1;
		
		System.out.print("La secuencia es: \n" +numeroAnterior);
				
		for (int i = 1; numeroActual < cantidadSecuencia; i++) {
			System.out.print(" "+ numeroActual);
				int numeroSiguiente  = numeroActual + numeroAnterior;
				numeroAnterior = numeroActual;
				numeroActual = numeroSiguiente;
				
			}
			
		sc.close();
		}
	
		
	}

