package app.gui.frames;

import app.gui.panels.components.ChangeOrderStatus;
import app.gui.panels.components.MainFrame;
import app.models.OrderServices;
import app.models.order.Order;
import app.models.order.OrderStatus;
import app.models.services.CashierServices;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class Cashier extends MainFrame {

    private final CashierServices services;

    public Cashier() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        services = new CashierServices();
        init();
    }

    @Override
    public final void init() {
        close(closeIcon);
        getServices().createStatusButtonList(OrderStatus.CashierEnums(), cashierButtonsPanel, cashierOrdersTabel);
        getServices().LoadDataTabel(OrderStatus.KITCHEN_APPROVED, cashierOrdersTabel);
        openProductViewDialog(cashierOrdersTabel);
    }

    @Override
    public void openProductViewDialog(JTable table) {
        getContentTable().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    String ord_id = getContentTable().getValueAt(getContentTable().getSelectedRow(), 1).toString();
                    new ChangeOrderStatus(Cashier.this, true, Order.Database.getItemHashMap().get(ord_id)).setVisible(true);
                }
            }

        });
    }

    @Override
    public OrderServices getServices() {
        return services;
    }

    public Cashier getCashierInstance() {
        return this;
    }

    @Override
    public JTable getContentTable() {
        return this.cashierOrdersTabel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        closeIcon = new javax.swing.JLabel();
        companyName = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cashierOrderItems = new javax.swing.JPanel();
        cashierHeader = new javax.swing.JLabel();
        cashierLorem = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cashierScrollPane = new javax.swing.JScrollPane();
        cashierOrdersTabel = new javax.swing.JTable();
        cashierSeparater = new javax.swing.JSeparator();
        cashierButtonsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(156, 15, 72));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 50));

        closeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/gui/resources/images/icons8-multiply-20.png"))); // NOI18N

        companyName.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 14)); // NOI18N
        companyName.setForeground(new java.awt.Color(255, 255, 255));
        companyName.setText("SYSYGY FOOD CORNER");
        companyName.setIconTextGap(10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(companyName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1298, Short.MAX_VALUE)
                .addComponent(closeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(companyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(1500, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        cashierOrderItems.setBackground(new java.awt.Color(255, 255, 255));
        cashierOrderItems.setBorder(javax.swing.BorderFactory.createEmptyBorder(70, 70, 70, 70));
        cashierOrderItems.setPreferredSize(new java.awt.Dimension(1500, 700));

        cashierHeader.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 24)); // NOI18N
        cashierHeader.setForeground(new java.awt.Color(156, 15, 72));
        cashierHeader.setText("CASHIER");
        cashierHeader.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        cashierLorem.setFont(new java.awt.Font("Rajdhani Medium", 0, 12)); // NOI18N
        cashierLorem.setForeground(new java.awt.Color(102, 102, 102));
        cashierLorem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cashierLorem.setText("<html>   <p style=\"text-align:left\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et. </p> </html> ");
        cashierLorem.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        cashierScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 5));

        cashierOrdersTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "ORDER ID", "ORDER NAME", "ORDER ITEMS", "ORDER STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
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
        cashierOrdersTabel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        cashierOrdersTabel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        cashierOrdersTabel.setShowGrid(true);
        cashierScrollPane.setViewportView(cashierOrdersTabel);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cashierScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(cashierScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
        );

        cashierSeparater.setForeground(new java.awt.Color(242, 242, 242));
        cashierSeparater.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout cashierButtonsPanelLayout = new javax.swing.GroupLayout(cashierButtonsPanel);
        cashierButtonsPanel.setLayout(cashierButtonsPanelLayout);
        cashierButtonsPanelLayout.setHorizontalGroup(
            cashierButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        cashierButtonsPanelLayout.setVerticalGroup(
            cashierButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cashierOrderItemsLayout = new javax.swing.GroupLayout(cashierOrderItems);
        cashierOrderItems.setLayout(cashierOrderItemsLayout);
        cashierOrderItemsLayout.setHorizontalGroup(
            cashierOrderItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashierOrderItemsLayout.createSequentialGroup()
                .addComponent(cashierHeader)
                .addGap(25, 25, 25)
                .addComponent(cashierSeparater, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cashierLorem, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(cashierButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cashierOrderItemsLayout.setVerticalGroup(
            cashierOrderItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashierOrderItemsLayout.createSequentialGroup()
                .addGroup(cashierOrderItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cashierHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashierSeparater)
                    .addComponent(cashierLorem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashierButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(cashierOrderItems, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cashierButtonsPanel;
    private javax.swing.JLabel cashierHeader;
    private javax.swing.JLabel cashierLorem;
    private javax.swing.JPanel cashierOrderItems;
    private javax.swing.JTable cashierOrdersTabel;
    private javax.swing.JScrollPane cashierScrollPane;
    private javax.swing.JSeparator cashierSeparater;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JLabel companyName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

}
