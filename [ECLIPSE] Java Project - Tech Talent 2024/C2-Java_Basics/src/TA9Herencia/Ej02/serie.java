package TA9Herencia.Ej02;

/* Crear clase serie con atributos: titulo, num det temp (3), entregado (false), genero y creador,
 * Constructores: por defecto, titulo y creador resto defecto y con todos los atributos exc entregado.
 * Metodos: getters y setters de todos menos entregado y sobrescribir metodos tostring
 */

public class serie implements entregable{
		
	final boolean entregadoDefault = false;
	final int numTempDefault = 3;
	
	protected String titulo;
	protected int numTemp;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	//Constructor por defecto
	public serie() {
		this.titulo = "";
		this.numTemp = numTempDefault;
		this.entregado = entregadoDefault;
		this.genero = "";
		this.creador = "";
	}
	
	//Constructor con titulo y creado, resto por defecto
	public serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = "";
		this.numTemp = numTempDefault;
		this.entregado = entregadoDefault;
	}

	//Constructor con todos los atributos exc entregado.
	public serie(String titulo, int numTemp, String genero, String creador) {
		this.titulo = titulo;
		this.numTemp = numTemp;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemp() {
		return numTemp;
	}

	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "serie [titulo=" + titulo + ", numTemp=" + numTemp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador + "]";
	}

	@Override
	public void entregar() {
		this.entregado = true;
		
	}

	@Override
	public void devolver() {
		this.entregado = false;
		
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}


	

}
