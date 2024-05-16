package TA18conexJavaMySQL;

public class ej05Directores {

	public static void main(String[] args) {
		
		Conexion conex = new Conexion();
		String db = "directores";
		
		String tablaDespachos = "despachos";
		String datosDespachos = "(capacidad) VALUES " +
		        "(30), " +
		        "(30), " +
		        "(35), " +
		        "(35), " +
		        "(40);";

		String tablaDirectoresSinJefe = "directores";
		String datosDirectoresSinJefe = "(dni, nom_apels, despacho) VALUES " +
		        "(12345678, 'Elena Sánchez Pérez', 8), " +
		        "(23456789, 'Pedro Martínez Gómez', 9), " +
		        "(34567890, 'Lucía Rodríguez Ruiz', 10), " +
		        "(98765432, 'Sofía Gómez Martínez', 13), " +
		        "(87654321, 'Pablo Rodríguez López', 14) ";
		
		System.out.println("Datos insertados correctamente.");

		conex.insertData(db, tablaDespachos, datosDespachos);
		conex.insertData(db, tablaDirectoresSinJefe, datosDirectoresSinJefe);

		conex.closeConnection();
		
	}
}
