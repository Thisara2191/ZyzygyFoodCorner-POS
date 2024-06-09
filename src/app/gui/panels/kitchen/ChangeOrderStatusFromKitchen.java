
package app.gui.panels.kitchen;

import app.gui.frames.Kitchen;
import app.gui.panels.components.CustomizedJDialog;
import app.models.Constants;
import app.models.CustomHandlers;
import app.models.CustomTabelUI;
import app.models.order.Order;
import app.models.order.OrderItem;
import app.models.order.OrderStatus;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ChangeOrderStatusFromKitchen extends CustomizedJDialog {

    private final Order CurrentOrder;
    private final ArrayList<OrderItem> orderItems;
    private int TotalItemQty = 0;
    private double GrandTotal = 0;
    private final OrderStatus CurrentOrderStatus;
    private final Kitchen Parent;

    public ChangeOrderStatusFromKitchen(Kitchen parent, boolean modal, Order order) {
        super(parent, modal);
        this.Parent = parent;
        this.CurrentOrder = order;
        orderItems = order.getOrderItems();
        CurrentOrderStatus = order.getOrderStatus();
        initComponents();
        init();
    }

    private void init() {
        setLocationRelativeTo(null);
        jScrollPane1.getVerticalScrollBar().setUI(null);
        setupCloseIcon();
        loadOrderItemData();
    }


    //Close Icon Process
    private void setupCloseIcon() {
        closeIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
    }

    private void tabelUI(JTable tb) {
        int[] columnWidths = {80, 860, 80};
        CustomTabelUI.tabelUI(tb, columnWidths, Constants.PRIMARY, Constants.PRIMARY_LIGHT_1);
        setColumPropreties(tb.getColumnModel());
    }

    private void setColumPropreties(TableColumnModel columnModel) {
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            int currentIndex = i;
            columnModel.getColumn(i).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    setBorder(new EmptyBorder(0, 15, 0, 15));
                    setHorizontalAlignment(CENTER);
                    if (currentIndex == 4) {
                        setFont(Constants.PRIMARY_13_BOLD);
                    }
                    return this;
                }

            });
        }

    }

    private void loadOrderItemData() {
        tabelUI(orderItemTableFromKitchen);

        DefaultTableModel DTM = (DefaultTableModel) orderItemTableFromKitchen.getModel();
        DTM.setRowCount(0);

        int IdIndex = 1;

        for (OrderItem orderItem : getOrderItems()) {
            Object[] ob = {IdIndex, orderItem.getFoodItem().getName(), orderItem.getQty()};
            DTM.addRow(ob);
            IdIndex++;
            setTotalItemQty(orderItem.getQty());
            setGrandTotal(generateItemPriceTotal(orderItem));
        }
        setDataToTheLabels();

    }

    private void setDataToTheLabels() {
        cosOrderId.setText(CurrentOrder.getOrderId());
        cosOrderName.setText(CurrentOrder.getOrderName());
        cosSetQty.setText(String.valueOf(getTotalItemQty() < 10 ? "0" + getTotalItemQty() : getTotalItemQty()));
        cosGrandTotal.setText("LKR " + String.format("%.2f", getGrandTotal()));
    }

    double generateItemPriceTotal(OrderItem item) {
        return item.getQty() * item.getFoodItem().getPrice();
    }

    //Getters & Setters
    @Override
    public Kitchen getParent() {
        return Parent;
    }

    public Order getCurrentOrder() {
        return CurrentOrder;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public int getTotalItemQty() {
        return TotalItemQty;
    }

    public double getGrandTotal() {
        return GrandTotal;
    }

    public void setGrandTotal(double GrandTotal) {
        this.GrandTotal = this.GrandTotal + GrandTotal;
    }

    public void setTotalItemQty(int TotalItemQty) {
        this.TotalItemQty = this.TotalItemQty + TotalItemQty;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeIcon = new javax.swing.JLabel();
        ApproveDeclineOrder = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        spvFoodName1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        spvFoodName4 = new javax.swing.JLabel();
        myprofile_head_label4 = new javax.swing.JLabel();
        assignments_label3 = new javax.swing.JLabel();
        spvFoodName11 = new javax.swing.JLabel();
        cosSetQty = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        spvFoodName5 = new javax.swing.JLabel();
        cosOrderType = new javax.swing.JLabel();
        cosOrderId = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        cosOrderName = new javax.swing.JLabel();
        spvFoodName12 = new javax.swing.JLabel();
        cosGrandTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderItemTableFromKitchen = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        assignments_label4 = new javax.swing.JLabel();
        declineOrder = new javax.swing.JButton();
        approveOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeIcon.setBackground(new java.awt.Color(156, 15, 72));
        closeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/gui/resources/images/icons8-multiply-20.png"))); // NOI18N
        closeIcon.setOpaque(true);
        getContentPane().add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 40, 39));

        ApproveDeclineOrder.setBackground(new java.awt.Color(255, 255, 255));
        ApproveDeclineOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        ApproveDeclineOrder.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));

        jPanel2.setOpaque(false);

        spvFoodName1.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        spvFoodName1.setText("ORDER ID : ");

        jSeparator2.setForeground(new java.awt.Color(245, 245, 245));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        spvFoodName4.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        spvFoodName4.setText("ORDER TYPE :");

        myprofile_head_label4.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 18)); // NOI18N
        myprofile_head_label4.setForeground(new java.awt.Color(156, 15, 72));
        myprofile_head_label4.setText("CHANGE ORDER STATUS");

        assignments_label3.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label3.setForeground(new java.awt.Color(102, 102, 102));
        assignments_label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_label3.setText("<html>   <p style=\"text-align:start\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit.   Lorem ipsum dolor sit amet, consectetur adipiscing elit.   Lorem ipsum dolor sit amet, consectetur adipiscing elit.   </p> </html> ");

        spvFoodName11.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        spvFoodName11.setText("QTY : ");

        cosSetQty.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        cosSetQty.setForeground(new java.awt.Color(156, 15, 72));
        cosSetQty.setText("05");

        jSeparator5.setForeground(new java.awt.Color(245, 245, 245));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        spvFoodName5.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        spvFoodName5.setText("ORDER NAME : ");

        cosOrderType.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        cosOrderType.setForeground(new java.awt.Color(156, 15, 72));
        cosOrderType.setText("TAKE AWAY");

        cosOrderId.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        cosOrderId.setForeground(new java.awt.Color(156, 15, 72));
        cosOrderId.setText("SFC-78945625637");

        jSeparator6.setForeground(new java.awt.Color(245, 245, 245));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cosOrderName.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        cosOrderName.setForeground(new java.awt.Color(156, 15, 72));
        cosOrderName.setText("THISARA PRAVEEN");

        spvFoodName12.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        spvFoodName12.setText("GRAND TOTAL : ");

        cosGrandTotal.setFont(new java.awt.Font("Rajdhani", 1, 16)); // NOI18N
        cosGrandTotal.setForeground(new java.awt.Color(156, 15, 72));
        cosGrandTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cosGrandTotal.setText("LKR 6850.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myprofile_head_label4)
                    .addComponent(assignments_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(spvFoodName1)
                .addGap(18, 18, 18)
                .addComponent(cosOrderId)
                .addGap(33, 33, 33)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spvFoodName5)
                .addGap(18, 18, 18)
                .addComponent(cosOrderName)
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spvFoodName4)
                .addGap(18, 18, 18)
                .addComponent(cosOrderType)
                .addGap(33, 33, 33)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spvFoodName11)
                .addGap(18, 18, 18)
                .addComponent(cosSetQty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(spvFoodName12)
                .addGap(18, 18, 18)
                .addComponent(cosGrandTotal))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(myprofile_head_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(assignments_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spvFoodName1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spvFoodName5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cosOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cosOrderName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spvFoodName11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cosSetQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spvFoodName4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cosOrderType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spvFoodName12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cosGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        orderItemTableFromKitchen.setAutoCreateRowSorter(true);
        orderItemTableFromKitchen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "QTY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderItemTableFromKitchen.setEnabled(false);
        orderItemTableFromKitchen.setShowGrid(true);
        jScrollPane1.setViewportView(orderItemTableFromKitchen);
        if (orderItemTableFromKitchen.getColumnModel().getColumnCount() > 0) {
            orderItemTableFromKitchen.getColumnModel().getColumn(0).setResizable(false);
            orderItemTableFromKitchen.getColumnModel().getColumn(1).setResizable(false);
            orderItemTableFromKitchen.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel3.setOpaque(false);

        assignments_label4.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label4.setForeground(new java.awt.Color(102, 102, 102));
        assignments_label4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        assignments_label4.setText("<html>   <p style=\"text-align:start\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.   </p> </html> ");

        declineOrder.setForeground(new java.awt.Color(156, 15, 72));
        declineOrder.setText("DECLINED");
        declineOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineOrderActionPerformed(evt);
            }
        });

        approveOrder.setBackground(new java.awt.Color(156, 15, 72));
        approveOrder.setForeground(new java.awt.Color(255, 255, 255));
        approveOrder.setText("APPROVE");
        approveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(assignments_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(declineOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(approveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {approveOrder, declineOrder});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(approveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(declineOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(assignments_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ApproveDeclineOrder.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(ApproveDeclineOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void approveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveOrderActionPerformed
        CurrentOrder.setOrderStatus(OrderStatus.KITCHEN_APPROVED);
//        getParent().getServices().loadOrderData(CurrentOrderStatus,getParent().getKitchenOrdersTabel());
        dispose();

    }//GEN-LAST:event_approveOrderActionPerformed

    private void declineOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineOrderActionPerformed
        CurrentOrder.setOrderStatus(OrderStatus.KITCHEN_DECLINED);
//        getParent().getServices().loadOrderData(CurrentOrderStatus,getParent().getKitchenOrdersTabel());
        dispose();

    }//GEN-LAST:event_declineOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ApproveDeclineOrder;
    private javax.swing.JButton approveOrder;
    private javax.swing.JLabel assignments_label3;
    private javax.swing.JLabel assignments_label4;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JLabel cosGrandTotal;
    private javax.swing.JLabel cosOrderId;
    private javax.swing.JLabel cosOrderName;
    private javax.swing.JLabel cosOrderType;
    private javax.swing.JLabel cosSetQty;
    private javax.swing.JButton declineOrder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel myprofile_head_label4;
    private javax.swing.JTable orderItemTableFromKitchen;
    private javax.swing.JLabel spvFoodName1;
    private javax.swing.JLabel spvFoodName11;
    private javax.swing.JLabel spvFoodName12;
    private javax.swing.JLabel spvFoodName4;
    private javax.swing.JLabel spvFoodName5;
    // End of variables declaration//GEN-END:variables
}
