/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app.gui.panels.odrernew;

import app.gui.frames.User;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Titu
 */
public class productCard extends javax.swing.JPanel {

    /**
     * Creates new form productCard
     */
    public productCard() {
        initComponents();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                singleProductView SP = new singleProductView(User.getUserInstance(),true,null);
                SP.setVisible(true);
            }

        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        assignments_label1 = new javax.swing.JLabel();
        assignments_label3 = new javax.swing.JLabel();
        assignments_label2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 236, 236)));
        setPreferredSize(new java.awt.Dimension(300, 400));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 200));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/gui/resources/images/beefBurger200.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(350, 220));
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 30, 40, 30));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 170));

        assignments_label1.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 14)); // NOI18N
        assignments_label1.setForeground(new java.awt.Color(156, 15, 72));
        assignments_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_label1.setText("<html><p>DOUBLE PATTY BEEF BURGER</p></html>");
        assignments_label1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_label3.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 10)); // NOI18N
        assignments_label3.setForeground(new java.awt.Color(102, 102, 102));
        assignments_label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_label3.setText("<html>   <p style=\"text-align:center\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit.   Lorem ipsum dolor sit amet, consectetur adipiscing elit.   Lorem ipsum dolor sit amet, consectetur adipiscing elit.   </p> </html> ");
        assignments_label3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));

        assignments_label2.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 18)); // NOI18N
        assignments_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_label2.setText("<html><p>LKR 1250 .00</p></html>");
        assignments_label2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(assignments_label1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignments_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(assignments_label2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(assignments_label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(assignments_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(assignments_label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignments_label1;
    private javax.swing.JLabel assignments_label2;
    private javax.swing.JLabel assignments_label3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}