package TA18conexJavaMySQL;

public class ej04Cine {

	public static void main(String[] args) {
		
		Conexion conex = new Conexion();
		String db = "cine";
		
		String tablaPeliculas = "peliculas";
		String datosPeliculas = "(nombre, cal_edad) VALUES " +
		        "('Matrix', 15), " +
		        "('El Resplandor', 18), " +
		        "('El Rey León (2019)', 3), " +
		        "('Jurassic Park', 7), " +
		        "('Frozen', 3);";

		String tablaSalas = "salas";
		String datosSalas = "(nombre, pelicula) VALUES " +
		        "('Sala 11', 11), " +
		        "('Sala 12', 12), " +
		        "('Sala 13', 13), " +
		        "('Sala 14', 14), " +
		        "('Sala 15', 15);";

		System.out.println("Datos insertados correctamente.");

		conex.insertData(db, tablaPeliculas, datosPeliculas);
		conex.insertData(db, tablaSalas, datosSalas);

		conex.closeConnection();

	}

}
