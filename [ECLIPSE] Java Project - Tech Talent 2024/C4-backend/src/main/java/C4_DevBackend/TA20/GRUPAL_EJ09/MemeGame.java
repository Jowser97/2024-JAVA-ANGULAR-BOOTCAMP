package C4_DevBackend.TA20.GRUPAL_EJ09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;

public class MemeGame {
    private static final int ROWS = 4;
    private static final int COLS = 4;
    private static final int NUM_CARDS = ROWS * COLS;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_images";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String SQL_QUERY = "SELECT name, image FROM parejas ORDER BY name";
    private static ImageIcon backImage;
    private static ArrayList<ImageIcon> cardImages;
    private static JButton[] cardButtons;
    private static int moveCount = 0;
    private static int pairsFound = 0;
    private static JLabel moveCounterLabel;
    private static JFrame frame;

    public static void main(String[] args) {
        loadCardImagesFromDatabase();

        frame = new JFrame("Juego de Memoria");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(ROWS, COLS));

        cardButtons = new JButton[NUM_CARDS];
        Dimension buttonSize = new Dimension(frame.getWidth() / COLS, frame.getHeight() / ROWS);

        for (int i = 0; i < NUM_CARDS; i++) {
            cardButtons[i] = new JButton();
            cardButtons[i].setIcon(scaleImageIcon(backImage, buttonSize));
            cardButtons[i].setPreferredSize(buttonSize);
            cardButtons[i].setBorderPainted(false);
            cardButtons[i].setContentAreaFilled(false);
            cardButtons[i].addActionListener(new CardClickListener(i));
            panel.add(cardButtons[i]);
        }

        moveCounterLabel = new JLabel("Movimientos: 0");
        JPanel topPanel = new JPanel();
        topPanel.add(moveCounterLabel);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu gameMenu = new JMenu("Juego");
        JMenuItem restartItem = new JMenuItem("Reiniciar");
        restartItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartGame();
            }
        });
        gameMenu.add(restartItem);

        JMenuItem exitItem = new JMenuItem("Finalizar");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        gameMenu.add(exitItem);

        menuBar.add(gameMenu);

        JMenu infoMenu = new JMenu("Ayuda");
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAboutDialog();
            }
        });
        infoMenu.add(aboutItem);

        menuBar.add(infoMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }

    private static void showAboutDialog() {
        JOptionPane.showMessageDialog(frame, "Hecho por:\n Aurora, Alex y Jose\n:D");
    }

    private static void loadCardImagesFromDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(SQL_QUERY)) {
            ResultSet rs = pstmt.executeQuery();

            cardImages = new ArrayList<>();
            while (rs.next()) {
                byte[] imageData = rs.getBytes("image");
                String name = rs.getString("name");
                ImageIcon icon = new ImageIcon(imageData);
                icon.setDescription(name);
                cardImages.add(icon);
            }

            if (cardImages.size() < NUM_CARDS) {
                throw new RuntimeException("No hay suficientes imágenes en la base de datos para crear pares de cartas.");
            }

            Collections.shuffle(cardImages);

            loadBackImageFromDatabase();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void loadBackImageFromDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement("SELECT image FROM dorso WHERE name = 'newDorso'");
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                byte[] imageData = rs.getBytes("image");
                backImage = new ImageIcon(imageData);
            } else {
                throw new RuntimeException("No se encontró la imagen del dorso en la base de datos.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ImageIcon scaleImageIcon(ImageIcon icon, Dimension size) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(size.width, size.height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    private static class CardClickListener implements ActionListener {
        private int index;

        public CardClickListener(int index) {
            this.index = index;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Implementa la lógica de clic de carta aquí
        }
    }

    private static void restartGame() {
//        firstCardIndex = -1;
//        secondCardIndex = -1;
        moveCount = 0;
        pairsFound = 0;
        moveCounterLabel.setText("Movimientos: 0");

        Collections.shuffle(cardImages);

        Dimension buttonSize = new Dimension(cardButtons[0].getWidth(), cardButtons[0].getHeight());
        for (int i = 0; i < NUM_CARDS; i++) {
            cardButtons[i].setIcon(scaleImageIcon(backImage, buttonSize));
        }
    }
}
