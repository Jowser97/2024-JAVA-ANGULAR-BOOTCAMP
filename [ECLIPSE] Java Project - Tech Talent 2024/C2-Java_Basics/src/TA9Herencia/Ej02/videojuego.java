package TA9Herencia.Ej02;

/* Crear clase videojuego con atributos: titulo, horas estimadas (10), entregado (false), genero
 * y compañia.
 * Constructores: por defecto; titulo y horas estimadas, resto default; todos exc entregado.
 * Metodos: getters y setters exc entregado, toString
 */

public class videojuego {
	
	final int horasEstimadasDefault = 10;
	final boolean entregadoDefault = false;
	
	public String titulo;
	public int horasEstimadas;
	public boolean entregado;
	public String genero;
	public String company;
	
	//Constructor default.
	public videojuego() {
		this.titulo = "";
		this.horasEstimadas = horasEstimadasDefault;
		this.company = "";
		this.genero = "";
		this.entregado = entregadoDefault;
	}
	
	//Constructor titulo y horas estimadas resto default.
	public videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.company = "";
		this.genero = "";
		this.entregado = entregadoDefault;
	}

	//Constructor all atributos exc entregado.
	public videojuego(String titulo, int horasEstimadas, String genero, String company) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.company = company;
		this.entregado = entregadoDefault;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", company=" + company + "]";
	}
	
	
	
	

}
