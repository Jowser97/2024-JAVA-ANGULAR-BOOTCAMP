package C4_ta22.crud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/tu_base_de_datos";
    private String jdbcUsername = "tu_usuario";
    private String jdbcPassword = "tu_contraseña";
    private Connection jdbcConnection;

    public ClienteDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        }
    }

    protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }

    public boolean insertCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO clientes (nombre, apellido1, apellido2, direccion, dni, fecha) VALUES (?, ?, ?, ?, ?, ?)";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, cliente.getNombre());
        statement.setString(2, cliente.getApellido1());
        statement.setString(3, cliente.getApellido2());
        statement.setString(4, cliente.getDireccion());
        statement.setString(5, cliente.getDni());
        statement.setDate(6, new java.sql.Date(cliente.getFecha().getTime()));

        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }

    public List<Cliente> listAllClientes() throws SQLException {
        List<Cliente> listCliente = new ArrayList<>();

        String sql = "SELECT * FROM clientes";

        connect();

        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nombre = resultSet.getString("nombre");
            String apellido1 = resultSet.getString("apellido1");
            String apellido2 = resultSet.getString("apellido2");
            String direccion = resultSet.getString("direccion");
            String dni = resultSet.getString("dni");
            Date fecha = resultSet.getDate("fecha");

            Cliente cliente = new Cliente();
            cliente.setId(id);
            cliente.setNombre(nombre);
            cliente.setApellido1(apellido1);
            cliente.setApellido2(apellido2);
            cliente.setDireccion(direccion);
            cliente.setDni(dni);
            cliente.setFecha(fecha);

            listCliente.add(cliente);
        }

        resultSet.close();
        statement.close();

        disconnect();

        return listCliente;
    }

    public boolean deleteCliente(Cliente cliente) throws SQLException {
        String sql = "DELETE FROM clientes WHERE id = ?";

        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, cliente.getId());

        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;
    }

    public boolean updateCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE clientes SET nombre = ?, apellido1 = ?, apellido2 = ?, direccion = ?, dni = ?, fecha = ? WHERE id = ?";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, cliente.getNombre());
        statement.setString(2, cliente.getApellido1());
        statement.setString(3, cliente.getApellido2());
        statement.setString(4, cliente.getDireccion());
        statement.setString(5, cliente.getDni());
        statement.setDate(6, new java.sql.Date(cliente.getFecha().getTime()));
        statement.setInt(7, cliente.getId());

        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;
    }

    public Cliente getCliente(int id) throws SQLException {
        Cliente cliente = null;
        String sql = "SELECT * FROM clientes WHERE id = ?";

        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            String nombre = resultSet.getString("nombre");
            String apellido1 = resultSet.getString("apellido1");
            String apellido2 = resultSet.getString("apellido2");
            String direccion = resultSet.getString("direccion");
            String dni = resultSet.getString("dni");
            Date fecha = resultSet.getDate("fecha");

            cliente = new Cliente();
            cliente.setId(id);
            cliente.setNombre(nombre);
            cliente.setApellido1(apellido1);
            cliente.setApellido2(apellido2);
            cliente.setDireccion(direccion);
            cliente.setDni(dni);
            cliente.setFecha(fecha);
        }

        resultSet.close();
        statement.close();

        disconnect();

        return cliente;
    }
}
