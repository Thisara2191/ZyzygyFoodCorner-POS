package app.gui.panels.createdOrders;

import javax.swing.JPanel;

public final class createdOrdersBase extends javax.swing.JPanel {

    private static createdOrdersBase base;

    public createdOrdersBase() {
        if (base == null) {
            base = this;
        }
        initComponents();
        getCreatedOrdersContentPanel().add(new createdOrdersAllOrders());
    }

    public static createdOrdersBase getBase() {
        return base;
    }

    public JPanel getCreatedOrdersContentPanel() {
        return createdOrdersContentPanel;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foodListButtonGroup = new javax.swing.ButtonGroup();
        createdOrdersContentPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        myprofile_head_label = new javax.swing.JLabel();
        assignments_lorem2 = new javax.swing.JLabel();
        myprofile_head_label1 = new javax.swing.JLabel();
        myprofile_head_label2 = new javax.swing.JLabel();
        myprofile_head_label3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        createdOrdersContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        createdOrdersContentPanel.setMinimumSize(new java.awt.Dimension(1150, 750));
        createdOrdersContentPanel.setPreferredSize(new java.awt.Dimension(1150, 750));
        createdOrdersContentPanel.setLayout(new java.awt.BorderLayout());
        add(createdOrdersContentPanel);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(245, 245, 245)));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 750));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 750));

        myprofile_head_label.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 22)); // NOI18N
        myprofile_head_label.setForeground(new java.awt.Color(156, 15, 72));
        myprofile_head_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myprofile_head_label.setText("ORDERS");
        myprofile_head_label.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_lorem2.setFont(new java.awt.Font("Rajdhani Medium", 0, 12)); // NOI18N
        assignments_lorem2.setForeground(new java.awt.Color(102, 102, 102));
        assignments_lorem2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        assignments_lorem2.setText("<html>   <p style=\"text-align:left\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.  </p> </html> ");
        assignments_lorem2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        myprofile_head_label1.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        myprofile_head_label1.setForeground(new java.awt.Color(156, 15, 72));
        myprofile_head_label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myprofile_head_label1.setText("DASHBOARD");
        myprofile_head_label1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        myprofile_head_label2.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        myprofile_head_label2.setForeground(new java.awt.Color(156, 15, 72));
        myprofile_head_label2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myprofile_head_label2.setText("CURRENT ORDER");
        myprofile_head_label2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        myprofile_head_label3.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        myprofile_head_label3.setForeground(new java.awt.Color(156, 15, 72));
        myprofile_head_label3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myprofile_head_label3.setText("ALL ORDERS");
        myprofile_head_label3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myprofile_head_label, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(assignments_lorem2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(myprofile_head_label1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(myprofile_head_label2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(myprofile_head_label3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(myprofile_head_label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignments_lorem2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(myprofile_head_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(myprofile_head_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(myprofile_head_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignments_lorem2;
    public javax.swing.JPanel createdOrdersContentPanel;
    private javax.swing.ButtonGroup foodListButtonGroup;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel myprofile_head_label;
    private javax.swing.JLabel myprofile_head_label1;
    private javax.swing.JLabel myprofile_head_label2;
    private javax.swing.JLabel myprofile_head_label3;
    // End of variables declaration//GEN-END:variables
}
