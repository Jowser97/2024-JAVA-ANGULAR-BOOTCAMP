package TA18conexJavaMySQL;

public class ej09LosInvestigadores {

	public static void main(String[] args) {
		
		Conexion conex = new Conexion();
		String db = "los_investigadores";
		
		String tablaFacultad = "facultad";
		String datosFacultad = "(nombre) VALUES " +
		        "('Universidad Nacional de México'), " +
		        "('Universidad de Montevideo'), " +
		        "('Universidad de Brasilia'), " +
		        "('Universidad de Buenos Aires'), " +
		        "('Universidad de Lisboa');";

		String tablaInvestigadores = "investigadores";
		String datosInvestigadores = "(dni, nom_apels, id_facultad) VALUES " +
		        "(98765432, 'Sofía Gómez Martínez', 2), " +
		        "(87654321, 'Pablo Rodríguez López', 4), " +
		        "(76543210, 'Carmen Martínez Sánchez', 1), " +
		        "(65432109, 'Javier Pérez Martínez', 3), " +
		        "(54321098, 'Isabel García Rodríguez', 5);";
		
		String tablaEquipos = "equipos";
		String datosEquipos = "(num_serie, nombre, id_facultad) VALUES " +
		        "(11, 'Los Elefantes', 5), " +
		        "(12, 'Los Rinocerontes', 1), " +
		        "(13, 'Los Hipopótamos', 2), " +
		        "(14, 'Los Leones Marinos', 4), " +
		        "(15, 'Las Nutrias', 3);";
		
		String tablaReserva = "reserva";
		String datosReserva = "(dni, num_serie, comienzo, fin) VALUES " +
		        "(98765432, 13, '2024-05-05', '2024-05-10'), " +
		        "(87654321, 14, '2024-05-06', '2024-05-11'), " +
		        "(76543210, 11, '2024-05-07', '2024-05-12'), " +
		        "(65432109, 12, '2024-05-08', '2024-05-13'), " +
		        "(54321098, 15, '2024-05-09', '2024-05-14');";
		
		System.out.println("Datos insertados correctamente.");

		conex.insertData(db, tablaFacultad, datosFacultad);
		conex.insertData(db, tablaInvestigadores, datosInvestigadores);
		conex.insertData(db, tablaEquipos, datosEquipos);
		conex.insertData(db, tablaReserva, datosReserva);
		
		conex.closeConnection();
	}
}
