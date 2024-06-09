package app.gui.frames;

import app.gui.panels.components.ChangeOrderStatus;
import app.gui.panels.components.MainFrame;
import app.models.OrderServices;
import app.models.order.Order;
import app.models.order.OrderStatus;
import app.models.services.KitchenServices;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class Kitchen extends MainFrame {

    private final KitchenServices services;
    
    public Kitchen() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        this.services = new KitchenServices();
        init();
    }

    @Override
    public final void init() {
        close(closeIcon);
        getServices().createStatusButtonList(OrderStatus.KitchenEnums(), kitchenButtonsPanel, kitchenOrdersTabel);
        getServices().LoadDataTabel(OrderStatus.USER_CREATED, kitchenOrdersTabel);
        openProductViewDialog(kitchenOrdersTabel);
    }

    @Override
    public OrderServices getServices() {
        return services;
    }

    @Override
    public void openProductViewDialog(JTable table) {
        getContentTable().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    String ord_id = getContentTable().getValueAt(getContentTable().getSelectedRow(), 1).toString();
                    new ChangeOrderStatus(Kitchen.this, true, Order.Database.getItemHashMap().get(ord_id)).setVisible(true);
                }
            }

        });
    }

    @Override
    public JTable getContentTable() {
        return kitchenOrdersTabel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        closeIcon = new javax.swing.JLabel();
        companyName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        kitchenHeader = new javax.swing.JLabel();
        kitchenLorem = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        kitchenScrollPane = new javax.swing.JScrollPane();
        kitchenOrdersTabel = new javax.swing.JTable();
        kitchenSeparater = new javax.swing.JSeparator();
        kitchenButtonsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(156, 15, 72));
        jPanel2.setPreferredSize(new java.awt.Dimension(1500, 50));

        closeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/gui/resources/images/icons8-multiply-20.png"))); // NOI18N

        companyName.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 14)); // NOI18N
        companyName.setForeground(new java.awt.Color(255, 255, 255));
        companyName.setText("SYSYGY FOOD CORNER");
        companyName.setIconTextGap(10);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(companyName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1298, Short.MAX_VALUE)
                .addComponent(closeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(companyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(245, 245, 245)));
        jPanel3.setPreferredSize(new java.awt.Dimension(1500, 50));
        jPanel3.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(70, 70, 70, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 700));

        kitchenHeader.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 24)); // NOI18N
        kitchenHeader.setForeground(new java.awt.Color(156, 15, 72));
        kitchenHeader.setText("KITCHEN");
        kitchenHeader.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        kitchenLorem.setFont(new java.awt.Font("Rajdhani Medium", 0, 12)); // NOI18N
        kitchenLorem.setForeground(new java.awt.Color(102, 102, 102));
        kitchenLorem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kitchenLorem.setText("<html>   <p style=\"text-align:left\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod. </p> </html> ");
        kitchenLorem.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        kitchenScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 5));

        kitchenOrdersTabel.setModel(new javax.swing.table.DefaultTableModel(
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
        kitchenOrdersTabel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        kitchenOrdersTabel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        kitchenOrdersTabel.setShowGrid(true);
        kitchenScrollPane.setViewportView(kitchenOrdersTabel);
        if (kitchenOrdersTabel.getColumnModel().getColumnCount() > 0) {
            kitchenOrdersTabel.getColumnModel().getColumn(0).setResizable(false);
            kitchenOrdersTabel.getColumnModel().getColumn(1).setResizable(false);
            kitchenOrdersTabel.getColumnModel().getColumn(2).setResizable(false);
            kitchenOrdersTabel.getColumnModel().getColumn(2).setHeaderValue("ORDER NAME");
            kitchenOrdersTabel.getColumnModel().getColumn(3).setResizable(false);
            kitchenOrdersTabel.getColumnModel().getColumn(3).setHeaderValue("ORDER ITEMS");
            kitchenOrdersTabel.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kitchenScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kitchenScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        kitchenSeparater.setForeground(new java.awt.Color(242, 242, 242));
        kitchenSeparater.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout kitchenButtonsPanelLayout = new javax.swing.GroupLayout(kitchenButtonsPanel);
        kitchenButtonsPanel.setLayout(kitchenButtonsPanelLayout);
        kitchenButtonsPanelLayout.setHorizontalGroup(
            kitchenButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        kitchenButtonsPanelLayout.setVerticalGroup(
            kitchenButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kitchenHeader)
                .addGap(25, 25, 25)
                .addComponent(kitchenSeparater, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kitchenLorem, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kitchenButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kitchenHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(kitchenSeparater, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(kitchenLorem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kitchenButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {kitchenButtonsPanel, kitchenHeader, kitchenLorem, kitchenSeparater});

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeIcon;
    private javax.swing.JLabel companyName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel kitchenButtonsPanel;
    private javax.swing.JLabel kitchenHeader;
    private javax.swing.JLabel kitchenLorem;
    private javax.swing.JTable kitchenOrdersTabel;
    private javax.swing.JScrollPane kitchenScrollPane;
    private javax.swing.JSeparator kitchenSeparater;
    // End of variables declaration//GEN-END:variables

}
