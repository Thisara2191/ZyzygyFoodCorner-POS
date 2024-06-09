package app.gui.frames;

import app.gui.panels.components.CustomizedJFrame;
import app.gui.panels.createdOrders.createdOrdersBase;
import app.gui.panels.odrernew.orderNewBase;
import app.models.Constants;
import app.models.CustomizedPrimaryButton;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComponent;

public class User extends CustomizedJFrame {

    private static User UserInstance;

    public User() {
        UserInstance = this;
        initComponents();
        setLocationRelativeTo(null);
        bodyRightContentPanel.add(new orderNewBase());
        companyName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                bodyRightContentPanel.removeAll();
                bodyRightContentPanel.add(new createdOrdersBase());
                bodyRightContentPanel.repaint();
                bodyRightContentPanel.revalidate();
            }

        });

        navPanelProcess();
        init();
    }

    @Override
    public final void init() {
        close(closeIcon);
    }

    @Override
    public void close(JComponent CloseIcon) {
        super.close(CloseIcon); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }



    private void navPanelProcess() {
        int yBounds = 0;
        int currentIndex = 0;
        for (String icon : Constants.getIcons()) {
            JButton buttonInstance = CustomizedPrimaryButton.getCustomizedButton("U", currentIndex, new Dimension(50, 50), 0, yBounds, navItemButtonGroup,
                    () -> {
                        bodyRightContentPanel.removeAll();
                        bodyRightContentPanel.add(new orderNewBase());
                        bodyRightContentPanel.repaint();
                        bodyRightContentPanel.revalidate();
                    });
            buttonInstance.setFont(Constants.PRIMARY_13_BOLD);
            yBounds += 50;
            bodyLeftNavigation.add(buttonInstance);
            currentIndex++;
        }

    }

    public static User getUserInstance() {
        return UserInstance;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navItemButtonGroup = new javax.swing.ButtonGroup();
        baseBackground = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        companyName = new javax.swing.JLabel();
        closeIcon = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        bodyLeftNavigation = new javax.swing.JPanel();
        bodyRightContentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        baseBackground.setBackground(new java.awt.Color(255, 255, 255));
        baseBackground.setLayout(new javax.swing.BoxLayout(baseBackground, javax.swing.BoxLayout.PAGE_AXIS));

        headerPanel.setBackground(new java.awt.Color(156, 15, 72));
        headerPanel.setPreferredSize(new java.awt.Dimension(1500, 50));

        companyName.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 14)); // NOI18N
        companyName.setForeground(new java.awt.Color(255, 255, 255));
        companyName.setText("SYSYGY FOOD CORNER");
        companyName.setIconTextGap(10);

        closeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/gui/resources/images/icons8-multiply-20.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(companyName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1298, Short.MAX_VALUE)
                .addComponent(closeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(companyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        baseBackground.add(headerPanel);

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(245, 245, 245)));
        bodyPanel.setPreferredSize(new java.awt.Dimension(1500, 750));
        bodyPanel.setLayout(new javax.swing.BoxLayout(bodyPanel, javax.swing.BoxLayout.LINE_AXIS));

        bodyLeftNavigation.setBackground(new java.awt.Color(255, 255, 255));
        bodyLeftNavigation.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(245, 245, 245)));
        bodyLeftNavigation.setPreferredSize(new java.awt.Dimension(50, 750));

        javax.swing.GroupLayout bodyLeftNavigationLayout = new javax.swing.GroupLayout(bodyLeftNavigation);
        bodyLeftNavigation.setLayout(bodyLeftNavigationLayout);
        bodyLeftNavigationLayout.setHorizontalGroup(
            bodyLeftNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        bodyLeftNavigationLayout.setVerticalGroup(
            bodyLeftNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );

        bodyPanel.add(bodyLeftNavigation);

        bodyRightContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyRightContentPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 0, new java.awt.Color(245, 245, 245)));
        bodyRightContentPanel.setPreferredSize(new java.awt.Dimension(1450, 750));
        bodyRightContentPanel.setLayout(new java.awt.BorderLayout());
        bodyPanel.add(bodyRightContentPanel);

        baseBackground.add(bodyPanel);

        getContentPane().add(baseBackground, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseBackground;
    private javax.swing.JPanel bodyLeftNavigation;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel bodyRightContentPanel;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JLabel companyName;
    private javax.swing.JPanel headerPanel;
    private javax.swing.ButtonGroup navItemButtonGroup;
    // End of variables declaration//GEN-END:variables
}
