package TA10ej01juego1a500;

public class juegoApp {

	public static void main(String[] args) {
		
		juego1a500 juego = new juego1a500();
		juego.jugar();
		try {
			int resultado = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("No puede dar infinito");
		}
	}
}
