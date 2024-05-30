package ud22ej3.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import ud22ej3.controlador.AsignadoAController;
import ud22ej3.modelo.AsignadoA;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AsignadoAPanel extends JPanel {
    private Connection connection;
    private AsignadoAController asignadoAController;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField cientificoField;
    private JTextField idProyectoField;

    public AsignadoAPanel(Connection connection) {
        this.connection = connection;
        this.asignadoAController = new AsignadoAController(connection);
        initUI();
        loadData();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(new Object[]{"Científico", "ID Proyecto"}, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        inputPanel.add(new JLabel("Científico:"));
        cientificoField = new JTextField();
        inputPanel.add(cientificoField);

        inputPanel.add(new JLabel("ID Proyecto:"));
        idProyectoField = new JTextField();
        inputPanel.add(idProyectoField);

        JButton addButton = new JButton("Añadir");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addAsignacion();
            }
        });
        inputPanel.add(addButton);

        JButton updateButton = new JButton("Actualizar");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAsignacion();
            }
        });
        inputPanel.add(updateButton);

        add(inputPanel, BorderLayout.SOUTH);
    }

    private void loadData() {
        try {
            List<AsignadoA> asignaciones = asignadoAController.getAllAsignaciones();
            tableModel.setRowCount(0); // Clear existing data
            for (AsignadoA asignadoA : asignaciones) {
                tableModel.addRow(new Object[]{asignadoA.getCientifico(), asignadoA.getIdProyecto()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addAsignacion() {
        try {
            AsignadoA asignadoA = new AsignadoA(cientificoField.getText(), idProyectoField.getText());
            asignadoAController.addAsignacion(asignadoA);
            loadData();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding asignacion: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateAsignacion() {
        try {
            int selectedRow = table.getSelectedRow();
            if (selectedRow >= 0) {
                String cientifico = (String) tableModel.getValueAt(selectedRow, 0);
                AsignadoA asignadoA = new AsignadoA(cientifico, idProyectoField.getText());
                asignadoAController.updateAsignacion(asignadoA);
                loadData();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una asignación para actualizar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating asignacion: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
