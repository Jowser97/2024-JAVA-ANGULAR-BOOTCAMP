package TA18conexJavaMySQL;

public class ej02Empleados {

	public static void main(String[] args) {

		Conexion conex = new Conexion();
		String db = "empleados";
		
		String tablaDepartamentos = "departamentos";
		String datosDepartamentos = "(codigo, nombre, presupuesto) VALUES " +
		        "(12, 'recursos humanos', 100000), " +
		        "(56, 'contabilidad', 150000), " +
		        "(78, 'produccion', 300000), " +
		        "(45, 'mantenimiento', 75000), " +
		        "(89, 'investigacion y desarrollo', 200000);";
		
		String tablaEmpleados = "empleados";
		String datosEmpleados = "(dni, nombre, apellidos, departamento) VALUES " +
		        "('12121212', 'Pedro', 'Gonzalez', 12), " +
		        "('13131313', 'Laura', 'Diaz', 78), " +
		        "('14141414', 'Antonio', 'Martinez', 45), " +
		        "('15151515', 'Ana', 'Fernandez', 56), " +
		        "('16161616', 'Sergio', 'Sanchez', 89);";
		

		System.out.println("Datos insertados correctamente.");

		conex.insertData(db, tablaDepartamentos, datosDepartamentos);
		conex.insertData(db, tablaEmpleados, datosEmpleados);

		conex.closeConnection();
	}

}
