package C4_ta22.crud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ClienteForm extends JFrame {
    private JTextField nombreField;
    private JTextField apellido1Field;
    private JTextField apellido2Field;
    private JTextField direccionField;
    private JTextField dniField;
    private JTextField fechaField;
    private JButton addButton;
    private JButton viewButton;

    public ClienteForm() {
        setTitle("Gestión de Clientes");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(8, 2));

        addComponents();
    }

    private void addComponents() {
        JLabel nombreLabel = new JLabel("Nombre:");
        getContentPane().add(nombreLabel);

        nombreField = new JTextField();
        getContentPane().add(nombreField);
        nombreField.setColumns(10);

        JLabel apellido1Label = new JLabel("Primer Apellido:");
        getContentPane().add(apellido1Label);

        apellido1Field = new JTextField();
        getContentPane().add(apellido1Field);
        apellido1Field.setColumns(10);

        JLabel apellido2Label = new JLabel("Segundo Apellido:");
        getContentPane().add(apellido2Label);

        apellido2Field = new JTextField();
        getContentPane().add(apellido2Field);
        apellido2Field.setColumns(10);

        JLabel direccionLabel = new JLabel("Dirección:");
        getContentPane().add(direccionLabel);

        direccionField = new JTextField();
        getContentPane().add(direccionField);
        direccionField.setColumns(10);

        JLabel dniLabel = new JLabel("DNI:");
        getContentPane().add(dniLabel);

        dniField = new JTextField();
        getContentPane().add(dniField);
        dniField.setColumns(10);

        JLabel fechaLabel = new JLabel("Fecha (yyyy-mm-dd):");
        getContentPane().add(fechaLabel);

        fechaField = new JTextField();
        getContentPane().add(fechaField);
        fechaField.setColumns(10);

        addButton = new JButton("Añadir Cliente");
        getContentPane().add(addButton);

        viewButton = new JButton("Ver Clientes");
        getContentPane().add(viewButton);
    }

    public void addAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void addViewButtonListener(ActionListener listener) {
        viewButton.addActionListener(listener);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void displayClientes(String clientes) {
        JOptionPane.showMessageDialog(this, clientes);
    }
}
