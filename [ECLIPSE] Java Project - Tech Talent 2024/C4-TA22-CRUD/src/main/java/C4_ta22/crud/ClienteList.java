package C4_ta22.crud;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class ClienteList extends JFrame {
    private ClienteDAO clienteDAO;
    private JTable table;
    private DefaultTableModel tableModel;

    public ClienteList(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
        initComponents();
        loadData();
    }

    private void initComponents() {
        setTitle("Lista de Clientes");
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(new String[]{"ID", "Nombre", "Apellido1", "Apellido2", "Dirección", "DNI", "Fecha"}, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel panelButtons = new JPanel();
        JButton btnNew = new JButton("Nuevo");
        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openForm(new Cliente());
            }
        });
        panelButtons.add(btnNew);

        JButton btnEdit = new JButton("Editar");
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    int id = (int) tableModel.getValueAt(selectedRow, 0);
                    try {
                        Cliente cliente = clienteDAO.getCliente(id);
                        openForm(cliente);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(ClienteList.this, "Seleccione un cliente para editar.");
                }
            }
        });
        panelButtons.add(btnEdit);

        JButton btnDelete = new JButton("Eliminar");
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    int id = (int) tableModel.getValueAt(selectedRow, 0);
                    try {
                        Cliente cliente = new Cliente();
                        cliente.setId(id);
                        clienteDAO.deleteCliente(cliente);
                        loadData();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(ClienteList.this, "Seleccione un cliente para eliminar.");
                }
            }
        });
        panelButtons.add(btnDelete);

        add(panelButtons, BorderLayout.SOUTH);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void loadData() {
        tableModel.setRowCount(0);
        try {
            List<Cliente> listClientes = clienteDAO.listAllClientes();
            for (Cliente cliente : listClientes) {
                tableModel.addRow(new Object[]{
                        cliente.getId(),
                        cliente.getNombre(),
                        cliente.getApellido1(),
                        cliente.getApellido2(),
                        cliente.getDireccion(),
                        cliente.getDni(),
                        cliente.getFecha()
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void openForm(Cliente cliente) {
        ClienteForm form = new ClienteForm(clienteDAO);
        form.setCliente(cliente);
        form.setVisible(true);
        form.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                loadData();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ClienteDAO clienteDAO = new ClienteDAO();
                new ClienteList(clienteDAO).setVisible(true);
            }
        });
    }
}
