/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package app.gui.panels.odrernew;

import app.gui.panels.components.CustomizedJDialog;
import app.gui.panels.components.CustomizedJFrame;
import app.gui.panels.components.qtyCard;
import app.models.CustomArrayList;
import app.models.order.OrderItem;
import app.models.SingleProductViewServices;
import app.models.database.Database;
import app.models.food.Food;
import app.models.food.Toppings;
import app.models.orderNewServices;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JPanel;

public class singleProductView extends CustomizedJDialog {

    private qtyCard QtyCard;
    private final Food CurrentFood;
    private Food FoodClone;
    private final ArrayList<Toppings> toppingList;

    public final SingleProductViewServices services;

    public singleProductView(CustomizedJFrame parent, boolean modal, Food food) {
        super(parent, modal);
        this.CurrentFood = food;
        this.FoodClone = food.getClone();

        toppingList = new ArrayList<>();
        toppingList.clear();

        //Services
        services = new SingleProductViewServices(this);

        initComponents();
        init();
    }

    private void init() {
        setLocationRelativeTo(null);

        //Load Methods
        loadProductDetails();
        loadToppingItems();
        loadQtyCard();
        clearToppings();
        setupCloseIcon();

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

    //Load Product Details
    private void loadProductDetails() {
        spvFoodName.setText(CurrentFood.getName());
        spvFoodPrice.setText(services.getPriceAsString(CurrentFood.getPrice(), "LKR "));
        spvBasicTotal.setText(services.getPriceAsString(CurrentFood.getPrice(), ""));
        spvGrandTotal.setText(services.getPriceAsString(CurrentFood.getPrice(), "LKR "));
    }

    //Load Qty Card
    private void loadQtyCard() {
        QtyCard = new qtyCard(this);
        sfcQtyBase.add(QtyCard);
    }

    //Load Topping Items
    private void loadToppingItems() {
        toppingsBasePanel.removeAll();
        toppingsBasePanel.repaint();
        toppingsBasePanel.revalidate();

        int i_bounds = 0;
        int j_bounds = 0;
        int rows = 2;

        int toppingId = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 5; j++) {
                JPanel JP = new toppingItems(Database.PredefinedData.getToppingsList().get(toppingId), this);
                JP.setPreferredSize(new Dimension(125, 40));
                JP.setBounds(j_bounds, i_bounds, 125, 40);
                j_bounds += 140;
                toppingId++;
                toppingsBasePanel.add(JP);
            }
            j_bounds = 0;
            i_bounds += 55;
        }

        toppingsBasePanel.setPreferredSize(new Dimension(686, 55 * rows - 10));

    }

    //Clear Topping Items
    public void clearToppings() {
        toppingsClearAll.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadToppingItems();
                setFood(CurrentFood.getClone());
                toppingList.clear();
                services.updateAndDisplayTotalPrice();

            }
        });
    }

    public ArrayList<Toppings> getToppingList() {
        return toppingList;
    }

    public qtyCard getQtyCard() {
        return QtyCard;
    }

    public Food getFood() {
        return FoodClone;
    }

    public void setFood(Food Food) {
        this.FoodClone = Food;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        spvFoodName = new javax.swing.JLabel();
        assignments_label3 = new javax.swing.JLabel();
        spvFoodPrice = new javax.swing.JLabel();
        assignments_label4 = new javax.swing.JLabel();
        assignments_label5 = new javax.swing.JLabel();
        spvFoodMaxQty = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        sfcQtyBase = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        myprofile_head_label2 = new javax.swing.JLabel();
        assignments_label7 = new javax.swing.JLabel();
        toppingsBasePanel = new javax.swing.JPanel();
        toppingsClearAll = new javax.swing.JLabel();
        assignments_label8 = new javax.swing.JLabel();
        closeIcon = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        myprofile_head_label4 = new javax.swing.JLabel();
        myprofile_head_label5 = new javax.swing.JLabel();
        assignments_label9 = new javax.swing.JLabel();
        myprofile_head_label6 = new javax.swing.JLabel();
        spvBasicTotal = new javax.swing.JLabel();
        spvToppingsTotal = new javax.swing.JLabel();
        myprofile_head_label9 = new javax.swing.JLabel();
        spvTotalQty = new javax.swing.JLabel();
        spvGrandTotal = new javax.swing.JLabel();
        myprofile_head_label12 = new javax.swing.JLabel();
        assignments_label10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        jPanel11.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/gui/resources/images/beefBurger200.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(242, 242, 242)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 245, 256));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        spvFoodName.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 18)); // NOI18N
        spvFoodName.setForeground(new java.awt.Color(156, 15, 72));
        spvFoodName.setText("<html><p>DOUBLE PATTY BEEF BURGER</p></html>");

        assignments_label3.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label3.setForeground(new java.awt.Color(102, 102, 102));
        assignments_label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignments_label3.setText("<html>   <p style=\"text-align:start\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit.   Lorem ipsum dolor sit amet, consectetur adipiscing elit.   Lorem ipsum dolor sit amet, consectetur adipiscing elit.   </p> </html> ");

        spvFoodPrice.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 18)); // NOI18N
        spvFoodPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        spvFoodPrice.setText("<html><p>LKR 1250 .00</p></html>");

        assignments_label4.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label4.setForeground(new java.awt.Color(102, 102, 102));
        assignments_label4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        assignments_label4.setText("<html>   <p style=\"text-align:start\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit</p> </html> ");

        assignments_label5.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label5.setForeground(new java.awt.Color(102, 102, 102));
        assignments_label5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        assignments_label5.setText("MAX");

        spvFoodMaxQty.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 20)); // NOI18N
        spvFoodMaxQty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        spvFoodMaxQty.setText("20");

        jSeparator1.setForeground(new java.awt.Color(242, 242, 242));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        sfcQtyBase.setPreferredSize(new java.awt.Dimension(80, 50));
        sfcQtyBase.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(spvFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sfcQtyBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assignments_label5)
                            .addComponent(spvFoodMaxQty)))
                    .addComponent(assignments_label4, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(assignments_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spvFoodPrice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(spvFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignments_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spvFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignments_label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(assignments_label5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(spvFoodMaxQty, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(sfcQtyBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 50, 409, 260));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jSeparator2.setForeground(new java.awt.Color(242, 242, 242));
        jPanel7.add(jSeparator2, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 0, 0, 0));
        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setOpaque(false);

        myprofile_head_label2.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 18)); // NOI18N
        myprofile_head_label2.setForeground(new java.awt.Color(156, 15, 72));
        myprofile_head_label2.setText("TOPPINGS");
        myprofile_head_label2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(242, 242, 242)));

        assignments_label7.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label7.setForeground(new java.awt.Color(102, 102, 102));
        assignments_label7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        assignments_label7.setText("<html>   <p style=\"text-align:left\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt.  </p> </html> ");

        toppingsBasePanel.setBackground(new java.awt.Color(255, 255, 255));
        toppingsBasePanel.setOpaque(false);

        javax.swing.GroupLayout toppingsBasePanelLayout = new javax.swing.GroupLayout(toppingsBasePanel);
        toppingsBasePanel.setLayout(toppingsBasePanelLayout);
        toppingsBasePanelLayout.setHorizontalGroup(
            toppingsBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        toppingsBasePanelLayout.setVerticalGroup(
            toppingsBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        toppingsClearAll.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        toppingsClearAll.setForeground(new java.awt.Color(156, 15, 72));
        toppingsClearAll.setText("CLEAR ALL");
        toppingsClearAll.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(242, 242, 242)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toppingsBasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(myprofile_head_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(assignments_label7, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toppingsClearAll)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(assignments_label7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toppingsClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(myprofile_head_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(toppingsBasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 331, 698, -1));

        assignments_label8.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label8.setForeground(new java.awt.Color(102, 102, 102));
        assignments_label8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        assignments_label8.setText("<html>   <p style=\"text-align:left\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt.  </p> </html> ");
        jPanel1.add(assignments_label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 530, 503, 20));

        closeIcon.setBackground(new java.awt.Color(156, 15, 72));
        closeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/gui/resources/images/icons8-multiply-20.png"))); // NOI18N
        closeIcon.setOpaque(true);
        jPanel1.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 47, 39));

        jPanel11.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel11);

        jPanel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 600));

        myprofile_head_label4.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 18)); // NOI18N
        myprofile_head_label4.setForeground(new java.awt.Color(156, 15, 72));
        myprofile_head_label4.setText("GENERATE TOTAL");
        myprofile_head_label4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(242, 242, 242)));

        myprofile_head_label5.setFont(new java.awt.Font("Rajdhani", 1, 13)); // NOI18N
        myprofile_head_label5.setForeground(new java.awt.Color(102, 102, 102));
        myprofile_head_label5.setText("BASIC");
        myprofile_head_label5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(242, 242, 242)));

        assignments_label9.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label9.setForeground(new java.awt.Color(102, 102, 102));
        assignments_label9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        assignments_label9.setText("<html>   <p style=\"text-align:left\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt.  </p> </html> ");

        myprofile_head_label6.setFont(new java.awt.Font("Rajdhani", 1, 13)); // NOI18N
        myprofile_head_label6.setForeground(new java.awt.Color(102, 102, 102));
        myprofile_head_label6.setText("TOPPINGS");
        myprofile_head_label6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(242, 242, 242)));

        spvBasicTotal.setFont(new java.awt.Font("Rajdhani", 1, 13)); // NOI18N
        spvBasicTotal.setForeground(new java.awt.Color(102, 102, 102));
        spvBasicTotal.setText("  1250.00");
        spvBasicTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(242, 242, 242)));

        spvToppingsTotal.setFont(new java.awt.Font("Rajdhani", 1, 13)); // NOI18N
        spvToppingsTotal.setForeground(new java.awt.Color(102, 102, 102));
        spvToppingsTotal.setText("  0.00");
        spvToppingsTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(242, 242, 242)));

        myprofile_head_label9.setFont(new java.awt.Font("Rajdhani", 1, 13)); // NOI18N
        myprofile_head_label9.setForeground(new java.awt.Color(102, 102, 102));
        myprofile_head_label9.setText("TOTAL QTY ");
        myprofile_head_label9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(242, 242, 242)));

        spvTotalQty.setFont(new java.awt.Font("Rajdhani", 1, 13)); // NOI18N
        spvTotalQty.setForeground(new java.awt.Color(102, 102, 102));
        spvTotalQty.setText("1");
        spvTotalQty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(242, 242, 242)));

        spvGrandTotal.setFont(new java.awt.Font("Rajdhani", 1, 24)); // NOI18N
        spvGrandTotal.setForeground(new java.awt.Color(156, 15, 72));
        spvGrandTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        spvGrandTotal.setText("LKR  1250 .00");
        spvGrandTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(242, 242, 242)));

        myprofile_head_label12.setFont(new java.awt.Font("Rajdhani", 1, 13)); // NOI18N
        myprofile_head_label12.setForeground(new java.awt.Color(102, 102, 102));
        myprofile_head_label12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        myprofile_head_label12.setText("GRAND TOTAL");
        myprofile_head_label12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(242, 242, 242)));

        assignments_label10.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        assignments_label10.setForeground(new java.awt.Color(102, 102, 102));
        assignments_label10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        assignments_label10.setText("<html>   <p style=\"text-align:center\">     Lorem ipsum dolor sit amet, consectetur adipiscing elit.  </p> </html> ");

        jButton1.setBackground(new java.awt.Color(156, 15, 72));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD ITEM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(assignments_label9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(assignments_label10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myprofile_head_label12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(myprofile_head_label6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spvToppingsTotal))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(myprofile_head_label5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spvBasicTotal))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(myprofile_head_label9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spvTotalQty))
                    .addComponent(spvGrandTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(myprofile_head_label4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(myprofile_head_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(assignments_label9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myprofile_head_label9)
                    .addComponent(spvTotalQty))
                .addGap(6, 6, 6)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myprofile_head_label5)
                    .addComponent(spvBasicTotal))
                .addGap(6, 6, 6)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myprofile_head_label6)
                    .addComponent(spvToppingsTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(myprofile_head_label12)
                .addGap(0, 0, 0)
                .addComponent(spvGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(assignments_label10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        OrderItem CurrentOrderItem = new OrderItem.Builder(getFood(), getQtyCard().getSelectedQty(), new Date()).build();
        OrderItem.Database.getItemArrayList().addItem(CurrentOrderItem, new CustomArrayList.Callback() {
            @Override
            public void onComplete() {
                new orderNewServices().loadOrderItems();
                dispose();
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignments_label10;
    private javax.swing.JLabel assignments_label3;
    private javax.swing.JLabel assignments_label4;
    private javax.swing.JLabel assignments_label5;
    private javax.swing.JLabel assignments_label7;
    private javax.swing.JLabel assignments_label8;
    private javax.swing.JLabel assignments_label9;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel myprofile_head_label12;
    private javax.swing.JLabel myprofile_head_label2;
    private javax.swing.JLabel myprofile_head_label4;
    private javax.swing.JLabel myprofile_head_label5;
    private javax.swing.JLabel myprofile_head_label6;
    private javax.swing.JLabel myprofile_head_label9;
    private javax.swing.JPanel sfcQtyBase;
    public javax.swing.JLabel spvBasicTotal;
    private javax.swing.JLabel spvFoodMaxQty;
    private javax.swing.JLabel spvFoodName;
    private javax.swing.JLabel spvFoodPrice;
    public javax.swing.JLabel spvGrandTotal;
    public javax.swing.JLabel spvToppingsTotal;
    public javax.swing.JLabel spvTotalQty;
    private javax.swing.JPanel toppingsBasePanel;
    private javax.swing.JLabel toppingsClearAll;
    // End of variables declaration//GEN-END:variables
}
