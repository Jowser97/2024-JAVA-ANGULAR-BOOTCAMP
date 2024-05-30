package ud22ej3.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import ud22ej3.controlador.ProyectoController;
import ud22ej3.modelo.Proyecto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProyectoPanel extends JPanel {
    private Connection connection;
    private ProyectoController proyectoController;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField idProyectoField;
    private JTextField nombreField;
    private JTextField horasField;

    public ProyectoPanel(Connection connection) {
        this.connection = connection;
        this.proyectoController = new ProyectoController(connection);
        initUI();
        loadData();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(new Object[]{"ID Proyecto", "Nombre", "Horas"}, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        inputPanel.add(new JLabel("ID Proyecto:"));
        idProyectoField = new JTextField();
        inputPanel.add(idProyectoField);

        inputPanel.add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        inputPanel.add(nombreField);

        inputPanel.add(new JLabel("Horas:"));
        horasField = new JTextField();
        inputPanel.add(horasField);

        JButton addButton = new JButton("Añadir");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProyecto();
            }
        });
        inputPanel.add(addButton);

        JButton updateButton = new JButton("Actualizar");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateProyecto();
            }
        });
        inputPanel.add(updateButton);

        add(inputPanel, BorderLayout.SOUTH);
    }

    private void loadData() {
        try {
            List<Proyecto> proyectos = proyectoController.getAllProyectos();
            tableModel.setRowCount(0); // Clear existing data
            for (Proyecto proyecto : proyectos) {
                tableModel.addRow(new Object[]{proyecto.getIdProyecto(), proyecto.getNombre(), proyecto.getHoras()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addProyecto() {
        try {
            Proyecto proyecto = new Proyecto(idProyectoField.getText(), nombreField.getText(), Integer.parseInt(horasField.getText()));
            proyectoController.addProyecto(proyecto);
            loadData();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding proyecto: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateProyecto() {
        try {
            int selectedRow = table.getSelectedRow();
            if (selectedRow >= 0) {
                String idProyecto = (String) tableModel.getValueAt(selectedRow, 0);
                Proyecto proyecto = new Proyecto(idProyecto, nombreField.getText(), Integer.parseInt(horasField.getText()));
                proyectoController.updateProyecto(proyecto);
                loadData();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un proyecto para actualizar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating proyecto: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
