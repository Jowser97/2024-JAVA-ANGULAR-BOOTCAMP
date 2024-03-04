package TA7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class EjGrupalAlejandro {
    public static void main(String[] args) {

        StringBuilder datos = new StringBuilder(" - - ORDEN POR ID - - \n\n");
        HashMap<Integer, String> nombreID = new HashMap<>();
        HashMap<Integer, Integer> nombreEdad = new HashMap<>();
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad"));

        // segundo.put("Jose", 26);
        // segundo.put("Isabel", 18);
        // segundo.put("Joel", 19);
        // segundo.put("Sebas", 29);
        // segundo.put("Abdellah", 19);
        // segundo.put("Antonio", 23);
        // segundo.put("Diego", 22);
        // segundo.put("Manel", 26);
        // segundo.put("Jessica", 23);
        // segundo.put("Santos", 24);
        // segundo.put("Alex", 23);
        // segundo.put("Ana María", 29);
        // segundo.put("Aurora", 30);
        // segundo.put("Laia", 23);
        // segundo.put("Alejandro", 19);

        int ultimoID = 0;
        for (int i = 1; i <= cant; i++) {
            JPanel panel = new JPanel(new GridLayout(0, 2)); // GridLayout para organizar los campos de texto en dos
                                                             // columnas
            panel.add(new JLabel("Nombre del alumno: "));
            JTextField nombre = new JTextField(10);
            panel.add(nombre);

            panel.add(new JLabel("Edad del alummno: "));
            JTextField edad = new JTextField(10);
            panel.add(edad);

            int result = JOptionPane.showConfirmDialog(null, panel, "Introduzca información del producto",
                    JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                String nombreAlumno = nombre.getText();
                int edadAlumno = Integer.parseInt(edad.getText());
                nombreID.put(i, nombreAlumno);
                nombreEdad.put(i, edadAlumno);
            }
            ultimoID = i;
        }

        
        for (Integer id : nombreID.keySet()) {
            datos.append("Nombre: " + id+"\n - ID: " + nombreID.get(id)+"\n - Edad: "+nombreEdad.get(id));
            
            
            System.out.println("ID: " + id+ "ULTIMO id:" +ultimoID);
            System.out.println(" - Nombre: " + nombreID.get(id)+"\n - Edad: "+nombreEdad.get(id));
            
        }

        ventana(datos);
    }

    public static void ventana(StringBuilder datos) {
        JFrame frame = new JFrame("Alumnos curso TechTalent2024");
        frame.setSize(450, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel titul = new JPanel();
        JLabel titulo = new JLabel(" - - CON QUE VALOR SE ORDENARÁN LOS ALUMNOS - - ");
        titulo.setVerticalAlignment(SwingConstants.TOP); // Mover el texto al borde superior del JFrame en la posición
                                                         // vertical
        titulo.setHorizontalAlignment(SwingConstants.CENTER); // Mover el texto al centro en la posición horizontal
        titul.add(titulo);

        JPanel marcadores = new JPanel();
        marcadores.setBounds(0, 25, 100, 280); // Establecer el tamaño y posición del panel a uno que nos convenga

        JLabel labelId = new JLabel("ID: "); // Etiqueta
        JCheckBox id = new JCheckBox(); // Casilla
        JLabel labelNombre = new JLabel("Nombre: ");
        JCheckBox nombre = new JCheckBox();
        JLabel labelEdad = new JLabel("Edad: ");
        JCheckBox edad = new JCheckBox();

        marcadores.add(labelId);
        marcadores.add(id);
        marcadores.add(labelNombre);
        marcadores.add(nombre);
        marcadores.add(labelEdad);
        marcadores.add(edad);

        JPanel contenidoDinamico = new JPanel(); // Creamos un panel donde iremos poniendo varios paneles según que
                                                 // quiero mostrar
        contenidoDinamico.setBounds(100, 25, 350, 280); // Establezco un tamaño y posición fijo
        JPanel ordenID = new JPanel();
        // Método para ordenar los alumnos por el ID, concatenandolo a un StringBuilder
        // para mostrarlo en la linea de abajo [ordenID.add(new JLabel("¿Funciona ID?"))
        // --> ordenID.add(new JLabel(StringBuilder.toString))]
        ordenID.add(new JLabel(datos.toString()));

        id.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (id.isSelected() && nombre.isSelected() || edad.isSelected()) { // Cuando selecciones una casilla
                                                                                      // con otra seleccionada, la
                                                                                      // anterior se deseleccionará
                    if (nombre.isSelected()) {
                        nombre.setSelected(false);
                    } else {
                        edad.setSelected(false);
                    }
                }

                if (id.isSelected()) { // Cuando la casilla esté seleccionada
                    contenidoDinamico.removeAll(); // Limpiar contenido previo del panelDinámico
                    contenidoDinamico.add(ordenID); // Añade el contenido del panel ordenID al dinámico
                } else {
                    contenidoDinamico.removeAll();
                }
                contenidoDinamico.revalidate(); // Revalidar el panelDinámico
                contenidoDinamico.repaint(); // Repintar el panelDinámico
            }
        });

        JPanel ordenNombre = new JPanel();
        // Método para ordenar los alumnos por el Nombre, concatenandolo a un
        // StringBuilder para mostrarlo en la linea de abajo [ordenID.add(new
        // JLabel("¿Funciona Nombre?")) --> ordenID.add(new
        // JLabel(StringBuilder.toString))
        ordenNombre.add(new JLabel("¿Funciona Nombre?"));

        nombre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (nombre.isSelected() && id.isSelected() || edad.isSelected()) { // Cuando selecciones una casilla
                                                                                      // con otra seleccionada, la
                                                                                      // anterior se deseleccionará
                    if (id.isSelected()) {
                        id.setSelected(false);
                    } else {
                        edad.setSelected(false);
                    }
                }

                if (nombre.isSelected()) { // Cuando la casilla esté seleccionada
                    contenidoDinamico.removeAll(); // Limpiar contenido previo del panelDinámico
                    contenidoDinamico.add(ordenNombre); // Añade el contenido del panel ordenNombre al dinámico
                } else {
                    contenidoDinamico.removeAll();
                }
                contenidoDinamico.revalidate(); // Revalidar el panelDinámico
                contenidoDinamico.repaint(); // Repintar el panelDinámico
            }
        });

        JPanel ordenEdad = new JPanel();
        // Método para ordenar los alumnos por el Edad, concatenandolo a un
        // StringBuilder para mostrarlo en la linea de abajo [ordenID.add(new
        // JLabel("¿Funciona Edad?")) --> ordenID.add(new
        // JLabel(StringBuilder.toString))
        ordenEdad.add(new JLabel("¿Funciona Edad?"));

        edad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (edad.isSelected() && id.isSelected() || nombre.isSelected()) { // Cuando selecciones una casilla
                                                                                      // con otra seleccionada, la
                                                                                      // anterior se deseleccionará
                    if (id.isSelected()) {
                        id.setSelected(false);
                    } else {
                        nombre.setSelected(false);
                    }
                }

                if (edad.isSelected()) { // Cuando la casilla esté seleccionada
                    contenidoDinamico.removeAll(); // Limpiar contenido previo del panelDinámico
                    contenidoDinamico.add(ordenEdad); // Añade el contenido del panel ordenEdad al dinámico
                } else {
                    contenidoDinamico.removeAll();
                }
                contenidoDinamico.revalidate(); // Revalidar el panelDinámico
                contenidoDinamico.repaint(); // Repintar el panelDinámico
            }
        });

        frame.add(contenidoDinamico);
        frame.add(marcadores);
        frame.add(titul);
        frame.setVisible(true); // Hacer visible el frame
    }
}