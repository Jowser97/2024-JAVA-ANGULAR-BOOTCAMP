package ud22ej3.controlador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import ud22ej3.modelo.AsignadoA;

public class AsignadoAController {
    private Connection connection;

    public AsignadoAController(Connection connection) {
        this.connection = connection;
    }

    public List<AsignadoA> getAllAsignaciones() throws SQLException {
        List<AsignadoA> asignaciones = new ArrayList<>();
        String query = "SELECT * FROM asignado_a";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            String cientifico = rs.getString("cientifico");
            String idProyecto = rs.getString("id_proyecto");
            asignaciones.add(new AsignadoA(cientifico, idProyecto));
        }

        return asignaciones;
    }

    public void addAsignacion(AsignadoA asignadoA) throws SQLException {
        String query = "INSERT INTO asignado_a (cientifico, id_proyecto) VALUES (?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, asignadoA.getCientifico());
        pstmt.setString(2, asignadoA.getIdProyecto());
        pstmt.executeUpdate();
    }

    public void updateAsignacion(AsignadoA asignadoA) throws SQLException {
        String query = "UPDATE asignado_a SET id_proyecto = ? WHERE cientifico = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, asignadoA.getIdProyecto());
        pstmt.setString(2, asignadoA.getCientifico());
        pstmt.executeUpdate();
    }

    public void deleteAsignacion(String cientifico, String idProyecto) throws SQLException {
        String query = "DELETE FROM asignado_a WHERE cientifico = ? AND id_proyecto = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, cientifico);
        pstmt.setString(2, idProyecto);
        pstmt.executeUpdate();
    }
}
