package app.models.services;


import app.models.OrderServices;
import app.models.order.OrderStatus;
import javax.swing.JPanel;
import javax.swing.JTable;

public class DeliveryServices extends OrderServices{

    @Override
    public void LoadDataTabel(OrderStatus status, JTable tb) {
        super.LoadDataTabel(status, tb);
    }

    @Override
    public void createStatusButtonList(Object[] statusList, JPanel buttonsBasePanel, JTable tb) {
        super.createStatusButtonList(statusList, buttonsBasePanel, tb); 
    }

    @Override
    public void loadOrderData(OrderStatus status, JTable tb) {
        super.loadOrderData(status, tb); 
    }

}
