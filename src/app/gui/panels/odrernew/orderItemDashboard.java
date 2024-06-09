/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app.gui.panels.odrernew;

import app.models.CustomizedPrimaryButton;
import app.models.database.Database;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

class PanelFactory {

    public static JPanel createSpecialItemsPanel() {
        return new foodBaseSpecialItemsPanel();
    }

    public static JPanel createCategoryItemsPanel(int categoryIndex, orderNewBase parent) {
        return new foodBaseItemsPanel(categoryIndex, Database.PredefinedData.getFoodCategories()[categoryIndex], parent);
    }
}

public final class orderItemDashboard extends javax.swing.JPanel {

    private static final String[] FOOD_CATEGORIES = Database.PredefinedData.getFoodCategories();
    private final orderNewBase PARENT;

    public orderItemDashboard() {
        initComponents();
        this.PARENT = orderNewBase.getBase();
        init();
        loadFoodNames();
    }

    private void init() {
        foodItemBase.setViewportView(PanelFactory.createSpecialItemsPanel());
    }

    private void loadFoodNames() {
        foodItemsViewPanel.setBackground(Color.WHITE);
        int bounds = 0;
        for (int i = 0; i < FOOD_CATEGORIES.length; i++) {
            int current_index = i;
            JButton buttonInstance = CustomizedPrimaryButton.getCustomizedButton("      " + FOOD_CATEGORIES[i] + "      ", i, bounds, 0, foodListButtonGroup, () -> {
                if (current_index == 0) {
                    foodItemBase.setViewportView(PanelFactory.createSpecialItemsPanel());
                    return;
                }
                foodItemBase.setViewportView(PanelFactory.createCategoryItemsPanel(current_index, PARENT));
            });
            foodItemsViewPanel.add(buttonInstance);
            bounds += buttonInstance.getPreferredSize().getWidth() + 50;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foodListButtonGroup = new javax.swing.ButtonGroup();
        myprofileBodyPanel = new javax.swing.JPanel();
        ordernow_head_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        myprofile_head_label1 = new javax.swing.JLabel();
        assignments_lorem1 = new javax.swing.JLabel();
        foodItemsViewPanel = new javax.swing.JPanel();
        foodItemBase = new javax.swing.JScrollPane();

        setLayout(new java.awt.BorderLayout());

        myprofileBodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        myprofileBodyPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
        myprofileBodyPanel.setMinimumSize(new java.awt.Dimension(1150, 750));

        ordernow_head_panel.setBackground(new java.awt.Color(255, 255, 255));
        ordernow_head_panel.setPreferredSize(new java.awt.Dimension(150, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 178));

        myprofile_head_label1.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 22)); // NOI18N
        myprofile_head_label1.setForeground(new java.awt.Color(156, 15, 72));
        myprofile_head_label1.setText("ORDER NOW !");
        myprofile_head_label1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_lorem1.setFont(new java.awt.Font("Rajdhani Medium", 0, 12)); // NOI18N
        assignments_lorem1.setForeground(new java.awt.Color(102, 102, 102));
        assignments_lorem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_lorem1.setText("<html>   <p style=\"text-align:left\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.   </p> </html> ");
        assignments_lorem1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myprofile_head_label1)
                    .addComponent(assignments_lorem1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myprofile_head_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(assignments_lorem1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ordernow_head_panelLayout = new javax.swing.GroupLayout(ordernow_head_panel);
        ordernow_head_panel.setLayout(ordernow_head_panelLayout);
        ordernow_head_panelLayout.setHorizontalGroup(
            ordernow_head_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordernow_head_panelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );
        ordernow_head_panelLayout.setVerticalGroup(
            ordernow_head_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordernow_head_panelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        foodItemsViewPanel.setBackground(new java.awt.Color(238, 238, 238));
        foodItemsViewPanel.setPreferredSize(new java.awt.Dimension(0, 40));

        javax.swing.GroupLayout foodItemsViewPanelLayout = new javax.swing.GroupLayout(foodItemsViewPanel);
        foodItemsViewPanel.setLayout(foodItemsViewPanelLayout);
        foodItemsViewPanelLayout.setHorizontalGroup(
            foodItemsViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        foodItemsViewPanelLayout.setVerticalGroup(
            foodItemsViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        foodItemBase.setBorder(null);
        foodItemBase.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout myprofileBodyPanelLayout = new javax.swing.GroupLayout(myprofileBodyPanel);
        myprofileBodyPanel.setLayout(myprofileBodyPanelLayout);
        myprofileBodyPanelLayout.setHorizontalGroup(
            myprofileBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ordernow_head_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addComponent(foodItemsViewPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addComponent(foodItemBase)
        );
        myprofileBodyPanelLayout.setVerticalGroup(
            myprofileBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myprofileBodyPanelLayout.createSequentialGroup()
                .addComponent(ordernow_head_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(foodItemsViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(foodItemBase, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(myprofileBodyPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignments_lorem1;
    public static javax.swing.JScrollPane foodItemBase;
    private javax.swing.JPanel foodItemsViewPanel;
    private javax.swing.ButtonGroup foodListButtonGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel myprofileBodyPanel;
    private javax.swing.JLabel myprofile_head_label1;
    private javax.swing.JPanel ordernow_head_panel;
    // End of variables declaration//GEN-END:variables
}
