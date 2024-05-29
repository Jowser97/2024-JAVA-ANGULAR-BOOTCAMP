package UD22_MVC.vista;

import javax.swing.*;

import UD22_MVC.controlador.ClienteController;
import UD22_MVC.modelo.Cliente;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteCreateView extends JFrame {
    private ClienteController clienteController;

    public ClienteCreateView() {
        clienteController = new ClienteController();
        setTitle("Agregar Cliente");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 2));

        // Campos de texto
        JTextField nombreField = new JTextField();
        JTextField apellido1Field = new JTextField();
        JTextField apellido2Field = new JTextField();
        JTextField direccionField = new JTextField();
        JTextField dniField = new JTextField();
        JTextField fechaField = new JTextField();

        // Añadir campos al formulario
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

        // Botón para agregar cliente
        JButton addButton = new JButton("Agregar");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                cliente.setNombre(nombreField.getText());
                cliente.setApellido1(apellido1Field.getText());
                cliente.setApellido2(apellido2Field.getText());
                cliente.setDireccion(direccionField.getText());
                cliente.setDni(dniField.getText());
                cliente.setFecha(java.sql.Date.valueOf(fechaField.getText()));
                clienteController.addCliente(cliente);
                JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente.");
            }
        });
        add(addButton);

        // Mostrar ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClienteCreateView();
    }
}
