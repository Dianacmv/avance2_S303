
package avance2_dianamatamoros_sc303;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

    private Usuario personaUsuaria;
    private JButton botonVerRutina;

    public VentanaPrincipal(Usuario personaUsuaria) {
        this.personaUsuaria = personaUsuaria;

        setTitle("Bienvenida " + personaUsuaria.getNombre());
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel etiqueta = new JLabel("Hola " + personaUsuaria.getNombre() + ", selecciona una opción:");
        botonVerRutina = new JButton("Ver rutina de ejercicios");

        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(etiqueta);
        panel.add(botonVerRutina);

        add(panel);

        // Acción al presionar el botón de ver rutina
        botonVerRutina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarRutinaEjemplo();
            }
        });
    }

    // Método provisional para mostrar una rutina de ejemplo
    private void mostrarRutinaEjemplo() {
        Rutina rutina = new Rutina("Rutina inicial", personaUsuaria);
        rutina.agregarEjercicio(new Brazo("Curl de bíceps", 10, 3));
        rutina.agregarEjercicio(new Pierna("Sentadillas", 15, 4));
        rutina.agregarEjercicio(new Espalda("Remo con banda", 12, 3));

        rutina.mostrarEjercicios();
     }
} 
