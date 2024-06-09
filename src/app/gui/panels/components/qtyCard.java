package app.gui.panels.components;

import app.gui.panels.odrernew.singleProductView;
import app.models.SingleProductViewServices;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class qtyCard extends javax.swing.JPanel {

    private final int MAX_QTY = 20;
    private int SELECTED_QTY = 1;
    private final singleProductView singleProductView;
    private final SingleProductViewServices services;

    public qtyCard(singleProductView spv) {

        initComponents();
        this.singleProductView = spv;
        this.services = singleProductView.services;
        qtyText.setText(getQtyText(SELECTED_QTY));

        updateQty();
    }

    public int getMaxQty() {
        return MAX_QTY;
    }

    public int getSelectedQty() {
        return SELECTED_QTY;
    }

    private String getQtyText(int SelectedQty) {
        if (SelectedQty < 10) {
            return "0" + SelectedQty;
        } else {
            return String.valueOf(SelectedQty);
        }
    }

    private void updateQty() {

        plusIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SELECTED_QTY == MAX_QTY) {

                } else {
                    SELECTED_QTY++;
                    qtyText.setText(getQtyText(SELECTED_QTY));
                    services.updateAndDisplayTotalPrice();
                }

            }
        });

        minusIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SELECTED_QTY == 1) {

                } else {
                    SELECTED_QTY--;
                    qtyText.setText(getQtyText(SELECTED_QTY));
                    services.updateAndDisplayTotalPrice();
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectQtyBase = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        qtyText = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        minusIcon = new javax.swing.JLabel();
        plusIcon = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        selectQtyBase.setBackground(new java.awt.Color(255, 255, 255));
        selectQtyBase.setPreferredSize(new java.awt.Dimension(412, 50));
        selectQtyBase.setLayout(new javax.swing.BoxLayout(selectQtyBase, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(243, 243, 243)));
        jPanel3.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.setLayout(new java.awt.BorderLayout());

        qtyText.setEditable(false);
        qtyText.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 18)); // NOI18N
        qtyText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qtyText.setText("01");
        qtyText.setToolTipText("");
        qtyText.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel3.add(qtyText, java.awt.BorderLayout.CENTER);

        selectQtyBase.add(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(30, 50));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel6.setPreferredSize(new java.awt.Dimension(30, 25));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        minusIcon.setBackground(new java.awt.Color(255, 255, 255));
        minusIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minusIcon.setText("-");
        minusIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 243, 243)));
        minusIcon.setOpaque(true);
        minusIcon.setPreferredSize(new java.awt.Dimension(30, 25));
        jPanel5.add(minusIcon, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        plusIcon.setBackground(new java.awt.Color(255, 255, 255));
        plusIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plusIcon.setText("+");
        plusIcon.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(243, 243, 243)));
        plusIcon.setOpaque(true);
        plusIcon.setPreferredSize(new java.awt.Dimension(30, 25));
        jPanel6.add(plusIcon, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6);

        selectQtyBase.add(jPanel4);

        add(selectQtyBase, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel minusIcon;
    private javax.swing.JLabel plusIcon;
    private javax.swing.JTextField qtyText;
    private javax.swing.JPanel selectQtyBase;
    // End of variables declaration//GEN-END:variables
}
