package app.gui.panels.createdOrders;

import app.models.Constants;
import app.models.CustomTabelUI;
import app.models.order.Order;
import app.models.order.OrderItem;
import app.models.order.OrderStatus;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class createdOrdersAllOrders extends javax.swing.JPanel {

    final HashMap<String, Order> AllOrders;
    final createdOrdersAllOrders base;

    public createdOrdersAllOrders() {
        initComponents();
        base = this;
        AllOrders = Order.Database.getItemHashMap();

        init();
        loadOrderData();
    }

    private void init() {
        int[] columnWidths = {50, 200, 150, 450, 200};
        CustomTabelUI.tabelUI(createdOrdersTabel, columnWidths, Constants.PRIMARY, Constants.PRIMARY_LIGHT_1);
    }

    private void loadOrderData() {
        DefaultTableModel DTM = (DefaultTableModel) getCreatedOrdersTabel().getModel();
        DTM.setRowCount(0);
        int IdIndex = 1;

        for (Map.Entry<String, Order> entry : AllOrders.entrySet()) {
            String key = entry.getKey();
            Order value = entry.getValue();
            Object[] currentObj = {IdIndex, value.getOrderId(), value.getOrderName(), value.getOrderItems(), value.getOrderStatus()};
            DTM.addRow(currentObj);
            customizedTabel(createdOrdersTabel, value.getOrderItems(), IdIndex);
            IdIndex++;
        }

    }

    private void customizedTabel(JTable tb, ArrayList<OrderItem> orderItems, int row) {

        final int LABEL_BASE_HEIGHT = 35;
        final int ROW_COUNT = orderItems.size();
        final String prefix = "";
        final String suffix = " ....";

        tb.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                JPanel base = new JPanel(new GridLayout(0, 1));
                ArrayList<OrderItem> items = (ArrayList<OrderItem>) value;
                for (int i = 0; i < items.size(); i++) {

                    JPanel labelBase = new JPanel(new BorderLayout());
                    labelBase.setBackground(i % 2 == 0 ? Color.WHITE : Constants.LIGHT_GRAY_250);
                    labelBase.setPreferredSize(new Dimension(200, LABEL_BASE_HEIGHT));
                    labelBase.setBorder(new MatteBorder(0, 0, 1, 1, Constants.LIGHT_GRAY_243));

                    String FoodName = items.get(i).getFoodItem().getName().length() > 50 ? items.get(i).getFoodItem().getName().substring(0, 50) + suffix + " x " + items.get(i).getQty() : items.get(i).getFoodItem().getName() + " x " + items.get(i).getQty();
                    JLabel lb = new JLabel(FoodName);
                    lb.setHorizontalAlignment(CENTER);
                    lb.setBorder(new EmptyBorder(0, 10, 0, 10));
                    labelBase.add(lb);
                    base.add(labelBase);
                }

                return base;
            }
        });

        tb.getColumnModel().getColumn(4).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setFont(Constants.PRIMARY_13_BOLD);
                setHorizontalAlignment(CENTER);
                return this;
            }
        });

        tb.setRowHeight((row - 1), (LABEL_BASE_HEIGHT * ROW_COUNT));
    }

    public JTable getCreatedOrdersTabel() {
        return createdOrdersTabel;
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
        myprofile_head_label2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        createdOrdersTabel = new javax.swing.JTable();

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
        myprofile_head_label1.setText("ALL ORDERS");
        myprofile_head_label1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        assignments_lorem1.setFont(new java.awt.Font("Rajdhani Medium", 0, 12)); // NOI18N
        assignments_lorem1.setForeground(new java.awt.Color(102, 102, 102));
        assignments_lorem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_lorem1.setText("<html>   <p style=\"text-align:left\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.   </p> </html> ");
        assignments_lorem1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        myprofile_head_label2.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 18)); // NOI18N
        myprofile_head_label2.setForeground(new java.awt.Color(102, 102, 102));
        myprofile_head_label2.setText("ORDERS /");
        myprofile_head_label2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignments_lorem1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(myprofile_head_label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myprofile_head_label1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myprofile_head_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myprofile_head_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignments_lorem1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
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

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 8));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        createdOrdersTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ORDER ID", "ORDER NAME", "ORDER ITEMS", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        createdOrdersTabel.setEnabled(false);
        createdOrdersTabel.setShowGrid(true);
        jScrollPane1.setViewportView(createdOrdersTabel);
        if (createdOrdersTabel.getColumnModel().getColumnCount() > 0) {
            createdOrdersTabel.getColumnModel().getColumn(0).setResizable(false);
            createdOrdersTabel.getColumnModel().getColumn(1).setResizable(false);
            createdOrdersTabel.getColumnModel().getColumn(2).setResizable(false);
            createdOrdersTabel.getColumnModel().getColumn(3).setResizable(false);
            createdOrdersTabel.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout myprofileBodyPanelLayout = new javax.swing.GroupLayout(myprofileBodyPanel);
        myprofileBodyPanel.setLayout(myprofileBodyPanelLayout);
        myprofileBodyPanelLayout.setHorizontalGroup(
            myprofileBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ordernow_head_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        myprofileBodyPanelLayout.setVerticalGroup(
            myprofileBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myprofileBodyPanelLayout.createSequentialGroup()
                .addComponent(ordernow_head_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
        );

        add(myprofileBodyPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignments_lorem1;
    private javax.swing.JTable createdOrdersTabel;
    private javax.swing.ButtonGroup foodListButtonGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel myprofileBodyPanel;
    private javax.swing.JLabel myprofile_head_label1;
    private javax.swing.JLabel myprofile_head_label2;
    private javax.swing.JPanel ordernow_head_panel;
    // End of variables declaration//GEN-END:variables
}
