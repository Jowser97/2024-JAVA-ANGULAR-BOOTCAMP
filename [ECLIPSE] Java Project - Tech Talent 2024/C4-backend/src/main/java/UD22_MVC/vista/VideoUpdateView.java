package UD22_MVC.vista;

import javax.swing.*;

import UD22_MVC.controlador.VideoController;
import UD22_MVC.modelo.Video;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VideoUpdateView extends JFrame {
    private VideoController videoController;

    public VideoUpdateView() {
        videoController = new VideoController();
        setTitle("Actualizar Video");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 2));

        JTextField idField = new JTextField();
        JTextField titleField = new JTextField();
        JTextField directorField = new JTextField();
        JTextField cliIdField = new JTextField();

        add(new JLabel("ID:"));
        add(idField);
        add(new JLabel("Título:"));
        add(titleField);
        add(new JLabel("Director:"));
        add(directorField);
        add(new JLabel("ID Cliente:"));
        add(cliIdField);

        JButton updateButton = new JButton("Actualizar");
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                Video video = videoController.getVideoById(id);
                if (video != null) {
                    video.setTitle(titleField.getText());
                    video.setDirector(directorField.getText());
                    video.setCli_id(Integer.parseInt(cliIdField.getText()));
                    videoController.updateVideo(video);
                    JOptionPane.showMessageDialog(null, "Video actualizado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Video no encontrado.");
                }
            }
        });
        add(updateButton);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VideoUpdateView();
    }
}
