package app.models;

import app.models.order.OrderItem;
import app.gui.panels.components.SingleOrderItem;
import app.gui.panels.odrernew.orderNewBase;
import java.awt.Dimension;
import javax.swing.JPanel;

public class orderNewServices {

    public orderNewBase getParent() {
        return orderNewBase.getBase();
    }

    public void loadOrderItems() {
        int bounds = 0;
        JPanel base = new JPanel();
        base.setBackground(Constants.LIGHT_GRAY_250);
        if (OrderItem.Database.getItemArrayList().isEmpty() || OrderItem.Database.getItemArrayList() == null) {
            base.add(orderNewBase.getBase().getNoItemsorderItemListPanel());
            base.setPreferredSize(new Dimension(199, 200));
        } else {
            for (OrderItem orderItem : OrderItem.Database.getItemArrayList()) {
                SingleOrderItem currentOrder = new SingleOrderItem(orderItem);
                base.add(currentOrder);
                bounds += 150;
            }
            base.setPreferredSize(new Dimension(199, bounds));
        }
        getParent().getOrderItemListPanel().setViewportView(base);
    }

}
