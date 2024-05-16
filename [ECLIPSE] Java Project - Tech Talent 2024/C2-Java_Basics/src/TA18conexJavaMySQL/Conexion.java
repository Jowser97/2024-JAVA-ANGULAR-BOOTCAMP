package TA18conexJavaMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conexion {

	private Connection conexion;
	private String query;
	private Statement st;

	public Conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
			this.query = "";
			System.out.println("Server conectado ");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.print("No se ha podido conectar con mi base de datos");
			System.out.println(e);
		} 
	}

	public void closeConnection() {
		try {
			this.conexion.close();
			JOptionPane.showInternalMessageDialog(null, "Se ha finalizado la conexión con el servidor");
		} catch (SQLException e) {
			System.out.println("Error cerrando la conexión con el server.");
		}
	}
	
	public void createDB(String name) {
		try {
			query = "CREATE DATABASE IF NOT EXISTS " + name;
			st = conexion.createStatement();
			st.executeUpdate(query);
			System.out.println("Se ha creado la base de datos " + name + " de manera exitosa.");
		} catch (SQLException e) {
			System.out.println("Error creando la base de datos " + name);
		}
	}
	
	public void createTable(String db, String name, String atributos) {
		try {
			useDB(db);
			query = "CREATE TABLE IF NOT EXISTS " + name + atributos;
			st.executeUpdate(query);
			System.out.println("Se ha creado la tabla " + name + " de manera exitosa.");
			
		} catch (SQLException e) {
			System.out.println("Error creando la tabla " + name);
		}
	}
	
	public void insertData(String db, String tabla, String values) {
		try {
			useDB(db);
			query = "INSERT INTO " + tabla + values;
			st.executeUpdate(query);
			System.out.println("Se han insertado los datos de la tabla " + tabla + " de manera exitosa.");
		} catch (SQLException e) {
			System.out.println("Error introduciendo datos en la tabla " + tabla);
		}
	}
	
	public void deleteData(String db, String tabla, String id) {
		try {
			useDB(db);
			query = "DELETE FROM " + tabla + " WHERE ID = `" + id + "`"; 
			st.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Se ha borrado el registro " + id + " de la tabla " + tabla);
		} catch (SQLException e) {
			System.out.println("Error eliminando el registro " + id + " de la tabla " + tabla);
		}
	}
	
	private void useDB(String db) {
		try {
			query = "USE " + db + ";";
			st = conexion.createStatement();
			st.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Error usando la base de datos " + db);
		}
	}
}