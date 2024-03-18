package TA8POO;

/*Crear clase llamada serie, con atributos: titulo, numero de temporadas (3), entregado(false),
 * genero y creador.
 * generamos los siguientes constructores:
 * Un constructor por defecto.
 * Un constructor con el titulo y creador. El resto por defecto.
 * Un constructor con todos los atributos, excepto de entregado
 */

public class Serie {

	private String titulo;
	private int numeroTemp;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		// constructor por defecto
		this.titulo = "";
		this.numeroTemp = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		// constructor con titulo y creador
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numeroTemp, String genero, String creador) {
		// Constructor todos los parametros
		this.titulo = titulo;
		this.numeroTemp = numeroTemp;
		this.genero = genero;
		this.creador = creador;
	}

}
