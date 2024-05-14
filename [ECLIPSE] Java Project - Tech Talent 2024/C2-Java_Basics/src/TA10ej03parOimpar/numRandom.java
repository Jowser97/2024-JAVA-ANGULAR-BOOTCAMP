package TA10ej03parOimpar;

import java.util.*;

public class numRandom extends Exception {

	private int numero;

	public numRandom() {
		Random random = new Random();
		this.numero = random.nextInt(1000);
	}
	
	public numRandom(int n) {
		super();
		this.numero = n;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMensaje() {

		try {
		    if (this.numero % 2 == 0) {
		        mensaje = "Es par."
		    } else {
		        mensaje = "Es impar."
		    }
		return mensaje;
	}

	public static void main(String[] args) {

		numRandom numero = new numRandom();
		System.out.println("Generando numero aleatorio...");

		try {

			System.out.println("El numero aleatorio generado es: " + numero.getNumero());
			int n = numero.getNumero();
			throw new numRandom(n);

		}  catch (numRandom e) {
			System.out.println(e.getMessage());
		}

	}
}