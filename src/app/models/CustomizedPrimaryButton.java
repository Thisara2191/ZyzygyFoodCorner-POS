/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.models;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Titu
 */
public class CustomizedPrimaryButton {

    public interface Callback {

        void onClick();
    }

    public static JButton getCustomizedButton(String ButtonName, int Xbounds, int Ybounds) {
        JButton buttonInstance = new JButton(ButtonName);
        buttonInstance.setHorizontalAlignment(JButton.CENTER);
        buttonInstance.setBounds(Xbounds, Ybounds, buttonInstance.getPreferredSize().width, 40);
        buttonInstance.setBorder(null);

        return buttonInstance;
    }

    public static JButton getCustomizedButton(String ButtonName, int Xbounds, int Ybounds, Callback callback) {

        JButton buttonInstance = new JButton(ButtonName);
        buttonInstance.setHorizontalAlignment(JButton.CENTER);
        buttonInstance.setBounds(Xbounds, Ybounds, buttonInstance.getPreferredSize().width, 40);
        buttonInstance.setBorder(null);

        buttonInstance.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                callback.onClick();
            }
        });

        return buttonInstance;
    }

    public static JButton getCustomizedButton(String ButtonName, int current_index, int Xbounds, int Ybounds, ButtonGroup group, Callback callback) {

        JButton buttonInstance = new JButton(ButtonName);
        buttonInstance.setHorizontalAlignment(JButton.CENTER);
        buttonInstance.setBounds(Xbounds, Ybounds, buttonInstance.getPreferredSize().width, 40);
        buttonInstance.setBorder(null);
        if (current_index == 0) {
            buttonInstance.setBackground(Constants.PRIMARY);
            buttonInstance.setForeground(Color.WHITE);

        } else {
            buttonInstance.setBackground(Constants.LIGHT_GRAY_243);
            buttonInstance.setForeground(Color.BLACK);
        }

        buttonInstance.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    button.setBackground(Constants.LIGHT_GRAY_243);
                    button.setForeground(Color.BLACK);
                }
                buttonInstance.setBackground(Constants.PRIMARY);
                buttonInstance.setForeground(Color.WHITE);

                callback.onClick();
            }

        });
        group.add(buttonInstance);
        return buttonInstance;
    }

    public static JButton getCustomizedButton(String ButtonName, int current_index, Dimension dimension, int Xbounds, int Ybounds, ButtonGroup group, Callback callback) {

        JButton buttonInstance = new JButton(ButtonName);
        buttonInstance.setHorizontalAlignment(JButton.CENTER);

        buttonInstance.setBounds(Xbounds, Ybounds, dimension.height, dimension.height);
        buttonInstance.setBorder(new MatteBorder(0, 0, 1, 0, Constants.LIGHT_GRAY_243));
        if (current_index == 0) {
            buttonInstance.setBackground(Constants.PRIMARY_LIGHT_1);
            buttonInstance.setForeground(Constants.PRIMARY);

        } else {
            buttonInstance.setBackground(Color.WHITE);
            buttonInstance.setForeground(Color.BLACK);
        }

        buttonInstance.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    button.setBackground(Color.WHITE);
                    button.setForeground(Color.BLACK);
                }
                buttonInstance.setBackground(Constants.PRIMARY_LIGHT_1);
                buttonInstance.setForeground(Constants.PRIMARY);

                callback.onClick();
            }

        });

        group.add(buttonInstance);
        return buttonInstance;
    }

}
