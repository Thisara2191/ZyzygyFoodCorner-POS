package app.gui.panels.components;

import app.models.OrderServices;
import javax.swing.JTable;

/**
 *
 * @author Titu
 */
public abstract class MainFrame extends CustomizedJFrame {

    public abstract void openProductViewDialog(JTable table);

    public abstract JTable getContentTable();

    public abstract OrderServices getServices();

}
