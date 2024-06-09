package app.gui.panels.odrernew;

import app.gui.frames.User;
import app.gui.frames.Kitchen;
import app.models.order.OrderItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public final class orderNewBase extends javax.swing.JPanel {

    private static orderNewBase base;

    public orderNewBase() {
        base = this;
        initComponents();
        orderNewContentPanel.add(new orderItemDashboard());

        orderNewBaseOrderItemsLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                new Kitchen().setVisible(true);
            }

        });
    }

    public static orderNewBase getBase() {
        return base;
    }

    public JScrollPane getOrderItemListPanel() {
        return orderItemListPanel;
    }

    public JPanel getNoItemsorderItemListPanel() {
        return noItemsorderItemListPanel;
    }

    public JPanel getOrderNewContentPanel() {
        return orderNewContentPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foodListButtonGroup = new javax.swing.ButtonGroup();
        orderNewContentPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        orderNewBaseOrderItemsLabel = new javax.swing.JLabel();
        assignments_lorem2 = new javax.swing.JLabel();
        orderItemListPanel = new javax.swing.JScrollPane();
        noItemsorderItemListPanel = new javax.swing.JPanel();
        myprofile_head_label1 = new javax.swing.JLabel();
        assignments_lorem3 = new javax.swing.JLabel();
        orederNewPlaceOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 245, 245));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        orderNewContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        orderNewContentPanel.setMinimumSize(new java.awt.Dimension(1150, 750));
        orderNewContentPanel.setPreferredSize(new java.awt.Dimension(1150, 750));
        orderNewContentPanel.setLayout(new java.awt.BorderLayout());
        add(orderNewContentPanel);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(245, 245, 245)));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 750));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 750));

        orderNewBaseOrderItemsLabel.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 22)); // NOI18N
        orderNewBaseOrderItemsLabel.setForeground(new java.awt.Color(156, 15, 72));
        orderNewBaseOrderItemsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderNewBaseOrderItemsLabel.setText("ORDER ITEMS");
        orderNewBaseOrderItemsLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_lorem2.setFont(new java.awt.Font("Rajdhani Medium", 0, 10)); // NOI18N
        assignments_lorem2.setForeground(new java.awt.Color(102, 102, 102));
        assignments_lorem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_lorem2.setText("<html>   <p style=\"text-align:center\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.  </p> </html> ");
        assignments_lorem2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        orderItemListPanel.setBackground(new java.awt.Color(102, 204, 0));
        orderItemListPanel.setBorder(null);
        orderItemListPanel.setForeground(new java.awt.Color(0, 255, 204));
        orderItemListPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        orderItemListPanel.setOpaque(false);

        noItemsorderItemListPanel.setBackground(new java.awt.Color(250, 250, 250));

        myprofile_head_label1.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 18)); // NOI18N
        myprofile_head_label1.setForeground(new java.awt.Color(204, 204, 204));
        myprofile_head_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myprofile_head_label1.setText("NO ITEMS");
        myprofile_head_label1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_lorem3.setFont(new java.awt.Font("Rajdhani Medium", 0, 10)); // NOI18N
        assignments_lorem3.setForeground(new java.awt.Color(204, 204, 204));
        assignments_lorem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_lorem3.setText("<html>   <p style=\"text-align:center\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.  </p> </html> ");
        assignments_lorem3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        javax.swing.GroupLayout noItemsorderItemListPanelLayout = new javax.swing.GroupLayout(noItemsorderItemListPanel);
        noItemsorderItemListPanel.setLayout(noItemsorderItemListPanelLayout);
        noItemsorderItemListPanelLayout.setHorizontalGroup(
            noItemsorderItemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noItemsorderItemListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myprofile_head_label1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(noItemsorderItemListPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(assignments_lorem3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        noItemsorderItemListPanelLayout.setVerticalGroup(
            noItemsorderItemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noItemsorderItemListPanelLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(myprofile_head_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(assignments_lorem3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        orderItemListPanel.setViewportView(noItemsorderItemListPanel);

        orederNewPlaceOrder.setBackground(new java.awt.Color(156, 15, 72));
        orederNewPlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        orederNewPlaceOrder.setText("PLACE ORDER");
        orederNewPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orederNewPlaceOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderNewBaseOrderItemsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(assignments_lorem2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(orderItemListPanel)
            .addComponent(orederNewPlaceOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(orderNewBaseOrderItemsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignments_lorem2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderItemListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(orederNewPlaceOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void orederNewPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orederNewPlaceOrderActionPerformed
        if (OrderItem.Database.getItemArrayList() == null || OrderItem.Database.getItemArrayList().isEmpty()) {
        } else {
            new placeOrderView(User.getUserInstance(), true).setVisible(true);
        }
    }//GEN-LAST:event_orederNewPlaceOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignments_lorem2;
    private javax.swing.JLabel assignments_lorem3;
    private javax.swing.ButtonGroup foodListButtonGroup;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel myprofile_head_label1;
    private javax.swing.JPanel noItemsorderItemListPanel;
    private javax.swing.JScrollPane orderItemListPanel;
    private javax.swing.JLabel orderNewBaseOrderItemsLabel;
    public javax.swing.JPanel orderNewContentPanel;
    private javax.swing.JButton orederNewPlaceOrder;
    // End of variables declaration//GEN-END:variables

}
