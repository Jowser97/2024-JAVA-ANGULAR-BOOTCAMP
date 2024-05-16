package TA18conexJavaMySQL;

public class ej06PiezasyProveedores {

	public static void main(String[] args) {
		
		Conexion conex = new Conexion();
		String db = "piezas_y_proveedores";
		
		String tablaPiezas = "piezas";
		String datosPiezas = "(nombre) VALUES " +
		        "('ratón'), " +
		        "('monitor'), " +
		        "('cable HDMI'), " +
		        "('altavoces'), " +
		        "('webcam');";

		String tablaProveedores = "proveedores";
		String datosProveedores = "(nombre) VALUES " +
		        "('Fnac'),('MediaMarkt'),('PcBox'), ('Carrefour'),('El Corte Inglés');";
		
		String tablaSuministra = "suministra";
		String datosSuministra = "(id_pieza, id_proveedor, precio) VALUES " +
		        "(11, 1, 29.99), " +
		        "(12, 2, 499.99), " +
		        "(13, 3, 9.99), " +
		        "(14, 4, 99.99), " +
		        "(15, 5, 49.99);";
		
		System.out.println("Datos insertados correctamente.");

		conex.insertData(db, tablaPiezas, datosPiezas);
		conex.insertData(db, tablaProveedores, datosProveedores);
		conex.insertData(db, tablaSuministra, datosSuministra);

		conex.closeConnection();

	}

}
