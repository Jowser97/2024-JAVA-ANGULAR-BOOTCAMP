package TA10ej03parOimpar;

import java.util.*;

class customExcPar extends Exception {

	public customExcPar(String mensaje) {
		super(mensaje);
	}
}

class customExcImpar extends Exception {

	public customExcImpar(String mensaje) {
		super(mensaje);
	}
}

public class numRandom {

	private int numero;

	public numRandom() {
		Random random = new Random();
		this.numero = random.nextInt(1000);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static void main(String[] args) {

		numRandom numero = new numRandom();
		System.out.println("Generando numero aleatorio...");

		try {
			int n = numero.getNumero();

			if (n % 2 == 0) {
				throw new customExcPar("El numero " + n + " es par.");
			} else {
				throw new customExcImpar("El numero " + n + " es impar.");
			}

		} catch (customExcPar | customExcImpar e) {
			System.out.println(e.getMessage());
		}
	}
}