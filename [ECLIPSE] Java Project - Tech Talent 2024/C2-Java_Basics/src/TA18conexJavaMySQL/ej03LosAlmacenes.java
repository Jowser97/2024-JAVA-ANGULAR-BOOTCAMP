package TA18conexJavaMySQL;

public class ej03LosAlmacenes {

	public static void main(String[] args) {
		
		Conexion conex = new Conexion();
		String db = "losalmacenes";
		
		String tablaAlmacenes = "almacenes";
		String datosAlmacenes = "(lugar, capacidad) VALUES " +
		        "('lugar 11', 25), " +
		        "('lugar 12', 25), " +
		        "('lugar 13', 30), " +
		        "('lugar 14', 30), " +
		        "('lugar 15', 35);";
		
		String tablaCajas = "cajas";
		String datosCajas = "(num_referencia, contenido, valor, almacen) VALUES " +
		        "('REF11', 'Electrodomésticos', 800, 6), " +
		        "('REF12', 'Cosméticos', 400, 7), " +
		        "('REF13', 'Accesorios', 250, 8), " +
		        "('REF14', 'Instrumentos musicales', 600, 9), " +
		        "('REF15', 'Material de oficina', 150, 10);";
		

		System.out.println("Datos insertados correctamente.");

		conex.insertData(db, tablaAlmacenes, datosAlmacenes);
		conex.insertData(db, tablaCajas, datosCajas);

		conex.closeConnection();

	}

}
