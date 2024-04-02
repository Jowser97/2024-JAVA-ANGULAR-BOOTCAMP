package TA9Herencia_Ej06_Cine;

import java.util.Random;

public class CineMainApp {

	public static void main(String[] args) {

		pelicula titanic = new pelicula("Titanic", 120, 16, "James Cameron");
		cine cinema = new cine(titanic, 7.8);

		simulacionAsignarAsientos(cinema, 100);
		mostrarResumenOcupacionAsientos(cinema);
	}

	public static void simulacionAsignarAsientos(cine cinema, int numEspectadores) {
		int fila;
		char columna;
		Random random = new Random();
		for (int i = 0; i < numEspectadores; i++) {
			fila = random.nextInt(1, cine.FILAS + 1);
			columna = (char) ('A' + random.nextInt(cine.COLUMNAS));
			espectador espectador = new espectador();
			System.out.print("Asiento " + fila + " " + columna + ": ");
			if (cinema.asignarAsiento(fila, columna, espectador)) {
				System.out.println(espectador + ". Asiento asignado!");
			} else {
				System.out.println(espectador + ". Asiento NO asignado!");
			}
		}
	}

	public static void mostrarResumenOcupacionAsientos(cine cinema) {
		System.out.println("\nResumen de ocupación de los asientos:");
		int asientosOcupados = 0;
		int asientosLibres = 0;
		for (int i = 0; i < cine.FILAS; i++) {
			for (int j = 0; j < cine.COLUMNAS; j++) {
				if (cinema.asientos[i][j].isOcupado()) {
					asientosOcupados++;
				} else {
					asientosLibres++;
				}
			}
		}
		System.out.println("Asientos ocupados: " + asientosOcupados);
		System.out.println("Asientos libres: " + asientosLibres);
	}

}