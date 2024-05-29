package UD22_MVC.vista;

import javax.swing.*;

import UD22_MVC.controlador.VideoController;
import UD22_MVC.modelo.Video;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VideoReadView extends JFrame {
    private VideoController VideoController;

    public VideoReadView() {
        VideoController = new VideoController();
        setTitle("Mostrar Todos los Videos");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JButton refreshButton = new JButton("Actualizar Lista");
        refreshButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<Video> videos = VideoController.getAllVideos();
                textArea.setText("");
                for (Video video : videos) {
                    textArea.append(video.getId() + ": " + video.getTitle() + " dirigido por " + video.getDirector() + "\n");
                }
            }
        });
        add(refreshButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VideoReadView();
    }
}
