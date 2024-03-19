package TA8POO;

import java.util.Iterator;
import java.util.Random;

/*Hacer una clase llamada Password, con dos atributos: longitud (8 por defecto) y contraseñ
 * constructor por defecto
 * un constructor con longitud que nosotros le pasemos
 * generar una contraseña aleatoria con esa longitud
 */

public class Password {
	// Atributos
	private int longitud;
	private String contrasenha;

	public Password() {
		// Constructor por defecto
		this.longitud = 8;
		this.contrasenha = generarContrasenha(longitud);
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasenha = generarContrasenha(longitud);
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenha() {
		return contrasenha;
	}

	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}

	public String generarContrasenha(int longitud) {
		Random random = new Random();
		StringBuilder contrasenha = new StringBuilder();
		for (int i = 0; i < longitud; i++) {
			int numero = random.nextInt(9);
            contrasenha.append(numero);
		}
		return contrasenha.toString();
	}
}
