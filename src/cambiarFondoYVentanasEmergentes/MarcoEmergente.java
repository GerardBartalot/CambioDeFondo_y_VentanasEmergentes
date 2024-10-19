package cambiarFondoYVentanasEmergentes;

import javax.swing.*;

public class MarcoEmergente extends JFrame {
    
	private static int contador = 0;

    public MarcoEmergente(JButton botonCerrarPrincipal) {
        
    	contador++;
        setTitle("Ventana " + contador);
        setBounds(40 * contador, 40 * contador, 300, 150);

        CierraTodos oyenteCerrar = new CierraTodos();
        botonCerrarPrincipal.addActionListener(oyenteCerrar);
        
    }

    private class CierraTodos implements java.awt.event.ActionListener {
    	
        public void actionPerformed(java.awt.event.ActionEvent e) {
        	
            dispose();
            
        }
        
    }
    
}