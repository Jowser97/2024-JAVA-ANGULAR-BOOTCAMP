package UD22_MVC.vista;

import javax.swing.*;

import UD22_MVC.controlador.ClienteController;
import UD22_MVC.modelo.Cliente;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteUpdateView extends JFrame {
    private ClienteController clienteController;

    public ClienteUpdateView() {
        clienteController = new ClienteController();
        setTitle("Actualizar Cliente");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 2));

        JTextField idField = new JTextField();
        JTextField nombreField = new JTextField();
        JTextField apellido1Field = new JTextField();
        JTextField apellido2Field = new JTextField();
        JTextField direccionField = new JTextField();
        JTextField dniField = new JTextField();
        JTextField fechaField = new JTextField();

        add(new JLabel("ID:"));
        add(idField);
        add(new JLabel("Nombre:"));
        add(nombreField);
        add(new JLabel("Apellido1:"));
        add(apellido1Field);
        add(new JLabel("Apellido2:"));
        add(apellido2Field);
        add(new JLabel("Dirección:"));
        add(direccionField);
        add(new JLabel("DNI:"));
        add(dniField);
        add(new JLabel("Fecha (YYYY-MM-DD):"));
        add(fechaField);

        JButton updateButton = new JButton("Actualizar");
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                Cliente cliente = clienteController.getClienteById(id);
                if (cliente != null) {
                    cliente.setNombre(nombreField.getText());
                    cliente.setApellido1(apellido1Field.getText());
                    cliente.setApellido2(apellido2Field.getText());
                    cliente.setDireccion(direccionField.getText());
                    cliente.setDni(dniField.getText());
                    cliente.setFecha(java.sql.Date.valueOf(fechaField.getText()));
                    ClienteController.updateCliente(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente actualizado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                }
            }
        });
        add(updateButton);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClienteUpdateView();
    }
}
