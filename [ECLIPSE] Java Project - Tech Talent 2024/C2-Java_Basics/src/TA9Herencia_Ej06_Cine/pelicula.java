package TA9Herencia_Ej06_Cine;

public class pelicula {
	
	public String titulo;
	public int duracion;
	public int edadMinima;
	public String director;
	
	public pelicula() {
		this.titulo = "";
		this.duracion = 0;
		this.edadMinima = 0;
		this.director = "";
	}

	public pelicula(String titulo, int duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	
	
	
	

}
