package app.gui.panels.odrernew;

import app.models.Constants;
import app.models.SingleProductViewServices;
import app.models.food.AddToppingsExpression;
import app.models.food.Expression;
import app.models.food.Food;
import app.models.food.Toppings;

/**
 *
 * @author Titu
 */
public class toppingItems extends javax.swing.JPanel {

    int PressCount = 1;
    private final String Title;
    private Toppings ToppingItem;
    private singleProductView SPV;
    private SingleProductViewServices productViewServices;
    private Food Food;
    private Expression addToppingCommandExpression;

    public toppingItems() {
        initComponents();
        Title = jButton1.getText();
    }

    public toppingItems(Toppings ToppingItem, singleProductView spv) {
        initComponents();
        this.ToppingItem = ToppingItem;
        this.SPV = spv;
        this.productViewServices = SPV.services;
        Title = ToppingItem.getName();
        jButton1.setText(Title);
        this.addToppingCommandExpression = new AddToppingsExpression(ToppingItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 245, 245));
        setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Rajdhani SemiBold", 0, 12)); // NOI18N
        jButton1.setText("BBQ SAUCE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setBackground(Constants.PRIMARY_LIGHT_1);
        jButton1.setText(Title + " x " + PressCount);

        Food = addToppingCommandExpression.interpret(SPV.getFood());
        SPV.setFood(Food);

        System.out.println("Unit Total Price : " + SPV.getFood().getPrice());

        productViewServices.addToppingTotheList(ToppingItem);
        productViewServices.updateAndDisplayTotalPrice();

        PressCount++;
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}