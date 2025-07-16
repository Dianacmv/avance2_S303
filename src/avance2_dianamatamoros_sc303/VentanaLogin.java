
package avance2_dianamatamoros_sc303;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLogin extends JFrame {

    private JTextField campoNombre;
    private JButton botonIngresar;

    public VentanaLogin() {
        setTitle("Ingreso al sistema de rutinas");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana

        // Crear los componentes de la ventana
        campoNombre = new JTextField(20);
        botonIngresar = new JButton("Ingresar");

        // Panel para organizar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(new JLabel("Nombre de la persona usuaria:"));
        panel.add(campoNombre);
        panel.add(new JLabel("")); // espacio vacío
        panel.add(botonIngresar);

        add(panel);

        // Evento del botón para ingresar al sistema
        botonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoNombre.getText().trim();
                if (!nombre.isEmpty()) {
                    Usuario usuaria = new Usuario(nombre);
                    VentanaPrincipal ventana = new VentanaPrincipal(usuaria);
                    ventana.setVisible(true);
                    dispose(); // Cerrar esta ventana
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese su nombre.");
                }
            }
        });
    }
} 