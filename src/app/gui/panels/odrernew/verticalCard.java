package app.gui.panels.odrernew;

import app.gui.frames.User;
import app.models.food.Food;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class verticalCard extends javax.swing.JPanel {

    public verticalCard() {
        initComponents();
    }

    public verticalCard(Food food) {
        initComponents();
        setFoodDetails(food);
        addMouseListener(createMouseListener(food));
    }

    private void setFoodDetails(Food food) {
        // jLabel1.setIcon(new ImageIcon(getClass().getResource("/app/gui/resources/images/beefBurger150.png")));
        product_name.setText(food.getName());
        product_price.setText(String.format("LKR %s .00", String.valueOf(food.getPrice()).split("\\.")[0]));
    }

    private MouseAdapter createMouseListener(Food food) {
        return new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                singleProductView SP = new singleProductView(User.getUserInstance(), true, food);
                SP.setVisible(true);
            }
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageHolderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contetHoderPanel = new javax.swing.JPanel();
        product_name = new javax.swing.JLabel();
        product_description = new javax.swing.JLabel();
        product_price = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 243, 243)));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        imageHolderPanel.setBackground(new java.awt.Color(255, 255, 255));
        imageHolderPanel.setPreferredSize(new java.awt.Dimension(230, 180));
        imageHolderPanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/gui/resources/images/beefBurger150.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 120));
        imageHolderPanel.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(imageHolderPanel);

        contetHoderPanel.setBackground(new java.awt.Color(255, 255, 255));
        contetHoderPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 20, 20));
        contetHoderPanel.setPreferredSize(new java.awt.Dimension(230, 140));

        product_name.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 14)); // NOI18N
        product_name.setForeground(new java.awt.Color(156, 15, 72));
        product_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product_name.setText("BEEF BURGER");
        product_name.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        product_description.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 10)); // NOI18N
        product_description.setForeground(new java.awt.Color(102, 102, 102));
        product_description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product_description.setText("<html>   <p style=\"text-align:center\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit.   Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p> </html> ");
        product_description.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        product_price.setFont(new java.awt.Font("Rajdhani", 1, 16)); // NOI18N
        product_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product_price.setText("LKR 1250 .00");
        product_price.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        javax.swing.GroupLayout contetHoderPanelLayout = new javax.swing.GroupLayout(contetHoderPanel);
        contetHoderPanel.setLayout(contetHoderPanelLayout);
        contetHoderPanelLayout.setHorizontalGroup(
            contetHoderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contetHoderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contetHoderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product_name, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(product_description, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(product_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contetHoderPanelLayout.setVerticalGroup(
            contetHoderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contetHoderPanelLayout.createSequentialGroup()
                .addComponent(product_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(product_description, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(product_price)
                .addGap(0, 0, 0))
        );

        add(contetHoderPanel);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contetHoderPanel;
    private javax.swing.JPanel imageHolderPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel product_description;
    private javax.swing.JLabel product_name;
    private javax.swing.JLabel product_price;
    // End of variables declaration//GEN-END:variables

}
