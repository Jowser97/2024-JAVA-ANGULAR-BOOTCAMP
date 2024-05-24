package pruebas;

import javax.swing.*;
import java.net.URL;

public class GifInJOptionPane {
    public static void main(String[] args) {
        try {
            // URL del GIF
            URL url = new URL("https://media1.tenor.com/m/ZAMoMuQgf9UAAAAd/mapache-pedro.gif");

            // Cargar el GIF desde la URL
            ImageIcon gifIcon = new ImageIcon(url);

            // Crear un panel que contenga el GIF
            JPanel panel = new JPanel();
            JLabel gifLabel = new JLabel(gifIcon);
            panel.add(gifLabel);

            // Establecer un tamaño predeterminado para el cuadro de diálogo
            int dialogWidth = 300; // Ancho del cuadro de diálogo
            int dialogHeight = 300; // Alto del cuadro de diálogo

            // Mostrar el panel en un JOptionPane con un tamaño personalizado
            JOptionPane.showMessageDialog(null, panel, "GIF en JOptionPane", JOptionPane.PLAIN_MESSAGE, null, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}