
package app.gui.panels.myprofile;

public class myprofileBase extends javax.swing.JPanel {

    /**
     * Creates new form myprofileBase
     */
    public myprofileBase() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myprofileBodyPanel = new javax.swing.JPanel();
        myprofile_head_label1 = new javax.swing.JLabel();
        assignments_lorem1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        myprofile_head_label = new javax.swing.JLabel();
        assignments_lorem = new javax.swing.JLabel();
        assignments_label1 = new javax.swing.JLabel();
        assignments_label3 = new javax.swing.JLabel();
        assignments_label2 = new javax.swing.JLabel();
        assignments_label4 = new javax.swing.JLabel();
        assignments_label5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        myprofileBodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        myprofileBodyPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
        myprofileBodyPanel.setMinimumSize(new java.awt.Dimension(1100, 750));
        myprofileBodyPanel.setPreferredSize(new java.awt.Dimension(1150, 750));

        myprofile_head_label1.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 22)); // NOI18N
        myprofile_head_label1.setForeground(new java.awt.Color(156, 15, 72));
        myprofile_head_label1.setText("MY PROFILE / DASHBOARD");
        myprofile_head_label1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_lorem1.setFont(new java.awt.Font("Rajdhani Medium", 0, 12)); // NOI18N
        assignments_lorem1.setForeground(new java.awt.Color(102, 102, 102));
        assignments_lorem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_lorem1.setText("<html>   <p style=\"text-align:left\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.   </p> </html> ");
        assignments_lorem1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        javax.swing.GroupLayout myprofileBodyPanelLayout = new javax.swing.GroupLayout(myprofileBodyPanel);
        myprofileBodyPanel.setLayout(myprofileBodyPanelLayout);
        myprofileBodyPanelLayout.setHorizontalGroup(
            myprofileBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myprofileBodyPanelLayout.createSequentialGroup()
                .addGroup(myprofileBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myprofile_head_label1)
                    .addComponent(assignments_lorem1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 558, Short.MAX_VALUE))
        );
        myprofileBodyPanelLayout.setVerticalGroup(
            myprofileBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myprofileBodyPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(myprofile_head_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignments_lorem1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(615, Short.MAX_VALUE))
        );

        add(myprofileBodyPanel);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(245, 245, 245)));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 750));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));

        myprofile_head_label.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 22)); // NOI18N
        myprofile_head_label.setForeground(new java.awt.Color(156, 15, 72));
        myprofile_head_label.setText("MY PROFILE");
        myprofile_head_label.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_lorem.setFont(new java.awt.Font("Rajdhani Medium", 0, 12)); // NOI18N
        assignments_lorem.setForeground(new java.awt.Color(102, 102, 102));
        assignments_lorem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_lorem.setText("<html>   <p style=\"text-align:left\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.   </p> </html> ");
        assignments_lorem.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_label1.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label1.setForeground(new java.awt.Color(156, 15, 72));
        assignments_label1.setText("- DASHBOARD");
        assignments_label1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_label3.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label3.setForeground(new java.awt.Color(156, 15, 72));
        assignments_label3.setText("- BASIC DETAILS");
        assignments_label3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_label2.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label2.setForeground(new java.awt.Color(156, 15, 72));
        assignments_label2.setText("- ADDRESS DETAILS");
        assignments_label2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_label4.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label4.setForeground(new java.awt.Color(156, 15, 72));
        assignments_label4.setText("- LOG OUT");
        assignments_label4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_label5.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label5.setForeground(new java.awt.Color(156, 15, 72));
        assignments_label5.setText("- CHANGE PASSWORD");
        assignments_label5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(assignments_lorem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(assignments_label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(assignments_label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(myprofile_head_label)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(assignments_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(assignments_label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(assignments_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(myprofile_head_label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignments_lorem, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignments_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignments_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignments_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignments_label5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignments_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignments_label1;
    private javax.swing.JLabel assignments_label2;
    private javax.swing.JLabel assignments_label3;
    private javax.swing.JLabel assignments_label4;
    private javax.swing.JLabel assignments_label5;
    private javax.swing.JLabel assignments_lorem;
    private javax.swing.JLabel assignments_lorem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel myprofileBodyPanel;
    private javax.swing.JLabel myprofile_head_label;
    private javax.swing.JLabel myprofile_head_label1;
    // End of variables declaration//GEN-END:variables
}