package TA18conexJavaMySQL;

public class ej07LosCientificos {

	public static void main(String[] args) {
		
		Conexion conex = new Conexion();
		String db = "los_cientificos";
		
		String tablaCientificos = "cientificos";
		String datosCientificos = "(dni, nom_apels) VALUES " +
		        "(12341234, 'Miguel García'), " +
		        "(23452345, 'Lucía Martínez'), " +
		        "(34563456, 'Pablo Fernández'), " +
		        "(45674567, 'Sofía Rodríguez'), " +
		        "(56785678, 'Carmen López');";

		String tablaProyecto = "proyecto";
		String datosProyecto = "(id_proyecto, nombre, horas) VALUES " +
		        "(11, 'Proyecto Lambda', 55), " +
		        "(12, 'Proyecto Mu', 35), " +
		        "(13, 'Proyecto Nu', 40), " +
		        "(14, 'Proyecto Xi', 30), " +
		        "(15, 'Proyecto Ómicron', 45);";
		
		String tablaAsignadoA = "asignado_a";
		String datosAsignadoA = "(cientifico, id_proyecto) VALUES " +
		        "(12341234, 11), " +
		        "(23452345, 12), " +
		        "(34563456, 13), " +
		        "(45674567, 14), " +
		        "(56785678, 15);";
		
		System.out.println("Datos insertados correctamente.");

		conex.insertData(db, tablaCientificos, datosCientificos);
		conex.insertData(db, tablaProyecto, datosProyecto);
		conex.insertData(db, tablaAsignadoA, datosAsignadoA);

		conex.closeConnection();
	}

}
