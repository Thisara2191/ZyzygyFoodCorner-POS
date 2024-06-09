/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.gui.panels.components;

import javax.swing.JDialog;

/**
 *
 * @author Titu
 */
public class CustomizedJDialog extends JDialog {
    
    private final CustomizedJFrame PARENT;

    public CustomizedJDialog(CustomizedJFrame parent, boolean modal) {
        super(parent, modal);
        this.PARENT = parent;
        parent.getGlassPane().setVisible(true);
    }

    @Override
    public CustomizedJFrame getParent() {
        return PARENT;
    }
    
    @Override
    public void dispose() {
        getParent().getGlassPane().setVisible(false);
        super.dispose();
    }
    
    

}
