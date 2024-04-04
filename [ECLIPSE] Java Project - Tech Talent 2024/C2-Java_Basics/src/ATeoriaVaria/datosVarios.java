package ATeoriaVaria;

public class datosVarios {

	public static void main(String[] args) {

	public boolean estaAusente() {
		int random = (int) (Math.random() * 5); //Este random genera un numero del 0 al 4.99
		return (random == 0);					//EL (int) es un cast para evitar decimales
	}
}
