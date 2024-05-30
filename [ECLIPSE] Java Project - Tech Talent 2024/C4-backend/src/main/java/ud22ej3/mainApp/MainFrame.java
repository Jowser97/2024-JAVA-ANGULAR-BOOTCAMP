package ud22ej3.mainApp;

import javax.swing.*;

import ud22ej3.vista.AsignadoAPanel;
import ud22ej3.vista.CientificoPanel;
import ud22ej3.vista.ProyectoPanel;

import java.awt.*;
import java.sql.Connection;

public class MainFrame extends JFrame {
    private Connection connection;

    public MainFrame(Connection connection) {
        this.connection = connection;
        initUI();
    }

    private void initUI() {
        setTitle("Gestión de Científicos y Proyectos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Científicos", new CientificoPanel(connection));
        tabbedPane.addTab("Proyectos", new ProyectoPanel(connection));
        tabbedPane.addTab("Asignaciones", new AsignadoAPanel(connection));

        panel.add(tabbedPane, BorderLayout.CENTER);
        add(panel);
    }
}
