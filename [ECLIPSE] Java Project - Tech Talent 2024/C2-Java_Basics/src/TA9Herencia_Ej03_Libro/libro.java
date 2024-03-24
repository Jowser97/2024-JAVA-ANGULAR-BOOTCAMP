package TA9Herencia_Ej03_Libro;

/*Crear clase libro con atributos: ISBN, titulo, autor, numero de paginas
 *Crear setters y getters 
 *toString -> “El libro con ISBN creado por el autor tiene páginas"
 */

public class libro {
	
	public String isbn;
	public String titulo;
	public String autor;
	public int numPaginas;
	
	public libro() {
		this.isbn = "";
		this.titulo = "";
		this.autor = "";
		this.numPaginas = 0;
	}

	
	public libro(String isbn, String titulo, String autor, int numPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	//Metodos setters y getters
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	@Override
	public String toString() {
		return "El libro -" + titulo + "- con ISBN " + isbn + ", por el autor "
				+ autor + " y tiene " + numPaginas + " paginas.";
	}
}



