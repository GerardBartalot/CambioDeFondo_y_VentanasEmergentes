package cambiarFondoYVentanasEmergentes;

import java.awt.*;
import javax.swing.*;

public class PanelCombinado extends JPanel {

    private JButton boton_nuevo;
    private JButton boton_cerrar;

    public PanelCombinado(JFrame marco) {
        
        setLayout(new BorderLayout());

        // Panel para los botones de colores
        JPanel panelColores = new JPanel();
        panelColores.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10)); // Espaciado entre los botones
        panelColores.setOpaque(false); // Hacer transparente para que no bloquee el color de fondo

        // Botones de colores con imágenes
        JButton botonAmarillo = new JButton(new AccionColor("Amarillo", 
            new ImageIcon(getClass().getResource("bolaamarilla.png")), 
            Color.yellow, this));
        botonAmarillo.setPreferredSize(new Dimension(120, 50)); // Establecemos la dimensión fija

        JButton botonAzul = new JButton(new AccionColor("Azul", 
            new ImageIcon(getClass().getResource("bolaazul.png")), 
            Color.blue, this));
        botonAzul.setPreferredSize(new Dimension(120, 50)); // Dimensión fija

        JButton botonRojo = new JButton(new AccionColor("Rojo", 
            new ImageIcon(getClass().getResource("bolaroja.png")), 
            Color.red, this));
        botonRojo.setPreferredSize(new Dimension(120, 50)); // Dimensión fija

        // Añadir los botones al panel superior
        panelColores.add(botonAmarillo);
        panelColores.add(botonAzul);
        panelColores.add(botonRojo);
        add(panelColores, BorderLayout.NORTH);

        // Panel para los botones de ventana emergente
        JPanel panelVentanas = new JPanel();
        panelVentanas.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelVentanas.setOpaque(false);

        // Botones de ventana emergente
        boton_nuevo = new JButton("Nuevo");
        boton_nuevo.setPreferredSize(new Dimension(130, 30)); // Aumentar tamaño del botón
        boton_cerrar = new JButton("Cerrar todo");
        boton_cerrar.setPreferredSize(new Dimension(130, 30)); // Aumentar tamaño del botón
        panelVentanas.add(boton_nuevo);
        panelVentanas.add(boton_cerrar);
        add(panelVentanas, BorderLayout.SOUTH);

        // Oyente para el botón "Nuevo"
        OyenteNuevo miOyente = new OyenteNuevo();
        boton_nuevo.addActionListener(miOyente);
    }

    public void cambiarFondo(Color color) {
        setBackground(color);
        repaint();
    }

    private class OyenteNuevo implements java.awt.event.ActionListener {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            MarcoEmergente marco = new MarcoEmergente(boton_cerrar);
            marco.setVisible(true);
        }
    }
    
}