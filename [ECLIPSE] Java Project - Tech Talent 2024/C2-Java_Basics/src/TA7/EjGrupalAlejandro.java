package TA7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class EjGrupalAlejandro {
    public static void main(String[] args) {
        StringBuilder datos = new StringBuilder();
        StringBuilder grupo1 = new StringBuilder();
        StringBuilder grupo2 = new StringBuilder();
        StringBuilder grupo3 = new StringBuilder();
        StringBuilder grupo4 = new StringBuilder();
        StringBuilder grupo5 = new StringBuilder();
        HashMap<Integer, String> idNombre = new HashMap<>();
        HashMap<Integer, Integer> idEdad = new HashMap<>();
        AtomicBoolean ordenarID = new AtomicBoolean(false);
        AtomicBoolean ordenarNombre = new AtomicBoolean(false);
        AtomicBoolean ordenarEdad = new AtomicBoolean(false);

        // int cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad"));

        idNombre.put(1, "Jose");
        idNombre.put(2, "Isabel");
        idNombre.put(3, "Joel");
        idNombre.put(4, "Sebas");
        idNombre.put(5, "Abdellah");
        idNombre.put(6, "Antonio");
        idNombre.put(7, "Diego");
        idNombre.put(8, "Manel");
        idNombre.put(9, "Jessica");
        idNombre.put(10, "Santos");
        idNombre.put(11, "Alex");
        idNombre.put(12, "Ana María");
        idNombre.put(13, "Aurora");
        idNombre.put(14, "Laia");
        idNombre.put(15, "Alejandro");

        // int ultimoID = 0;
        // for (int i = 1; i <= cant; i++) {
        // JPanel panel = new JPanel(new GridLayout(0, 2)); // GridLayout para organizar
        // los campos de texto en dos
        // // columnas
        // panel.add(new JLabel("Nombre: "));
        // JTextField nombre = new JTextField(10);
        // panel.add(nombre);

        // panel.add(new JLabel("Edad: "));
        // JTextField edad = new JTextField(10);
        // panel.add(edad);

        // int result = JOptionPane.showConfirmDialog(null, panel, "Introduzca los datos
        // del alumno",
        // JOptionPane.OK_CANCEL_OPTION);

        // if (result == JOptionPane.OK_OPTION) {
        // String nombreAlumno = nombre.getText();
        // int edadAlumno = Integer.parseInt(edad.getText());
        // idNombre.put(i, nombreAlumno);
        // idEdad.put(i, edadAlumno);
        // }
        // ultimoID = i;
        // }

        for (Integer id : idNombre.keySet()) {
            datos.append("Nombre: " + idNombre.get(id) + "\n - ID: " + id + "\n - Edad: " + idEdad.get(id));

            System.out.println("ID: " + id /* + " ULTIMO id: " + ultimoID */);
            System.out.println(" - Nombre: " + idNombre.get(id) + "\n - Edad: " + idEdad.get(id));

        }
        System.out.println("1");
        marcadores(datos, ordenarID, ordenarNombre, ordenarEdad);
        System.out.println("2");

        if (ordenarID.get()) {
            System.out.println("Ordenar por ID");
        } else if (ordenarNombre.get()) {
            gruposAlfabetizados(idNombre, grupo1, grupo2, grupo3, grupo4, grupo5);
        } else if (ordenarEdad.get()) {
            System.out.println("Ordenar por Edad");
        } else {
            System.out.println("3");
        }

        ventana(idNombre, grupo1, grupo2, grupo3, grupo4, grupo5, ordenarID, ordenarNombre, ordenarEdad);
    }

    public static void marcadores(StringBuilder datos, AtomicBoolean ordenarID, AtomicBoolean ordenarNombre,
            AtomicBoolean ordenarEdad) {
        JFrame frame = new JFrame("Como se organizarán los grupos");
        frame.setSize(300, 100);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel marcadores = new JPanel();
        marcadores.setSize(300, 50);

        JPanel boton = new JPanel();
        boton.setSize(300, 50);

        JCheckBox id = new JCheckBox();
        JCheckBox nombre = new JCheckBox();
        JCheckBox edad = new JCheckBox();

        marcadores.add(new JLabel("ID: "));
        marcadores.add(id);
        marcadores.add(new JLabel("Nombre: "));
        marcadores.add(nombre);
        marcadores.add(new JLabel("Edad: "));
        marcadores.add(edad);

        id.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (id.isSelected() && nombre.isSelected() || edad.isSelected()) {
                    if (nombre.isSelected()) {
                        nombre.setSelected(false);
                    } else {
                        edad.setSelected(false);
                    }
                }
            }
        });

        nombre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (nombre.isSelected() && id.isSelected() || edad.isSelected()) {
                    if (id.isSelected()) {
                        id.setSelected(false);
                    } else {
                        edad.setSelected(false);
                    }
                }
            }
        });

        edad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (edad.isSelected() && id.isSelected() || nombre.isSelected()) {
                    if (id.isSelected()) {
                        id.setSelected(false);
                    } else {
                        nombre.setSelected(false);
                    }
                }
            }
        });

        JButton continuar = new JButton("Continuar");
        continuar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (id.isSelected()) {
                    ordenarID.set(true);
                } else if (nombre.isSelected()) {
                    ordenarNombre.set(true);
                } else if (edad.isSelected()) {
                    ordenarEdad.set(true);
                }
                frame.dispose(); // Cerrar la ventana actual
            }
        });

        // Agregamos los paneles al BorderLayout
        frame.add(marcadores, BorderLayout.CENTER);
        frame.add(boton, BorderLayout.SOUTH);

        boton.add(continuar);

        frame.setVisible(true);
        // Pausar el hilo mientras se esta ejecutando la ventana
        while (frame.isVisible()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void ventana(HashMap<Integer, String> idNombre, StringBuilder grupo1,
            StringBuilder grupo2, StringBuilder grupo3, StringBuilder grupo4, StringBuilder grupo5,
            AtomicBoolean ordenarID, AtomicBoolean ordenarNombre,
            AtomicBoolean ordenarEdad) {
        JFrame frame = new JFrame("Alumnos curso TechTalent2024");
        frame.setSize(450, 155);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel titul = new JPanel();
        JLabel titulo = new JLabel(" - - ALUMNOS DEL CURSO - - ");
        titulo.setVerticalAlignment(SwingConstants.TOP); // Mover el texto al borde superior del JFrame en la posición
                                                         // vertical
        titulo.setHorizontalAlignment(SwingConstants.CENTER); // Mover el texto al centro en la posición horizontal
        titul.add(titulo);

        JPanel contenidoDinamico = new JPanel(new GridLayout(1, 5)); // Creamos un panel donde iremos poniendo varios paneles según que
                                                 // quiero mostrar
        contenidoDinamico.setBounds(0, 30, 440, 150); // Establezco un tamaño y posición fijo
        JPanel panelGrupo1 = new JPanel();
        JPanel panelGrupo2 = new JPanel();
        JPanel panelGrupo3 = new JPanel();
        JPanel panelGrupo4 = new JPanel();
        JPanel panelGrupo5 = new JPanel();

        JLabel grupo1Label = new JLabel();
        grupo1Label.setText("/ GRUPO 1 /\n");
        JPanel integrantesG1 = new JPanel();
        integrantesG1.setSize(120, 150);
        
        panelIntegrantes(grupo1, integrantesG1);
        
        JLabel grupo2Label = new JLabel();
        grupo2Label.setText("/ GRUPO 2 /\n");
        JPanel integrantesG2 = new JPanel();
        integrantesG2.setSize(120, 150);
        
        panelIntegrantes(grupo2, integrantesG2);

        JLabel grupo3Label = new JLabel();
        grupo3Label.setText("/ GRUPO 3 /\n");
        JPanel integrantesG3 = new JPanel();
        integrantesG3.setSize(120, 150);
        
        panelIntegrantes(grupo3, integrantesG3);

        JLabel grupo4Label = new JLabel();
        grupo4Label.setText("/ GRUPO 4 /\n");
        JPanel integrantesG4 = new JPanel();
        integrantesG4.setSize(120, 150);
        
        panelIntegrantes(grupo4, integrantesG4);

        JLabel grupo5Label = new JLabel();
        grupo5Label.setText("/ GRUPO 5 /\n");
        JPanel integrantesG5 = new JPanel();
        integrantesG5.setSize(120, 150);
        
        panelIntegrantes(grupo5, integrantesG5);


        if (ordenarID.get()) {
            panelGrupo1.add(new JLabel(grupo1.toString()));
            panelGrupo2.add(new JLabel(grupo2.toString()));
            panelGrupo3.add(new JLabel(grupo3.toString()));
            panelGrupo4.add(new JLabel(grupo4.toString()));
            panelGrupo5.add(new JLabel(grupo5.toString()));
        } else if (ordenarNombre.get()) {
            gruposAlfabetizados(idNombre, grupo1, grupo2, grupo3, grupo4, grupo5);
            panelGrupo1.add(grupo1Label);
            panelGrupo1.add(integrantesG1);
            
            panelGrupo2.add(grupo2Label);
            panelGrupo2.add(integrantesG2);
            
            panelGrupo3.add(grupo3Label);
            panelGrupo3.add(integrantesG3);
            
            panelGrupo4.add(grupo4Label);
            panelGrupo4.add(integrantesG4);
            
            panelGrupo5.add(grupo5Label);
            panelGrupo5.add(integrantesG5);
        } else if (ordenarEdad.get()) {
            panelGrupo1.add(new JLabel(grupo1.toString()));
            panelGrupo2.add(new JLabel(grupo2.toString()));
            panelGrupo3.add(new JLabel(grupo3.toString()));
            panelGrupo4.add(new JLabel(grupo4.toString()));
            panelGrupo5.add(new JLabel(grupo5.toString()));
        } else {
            System.out.println("3");
        }

        contenidoDinamico.add(panelGrupo1);
        contenidoDinamico.add(panelGrupo2);
        contenidoDinamico.add(panelGrupo3);
        contenidoDinamico.add(panelGrupo4);
        contenidoDinamico.add(panelGrupo5);
        frame.add(contenidoDinamico);
        frame.add(titul);
        frame.setVisible(true); // Hacer visible el frame
    }

    public static void gruposAlfabetizados(HashMap<Integer, String> idNombre, StringBuilder grupo1,
            StringBuilder grupo2, StringBuilder grupo3, StringBuilder grupo4, StringBuilder grupo5) {
        StringBuilder grup = new StringBuilder();
        ArrayList<String> ordenAlfa = new ArrayList<>();
        for (String nombre : idNombre.values()) {
            ordenAlfa.add(nombre);
        }

        Collections.sort(ordenAlfa);

        int numeroGrupo = 1;
        int integrantesGrupo = 1;
        for (int indice = 0; indice < ordenAlfa.size(); indice++) {
            if (integrantesGrupo <= 2) {
                String nombre = ordenAlfa.get(indice);
                grup.append(nombre + " ");
            } else if (integrantesGrupo == 3) {
                String nombre = ordenAlfa.get(indice);
                grup.append(nombre);
            }

            if (numeroGrupo == 1 && integrantesGrupo == 3) {
                grupo1.append(grup.toString());
            } else if (numeroGrupo == 2 && integrantesGrupo == 3) {
                grupo2.append(grup.toString());
            } else if (numeroGrupo == 3 && integrantesGrupo == 3) {
                grupo3.append(grup.toString());
            } else if (numeroGrupo == 4 && integrantesGrupo == 3) {
                grupo4.append(grup.toString());
            } else if (numeroGrupo == 5 && integrantesGrupo == 3) {
                grupo5.append(grup.toString());
            }

            if (integrantesGrupo == 3) {
                integrantesGrupo = 0;
                numeroGrupo++;
                grup.setLength(0);
            }

            integrantesGrupo++;
        }
    }

    public static void panelIntegrantes(StringBuilder integrantesGrupo, JPanel losIntegrantes) {
        losIntegrantes.setLayout(new BoxLayout(losIntegrantes, BoxLayout.Y_AXIS));
        
        String[] integrantes = integrantesGrupo.toString().split(" ");
        JLabel Integrante1 = new JLabel();
        JLabel Integrante2 = new JLabel();
        JLabel Integrante3 = new JLabel();

        Integrante1.setText(" - "+integrantes[0]+"\n");
        Integrante2.setText(" - "+integrantes[1]+"\n");
        Integrante3.setText(" - "+integrantes[2]+"\n");

        losIntegrantes.add(Integrante1);
        losIntegrantes.add(Integrante2);
        losIntegrantes.add(Integrante3);
    }
}