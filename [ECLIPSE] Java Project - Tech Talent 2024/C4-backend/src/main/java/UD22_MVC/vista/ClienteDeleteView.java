package UD22_MVC.vista;

import javax.swing.*;

import UD22_MVC.controlador.ClienteController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteDeleteView extends JFrame {
    private ClienteController ClienteController;

    public ClienteDeleteView() {
        ClienteController = new ClienteController();
        setTitle("Eliminar Cliente");
        setSize(400, 150);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 2));

        JTextField idField = new JTextField();
        add(new JLabel("ID:"));
        add(idField);

        JButton deleteButton = new JButton("Eliminar");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                ClienteController.deleteCliente(id);
                JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente.");
            }
        });
        add(deleteButton);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClienteDeleteView();
    }
}
