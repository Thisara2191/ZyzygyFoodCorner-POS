
package app.gui.panels.components;

import app.models.order.OrderItem;

public class SingleOrderItem extends javax.swing.JPanel {

    public SingleOrderItem(OrderItem item) {
        initComponents();
        orderItemName.setText("<html><p>"+item.getFoodItem().getName()+"</p></html>");
        orderItemQty.setText(String.valueOf(item.getQty())+" x");
        orderItemTotalPrice.setText("LKR "+String.format("%.2f", (item.getFoodItem().getPrice()*item.getQty())));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderItemName = new javax.swing.JLabel();
        orderItemTotalPrice = new javax.swing.JLabel();
        orderItemQty = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 3, 0, 3));
        setOpaque(false);

        orderItemName.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        orderItemName.setForeground(new java.awt.Color(156, 15, 72));
        orderItemName.setText("<html><p>BEEF BURGER</p></html>");
        orderItemName.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
        orderItemName.setMaximumSize(new java.awt.Dimension(2147483647, 3000));

        orderItemTotalPrice.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        orderItemTotalPrice.setText("LKR 1500.00");
        orderItemTotalPrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 20));

        orderItemQty.setFont(new java.awt.Font("Rajdhani", 1, 13)); // NOI18N
        orderItemQty.setForeground(new java.awt.Color(102, 102, 102));
        orderItemQty.setText("3 x");
        orderItemQty.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(orderItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderItemTotalPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orderItemQty, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(orderItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(orderItemQty)
                .addGap(0, 0, 0)
                .addComponent(orderItemTotalPrice)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel orderItemName;
    private javax.swing.JLabel orderItemQty;
    private javax.swing.JLabel orderItemTotalPrice;
    // End of variables declaration//GEN-END:variables
}
