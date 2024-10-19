package cambiarFondoYVentanasEmergentes;

import java.awt.*;
import javax.swing.*;

public class AccionColor extends AbstractAction {

    private PanelCombinado panelCombinado;

    public AccionColor(String nombre, Icon icono, Color colorBoton, PanelCombinado panelCombinado) {
        
    	putValue(Action.NAME, nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION, "Poner el panel de color " + nombre);
        putValue("color_de_fondo", colorBoton);
        this.panelCombinado = panelCombinado;
        
    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
    	
        Color c = (Color) getValue("color_de_fondo");
        panelCombinado.cambiarFondo(c);
        
    }
    
}