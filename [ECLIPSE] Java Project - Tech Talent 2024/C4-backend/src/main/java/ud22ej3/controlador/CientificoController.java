package ud22ej3.controlador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import ud22ej3.modelo.Cientifico;

public class CientificoController {
    private Connection connection;

    public CientificoController(Connection connection) {
        this.connection = connection;
    }

    public List<Cientifico> getAllCientificos() throws SQLException {
        List<Cientifico> cientificos = new ArrayList<>();
        String query = "SELECT * FROM cientificos";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            String dni = rs.getString("dni");
            String nomApels = rs.getString("nom_apels");
            cientificos.add(new Cientifico(dni, nomApels));
        }

        return cientificos;
    }

    public void addCientifico(Cientifico cientifico) throws SQLException {
        String query = "INSERT INTO cientificos (dni, nom_apels) VALUES (?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, cientifico.getDni());
        pstmt.setString(2, cientifico.getNomApels());
        pstmt.executeUpdate();
    }

    public void updateCientifico(Cientifico cientifico) throws SQLException {
        String query = "UPDATE cientificos SET nom_apels = ? WHERE dni = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, cientifico.getNomApels());
        pstmt.setString(2, cientifico.getDni());
        pstmt.executeUpdate();
    }

    public void deleteCientifico(String dni) throws SQLException {
        String query = "DELETE FROM cientificos WHERE dni = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, dni);
        pstmt.executeUpdate();
    }
}
