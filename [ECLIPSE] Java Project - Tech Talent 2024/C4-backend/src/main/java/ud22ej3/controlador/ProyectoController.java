package ud22ej3.controlador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import ud22ej3.modelo.Proyecto;

public class ProyectoController {
    private Connection connection;

    public ProyectoController(Connection connection) {
        this.connection = connection;
    }

    public List<Proyecto> getAllProyectos() throws SQLException {
        List<Proyecto> proyectos = new ArrayList<>();
        String query = "SELECT * FROM proyecto";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            String idProyecto = rs.getString("id_proyecto");
            String nombre = rs.getString("nombre");
            int horas = rs.getInt("horas");
            proyectos.add(new Proyecto(idProyecto, nombre, horas));
        }

        return proyectos;
    }

    public void addProyecto(Proyecto proyecto) throws SQLException {
        String query = "INSERT INTO proyecto (id_proyecto, nombre, horas) VALUES (?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, proyecto.getIdProyecto());
        pstmt.setString(2, proyecto.getNombre());
        pstmt.setInt(3, proyecto.getHoras());
        pstmt.executeUpdate();
    }

    public void updateProyecto(Proyecto proyecto) throws SQLException {
        String query = "UPDATE proyecto SET nombre = ?, horas = ? WHERE id_proyecto = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, proyecto.getNombre());
        pstmt.setInt(2, proyecto.getHoras());
        pstmt.setString(3, proyecto.getIdProyecto());
        pstmt.executeUpdate();
    }

    public void deleteProyecto(String idProyecto) throws SQLException {
        String query = "DELETE FROM proyecto WHERE id_proyecto = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, idProyecto);
        pstmt.executeUpdate();
    }
}
