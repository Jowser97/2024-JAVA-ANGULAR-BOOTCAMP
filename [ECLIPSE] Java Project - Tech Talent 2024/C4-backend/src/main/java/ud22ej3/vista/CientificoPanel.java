package ud22ej3.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import ud22ej3.controlador.CientificoController;
import ud22ej3.modelo.Cientifico;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CientificoPanel extends JPanel {
    private Connection connection;
    private CientificoController cientificoController;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField dniField;
    private JTextField nomApelsField;

    public CientificoPanel(Connection connection) {
        this.connection = connection;
        this.cientificoController = new CientificoController(connection);
        initUI();
        loadData();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(new Object[]{"DNI", "Nombre y Apellidos"}, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        inputPanel.add(new JLabel("DNI:"));
        dniField = new JTextField();
        inputPanel.add(dniField);

        inputPanel.add(new JLabel("Nombre y Apellidos:"));
        nomApelsField = new JTextField();
        inputPanel.add(nomApelsField);

        JButton addButton = new JButton("Añadir");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCientifico();
            }
        });
        inputPanel.add(addButton);

        JButton updateButton = new JButton("Actualizar");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateCientifico();
            }
        });
        inputPanel.add(updateButton);

        add(inputPanel, BorderLayout.SOUTH);
    }

    private void loadData() {
        try {
            List<Cientifico> cientificos = cientificoController.getAllCientificos();
            tableModel.setRowCount(0); // Clear existing data
            for (Cientifico cientifico : cientificos) {
                tableModel.addRow(new Object[]{cientifico.getDni(), cientifico.getNomApels()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addCientifico() {
        try {
            Cientifico cientifico = new Cientifico(dniField.getText(), nomApelsField.getText());
            cientificoController.addCientifico(cientifico);
            loadData();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding cientifico: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateCientifico() {
        try {
            int selectedRow = table.getSelectedRow();
            if (selectedRow >= 0) {
                String dni = (String) tableModel.getValueAt(selectedRow, 0);
                Cientifico cientifico = new Cientifico(dni, nomApelsField.getText());
                cientificoController.updateCientifico(cientifico);
                loadData();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un científico para actualizar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating cientifico: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
