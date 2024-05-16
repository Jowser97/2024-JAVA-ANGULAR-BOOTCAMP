package TA18conexJavaMySQL;

public class ej01TiendaInfor {

	public static void main(String[] args) {

		Conexion conex = new Conexion();
		String db = "tiendainformatica";
		// Inserciones en la tabla fabricantes
		
		String tablaFabricantes = "fabricantes";
		String datosFabricantes = "(nombre_fabricante) VALUES " + "('Fabricante11'), " + "('Fabricante12'), "
				+ "('Fabricante13'), " + "('Fabricante14'), " + "('Fabricante15');";

		// Inserciones en la tabla articulos
		
		String tablaArticulos = "articulos";
		String datosArticulos = "(nombre_articulo, precio, id_fabricante) VALUES "
				+ "('tarjeta grafica RTX 3080', 1199.99, 6), " + "('procesador Ryzen 9', 499.99, 5), "
				+ "('monitor LED 27 pulgadas', 349.99, 4), " + "('teclado inalámbrico', 79.99, 4), "
				+ "('disco duro externo 2TB', 89.99, 7);";

		System.out.println("Datos insertados correctamente.");
		
		conex.insertData(db, tablaFabricantes, datosFabricantes);
		conex.insertData(db, tablaArticulos, datosArticulos);
		
		conex.closeConnection();
	}
}