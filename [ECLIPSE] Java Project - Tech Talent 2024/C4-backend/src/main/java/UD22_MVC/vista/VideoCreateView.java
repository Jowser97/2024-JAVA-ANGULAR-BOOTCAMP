package UD22_MVC.vista;

import javax.swing.*;

import UD22_MVC.controlador.ClienteController;
import UD22_MVC.controlador.VideoController;
import UD22_MVC.modelo.Cliente;
import UD22_MVC.modelo.Video;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VideoCreateView extends JFrame {
    private VideoController videoController;

    public VideoCreateView() {
        videoController = new VideoController();
        setTitle("Agregar Video");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 2));

        JTextField titleField = new JTextField();
        JTextField directorField = new JTextField();
        
        // ComboBox para listar los clientes
        JComboBox<String> clienteComboBox = new JComboBox<>();
        List<Cliente> clientes = new ClienteController().getAllClientes();
        for (Cliente cliente : clientes) {
            clienteComboBox.addItem(cliente.getNombre() + " " + cliente.getApellido1() + " " + cliente.getApellido2());
        }

        add(new JLabel("Título:"));
        add(titleField);
        add(new JLabel("Director:"));
        add(directorField);
        add(new JLabel("Cliente:"));
        add(clienteComboBox);

        JButton addButton = new JButton("Agregar");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Video video = new Video();
                video.setTitle(titleField.getText());
                video.setDirector(directorField.getText());
                
                // Obtener el cliente seleccionado del ComboBox
                int selectedIndex = clienteComboBox.getSelectedIndex();
                Cliente selectedCliente = clientes.get(selectedIndex);
                video.setCli_id(selectedCliente.getId());
                
                videoController.addVideo(video);
                JOptionPane.showMessageDialog(null, "Video agregado exitosamente.");
            }
        });
        add(addButton);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VideoCreateView();
    }
}

