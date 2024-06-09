/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package app.gui.panels.odrernew;

import app.gui.panels.components.CustomizedJDialog;
import app.gui.panels.components.CustomizedJFrame;
import app.models.Constants;
import app.models.CustomArrayList;
import app.models.CustomDocumentListener;
import app.models.CustomTabelUI;
import app.models.Methods;
import app.models.order.Order;
import app.models.order.OrderItem;
import app.models.order.OrderStatus;
import app.models.orderNewServices;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class placeOrderView extends CustomizedJDialog {

    private final ArrayList<OrderItem> orderItems;
    private int TotalItemQty = 0;
    private double GrandTotal = 0;
    private final String OrderId;

    public placeOrderView(CustomizedJFrame parent, boolean modal) {
        super(parent, modal);
        orderItems = OrderItem.Database.getItemArrayList();
        OrderId = Methods.generateRandomString(9, "SFC-", "");
        initComponents();
        init();
    }

    private void init() {
        setLocationRelativeTo(null);
        setBounds(getBounds().x + 1, getBounds().y, getBounds().width, getBounds().height);
        povOrderId.setText(getOrderId());

        jScrollPane1.getVerticalScrollBar().setUI(null);

        setupCloseIcon();
        loadOrderItemData();
        addTextFieldListener();
    }

    void addTextFieldListener() {
        povOrderNameTextField.getDocument().addDocumentListener(new CustomDocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                handleTextChange();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                handleTextChange();
            }

            // Custom method to handle text changes
            private void handleTextChange() {
                povPlaceOrder.setEnabled(false);
                if (!povOrderNameTextField.getText().isEmpty()) {
                    povPlaceOrder.setEnabled(true);
                }
            }

        });
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
        int[] columnWidths = {20, 150, 80, 20, 105};
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
        tabelUI(orderItemTable);

        DefaultTableModel DTM = (DefaultTableModel) orderItemTable.getModel();
        DTM.setRowCount(0);

        int IdIndex = 1;

        for (OrderItem orderItem : getOrderItems()) {
            Object[] ob = {IdIndex, orderItem.getFoodItem().getName(), orderItem.getFoodItem().getPrice(), orderItem.getQty(), generateItemPriceTotal(orderItem)};
            DTM.addRow(ob);
            IdIndex++;
            setTotalItemQty(orderItem.getQty());
            setGrandTotal(generateItemPriceTotal(orderItem));
        }
        setQtyAndGrandTotal();

    }

    private void setQtyAndGrandTotal() {
        povSetQty.setText(String.valueOf(getTotalItemQty() < 10 ? "0" + getTotalItemQty() : getTotalItemQty()));
        povSetGrandTotal.setText("LKR " + String.format("%.2f", getGrandTotal()));
    }

    double generateItemPriceTotal(OrderItem item) {
        return item.getQty() * item.getFoodItem().getPrice();
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

    public String getOrderId() {
        return OrderId;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeIcon = new javax.swing.JLabel();
        placeOrderBase = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        povOrderId = new javax.swing.JLabel();
        spvFoodName1 = new javax.swing.JLabel();
        povOrderNameTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        spvFoodName4 = new javax.swing.JLabel();
        myprofile_head_label4 = new javax.swing.JLabel();
        assignments_label3 = new javax.swing.JLabel();
        spvFoodName11 = new javax.swing.JLabel();
        povSetQty = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderItemTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        spvFoodName3 = new javax.swing.JLabel();
        povPlaceOrder = new javax.swing.JButton();
        povSetGrandTotal = new javax.swing.JLabel();
        assignments_label4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeIcon.setBackground(new java.awt.Color(156, 15, 72));
        closeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/gui/resources/images/icons8-multiply-20.png"))); // NOI18N
        closeIcon.setOpaque(true);
        getContentPane().add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 39));

        placeOrderBase.setBackground(new java.awt.Color(255, 255, 255));
        placeOrderBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        placeOrderBase.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));

        jPanel2.setOpaque(false);

        povOrderId.setFont(new java.awt.Font("Rajdhani", 1, 16)); // NOI18N
        povOrderId.setForeground(new java.awt.Color(102, 102, 102));
        povOrderId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        povOrderId.setText("SFC-78945625637");

        spvFoodName1.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        spvFoodName1.setText("ORDER NAME : ");

        povOrderNameTextField.setBackground(new java.awt.Color(245, 245, 245));
        povOrderNameTextField.setFont(new java.awt.Font("Rajdhani", 1, 13)); // NOI18N
        povOrderNameTextField.setForeground(new java.awt.Color(156, 15, 72));
        povOrderNameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 8));
        povOrderNameTextField.setMargin(new java.awt.Insets(2, 0, 2, 0));
        povOrderNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                povOrderNameTextFieldActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(245, 245, 245));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        spvFoodName4.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        spvFoodName4.setText("ORDER TYPE :");

        myprofile_head_label4.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 18)); // NOI18N
        myprofile_head_label4.setForeground(new java.awt.Color(156, 15, 72));
        myprofile_head_label4.setText("PLACE ORDER  -");

        assignments_label3.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label3.setForeground(new java.awt.Color(102, 102, 102));
        assignments_label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_label3.setText("<html>   <p style=\"text-align:start\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit.   Lorem ipsum dolor sit amet, consectetur adipiscing elit.   Lorem ipsum dolor sit amet, consectetur adipiscing elit.   </p> </html> ");

        spvFoodName11.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        spvFoodName11.setText("QTY : ");

        povSetQty.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        povSetQty.setForeground(new java.awt.Color(156, 15, 72));
        povSetQty.setText("05");

        jSeparator5.setForeground(new java.awt.Color(245, 245, 245));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jComboBox1.setBackground(new java.awt.Color(245, 245, 245));
        jComboBox1.setFont(new java.awt.Font("Rajdhani", 1, 13)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(156, 15, 72));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAKE AWAY", "DINE IN" }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 245, 245), 1, true));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(spvFoodName1)
                .addGap(22, 22, 22)
                .addComponent(povOrderNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spvFoodName4)
                .addGap(22, 22, 22)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spvFoodName11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(povSetQty))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(myprofile_head_label4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(povOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(assignments_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 218, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myprofile_head_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(povOrderId))
                .addGap(0, 0, 0)
                .addComponent(assignments_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spvFoodName1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(povOrderNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spvFoodName4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spvFoodName11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(povSetQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 10));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        orderItemTable.setAutoCreateRowSorter(true);
        orderItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "PRICE", "QTY", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderItemTable.setEnabled(false);
        orderItemTable.setShowGrid(true);
        jScrollPane1.setViewportView(orderItemTable);
        if (orderItemTable.getColumnModel().getColumnCount() > 0) {
            orderItemTable.getColumnModel().getColumn(0).setResizable(false);
            orderItemTable.getColumnModel().getColumn(1).setResizable(false);
            orderItemTable.getColumnModel().getColumn(2).setResizable(false);
            orderItemTable.getColumnModel().getColumn(3).setResizable(false);
            orderItemTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel3.setOpaque(false);

        spvFoodName3.setFont(new java.awt.Font("Rajdhani", 1, 14)); // NOI18N
        spvFoodName3.setText("TOTAL");

        povPlaceOrder.setBackground(new java.awt.Color(156, 15, 72));
        povPlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        povPlaceOrder.setText("PLACE ORDER");
        povPlaceOrder.setEnabled(false);
        povPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                povPlaceOrderActionPerformed(evt);
            }
        });

        povSetGrandTotal.setFont(new java.awt.Font("Rajdhani", 1, 16)); // NOI18N
        povSetGrandTotal.setForeground(new java.awt.Color(156, 15, 72));
        povSetGrandTotal.setText("LKR 6850.00");

        assignments_label4.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label4.setForeground(new java.awt.Color(102, 102, 102));
        assignments_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_label4.setText("<html>   <p style=\"text-align:start\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.   </p> </html> ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(povSetGrandTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spvFoodName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                .addComponent(povPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(assignments_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(spvFoodName3)
                        .addGap(1, 1, 1)
                        .addComponent(povSetGrandTotal))
                    .addComponent(povPlaceOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(assignments_label4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        placeOrderBase.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(placeOrderBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void povPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_povPlaceOrderActionPerformed
        Order currentOrder = new Order.Builder(getOrderId(), povOrderNameTextField.getText(), OrderItem.Database.cloneItemList(), new Date(), OrderStatus.USER_CREATED).build();
        Order.Database.getItemHashMap().put(getOrderId(), currentOrder);

        //After that
        
        OrderItem.Database.clearArrayList();
        new orderNewServices().loadOrderItems();
        dispose();

    }//GEN-LAST:event_povPlaceOrderActionPerformed

    private void povOrderNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_povOrderNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_povOrderNameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignments_label3;
    private javax.swing.JLabel assignments_label4;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel myprofile_head_label4;
    private javax.swing.JTable orderItemTable;
    private javax.swing.JPanel placeOrderBase;
    private javax.swing.JLabel povOrderId;
    private javax.swing.JTextField povOrderNameTextField;
    private javax.swing.JButton povPlaceOrder;
    private javax.swing.JLabel povSetGrandTotal;
    private javax.swing.JLabel povSetQty;
    private javax.swing.JLabel spvFoodName1;
    private javax.swing.JLabel spvFoodName11;
    private javax.swing.JLabel spvFoodName3;
    private javax.swing.JLabel spvFoodName4;
    // End of variables declaration//GEN-END:variables
}
