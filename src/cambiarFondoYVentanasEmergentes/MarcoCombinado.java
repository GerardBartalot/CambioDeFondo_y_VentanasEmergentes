package cambiarFondoYVentanasEmergentes;

import javax.swing.*;

public class MarcoCombinado extends JFrame {

    public MarcoCombinado() {
        
    	setTitle("Prueba Combinada");
        
    	setBounds(600, 350, 600, 300);

        PanelCombinado lamina = new PanelCombinado(this);  // Pasamos la referencia del marco
        
        add(lamina);
        
    }
    
}