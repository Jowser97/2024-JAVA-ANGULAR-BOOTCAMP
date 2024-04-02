package TA9Herencia_Ej06_Cine;

public class cine {

	public static final int FILAS = 8;
	public static final int COLUMNAS = 9;

	protected double precioEntrada;
	protected pelicula peliculaReproduciendo;
	protected asiento[][] asientos;

	public cine(pelicula peliculaReproduciendo, double precioEntrada) {
		this.precioEntrada = precioEntrada; 
		this.peliculaReproduciendo = peliculaReproduciendo;
		asientos = new asiento[FILAS][COLUMNAS];
		
		int fila = FILAS;
		for(int i = 0; i < FILAS; i++) {
			
			char letraColumna = 'A';
			for(int j = 0; j < COLUMNAS; j++) {
				asientos[i][j] = new asiento(fila, letraColumna);
				letraColumna++;
			}
			
			fila--;
		}
	}

	private asiento obtenerAsiento(int fila, char columna) {

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (asientos[i][j].getFila() == fila && asientos[i][j].getColumna() == columna) {
					return asientos[i][j];
				}
			}
		}
		return null;
	}

	public boolean asignarAsientoLibre(espectador espectador) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (!asientos[i][j].isOcupado()) {
					asientos[i][j].asignarAsiento(espectador);
					return true;
				}
			}
		}
		return false;
	}

	public boolean asignarAsiento(int fila, char columna, espectador espectador) {
		asiento asiento = obtenerAsiento(fila, columna);

		if (asiento == null) {
			return false;
		}

		if (espectador.getDinero() < precioEntrada
				|| espectador.getEdad() < peliculaReproduciendo.getEdadMinimaParaAsistir()) {
			return false;
		}

		if (asiento.isOcupado()) {
			return asignarAsientoLibre(espectador);
		}

		asiento.asignarAsiento(espectador);
		return true;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public pelicula getPeliculaReproduciendo() {
		return peliculaReproduciendo;
	}

	public void setPeliculaReproduciendo(pelicula peliculaReproduciendo) {
		this.peliculaReproduciendo = peliculaReproduciendo;
	}
}