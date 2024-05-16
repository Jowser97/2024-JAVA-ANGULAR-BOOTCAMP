package TA18conexJavaMySQL;

public class ej08GrandesAlmacenes {

	public static void main(String[] args) {
	
		Conexion conex = new Conexion();
		String db = "grandes_almacenes";
		
		String tablaCajeros = "cajeros";
		String datosCajeros = "(nom_apels) VALUES " +
		        "('Miguel García'), " +
		        "('Lucía Martínez'), " +
		        "('Pablo Fernández'), " +
		        "('Sofía Rodríguez'), " +
		        "('Carmen López');";

		String tablaProductos = "productos";
		String datosProductos = "(nombre, precio) VALUES " +
		        "('Cerveza', 2.20), " +
		        "('Vino', 4.50), " +
		        "('Zanahorias', 1.30), " +
		        "('Naranjas', 2.70), " +
		        "('Lechuga', 1.00);";
		
		String tablaMaqRegistradoras = "maq_registradoras";
		String datosMaqRegistradoras = "(piso) VALUES " +
		        "(11), " +
		        "(12), " +
		        "(13), " +
		        "(14), " +
		        "(15);";
		
		String tablaVenta = "venta";
		String datosVenta = "(id_producto, id_cajero, id_maquina) VALUES " +
		        "(8, 1, 11), " +
		        "(5, 2, 12), " +
		        "(2, 3, 13), " +
		        "(7, 4, 14), " +
		        "(4, 5, 15);";
		
		System.out.println("Datos insertados correctamente.");

		conex.insertData(db, tablaCajeros, datosCajeros);
		conex.insertData(db, tablaProductos, datosProductos);
		conex.insertData(db, tablaMaqRegistradoras, datosMaqRegistradoras);
		conex.insertData(db, tablaVenta, datosVenta);
		
		conex.closeConnection();
		
	}

}
