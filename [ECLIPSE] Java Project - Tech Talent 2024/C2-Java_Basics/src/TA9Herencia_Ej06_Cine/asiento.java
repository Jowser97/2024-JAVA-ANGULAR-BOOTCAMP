package TA9Herencia_Ej06_Cine;

public class asiento {

	private espectador espectador;
	private char columna;
	private int fila;

	public asiento(int fila, char columna) {
		espectador = null;
		this.columna = columna;
		this.fila = fila;
	}

	public boolean isOcupado() {
		return espectador != null;
	}

	public void asignarAsiento(espectador esp) {
		espectador = esp;
	}

	public char getColumna() {
		return columna;
	}

	public int getFila() {
		return fila;
	}
}
