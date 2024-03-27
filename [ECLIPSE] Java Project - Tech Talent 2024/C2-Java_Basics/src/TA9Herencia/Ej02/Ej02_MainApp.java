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

		videojuegos[0] = new videojuego("Persona 5", 2016, "Role-Playing", "Atlus");
		videojuegos[1] = new videojuego("Overwatch", 2016, "First-Person Shooter", "Blizzard Entertainment");
		videojuegos[2] = new videojuego("God of War (2018)", 2018, "Action-Adventure", "Santa Monica Studio");
		videojuegos[3] = new videojuego("The Elder Scrolls V: Skyrim", 2011, "Action RPG", "Bethesda Game Studios");
		videojuegos[4] = new videojuego("Dark Souls III", 2016, "Action RPG", "FromSoftware");

		videojuegos[0].entregar();
		videojuegos[3].entregar();
		videojuegos[4].entregar();
		
		int videojuegosEntregados = contarEntregados(videojuegos);
		System.out.println("Los videojuegos entregados son: " + videojuegosEntregados);

		series[3].entregar();
		series[4].entregar();
		
		int seriesEntregadas = contarEntregados(series);
		System.out.println("Los videojuegos entregados son: " + seriesEntregadas);
		
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

}
