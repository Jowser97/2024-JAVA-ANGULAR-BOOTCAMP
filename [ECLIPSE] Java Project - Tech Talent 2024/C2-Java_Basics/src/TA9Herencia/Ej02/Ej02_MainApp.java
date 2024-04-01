package TA9Herencia.Ej02;

public class Ej02_MainApp {

	public static void main(String[] args) {

		serie[] series = new serie[5];
		videojuego[] videojuegos = new videojuego[5];

		series[0] = new serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
		series[1] = new serie("Game of Thrones", 8, "Fantasy", "David Benioff");
		series[2] = new serie("Stranger Things", 4, "Science Fiction", "The Duffer Brothers");
		series[3] = new serie("The Crown", 4, "Historical Drama", "Peter Morgan");
		series[4] = new serie("The Office", 9, "Comedy", "Greg Daniels");

		videojuegos[0] = new videojuego("Persona 5", 50, "Role-Playing", "Atlus");
		videojuegos[1] = new videojuego("Overwatch", 20, "First-Person Shooter", "Blizzard Entertainment");
		videojuegos[2] = new videojuego("God of War (2018)", 40, "Action-Adventure", "Santa Monica Studio");
		videojuegos[3] = new videojuego("The Elder Scrolls V: Skyrim", 300, "Action RPG", "Bethesda Game Studios");
		videojuegos[4] = new videojuego("Dark Souls III", 80, "Action RPG", "FromSoftware");

		videojuegos[0].entregar();
		videojuegos[3].entregar();
		videojuegos[4].entregar();

		int videojuegosEntregados = contarEntregados(videojuegos);
		System.out.println("Los videojuegos entregados son: " + videojuegosEntregados);
		videojuego videojuegoConMasHoras = videojuegoConMasHoras(videojuegos);
		System.out.println("La serie con mas temporadas es:" + videojuegoConMasHoras.toString());

		series[3].entregar();
		series[4].entregar();

		int seriesEntregadas = contarEntregados(series);
		System.out.println("Los videojuegos entregados son: " + seriesEntregadas);
		serie serieConMasTemp = serieConMasTemporadas(series);
		System.out.println("La serie con mas temporadas es:" + serieConMasTemp.toString());

	}

	public static int contarEntregados(entregable[] Object) {
		int entregados = 0;
		for (entregable contenido : Object) {
			if (contenido.isEntregado()) {
				entregados++;
			}

		}
		return entregados;
	}

	public static serie serieConMasTemporadas(serie[] series) {
		serie serieConMasTemporadas = series[0];
		for (serie serie : series) {
			if (serie.getNumTemp() > serieConMasTemporadas.getNumTemp()) {
				serieConMasTemporadas = serie;
			}
		}
		return serieConMasTemporadas;
	}

	public static videojuego videojuegoConMasHoras(videojuego[] videojuegos) {
		videojuego videojuegoConMasHoras = videojuegos[0];
		for (videojuego videojuego : videojuegos) {
			if (videojuego.getHorasEstimadas() > videojuegoConMasHoras.getHorasEstimadas()) {
				videojuegoConMasHoras = videojuego;
			}
		}
		return videojuegoConMasHoras;
	}
}
