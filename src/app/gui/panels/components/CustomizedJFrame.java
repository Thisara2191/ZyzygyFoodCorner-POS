
package app.gui.panels.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class CustomizedJFrame extends JFrame {

    public CustomizedJFrame() {
        setGlassPane(new JPanel() {
            @Override
            public void setOpaque(boolean isOpaque) {
                super.setOpaque(false);
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D gd = (Graphics2D) g;
                gd.setColor(new Color(255, 255, 255, 220)); // Set white color with some transparency
                gd.fillRect(0, 0, getWidth(), getHeight()); // Fill the entire area with white
            }
        });
        getGlassPane().setVisible(false);
    }

    public void close(JComponent CloseIcon) {
        CloseIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }

        });
    };

    public abstract void init();

}
