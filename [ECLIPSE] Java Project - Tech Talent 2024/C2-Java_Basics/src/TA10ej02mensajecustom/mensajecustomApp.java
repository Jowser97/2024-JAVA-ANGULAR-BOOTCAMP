package TA10ej02mensajecustom;

public class mensajecustomApp {

	public static void main(String[] args) {
		System.out.println("Mensaje de inicio.");
		try {
			throw new mensajeExcepcion();

		} catch (mensajeExcepcion e) {
			System.out.println("Excepcion capturada con mensaje: " + e.getMessage());
		}
		
		System.out.println("Programa terminado");
	}
}