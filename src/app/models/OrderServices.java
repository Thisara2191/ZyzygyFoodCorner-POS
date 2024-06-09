package app.models;

import app.models.order.Order;
import app.models.order.OrderItem;
import app.models.order.OrderStatus;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class OrderServices {

    public void LoadDataTabel(OrderStatus status, JTable tb) {
        int[] columnWidths = {70, 250, 200, (1346 - 770), 250};
        CustomTabelUI.tabelUI(tb, columnWidths, Constants.PRIMARY, Constants.PRIMARY_LIGHT_2);
        loadOrderData(status, tb);
    }

    public void loadOrderData(OrderStatus status, JTable tb) {
        DefaultTableModel DTM = (DefaultTableModel) tb.getModel();
        DTM.setRowCount(0);
        int IdIndex = 1;
        for (Map.Entry<String, Order> entry : Order.Database.getItemHashMap().entrySet()) {
            String key = entry.getKey();
            Order CurrentOrder = entry.getValue();
            if (status == OrderStatus.ALL_ORDERS) {
                Object[] currentObj = {IdIndex, CurrentOrder.getOrderId(), CurrentOrder.getOrderName(), CurrentOrder.getOrderItems(), CurrentOrder.getOrderStatus().toString().replaceAll("_"," ")};
                DTM.addRow(currentObj);
                customizedTabel(tb, CurrentOrder.getOrderItems(), IdIndex);
                IdIndex++;
            } else {
                if (CurrentOrder.getOrderStatus() == status) {
                    Object[] currentObj = {IdIndex, CurrentOrder.getOrderId(), CurrentOrder.getOrderName(), CurrentOrder.getOrderItems(), OrderStatus.getSimpleName(CurrentOrder.getOrderStatus())};
                    DTM.addRow(currentObj);
                    customizedTabel(tb, CurrentOrder.getOrderItems(), IdIndex);
                    IdIndex++;
                }
            }

        }
    }

    protected void customizedTabel(JTable tb, ArrayList<OrderItem> orderItems, int row) {

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

                    String FoodName = items.get(i).getFoodItem().getName().length() > 100 ? items.get(i).getFoodItem().getName().substring(0, 100) + suffix + " x " + items.get(i).getQty() : items.get(i).getFoodItem().getName() + " x " + items.get(i).getQty();
                    JLabel lb = new JLabel(prefix + FoodName);
                    lb.setHorizontalAlignment(CENTER);
                    lb.setBorder(new EmptyBorder(0, 10, 0, 10));
                    labelBase.add(lb);
                    base.add(labelBase);
                    if (isSelected) {
                        if (items.size() == 1) {
                            labelBase.setBackground(Constants.PRIMARY_LIGHT_2);
                        } else {
                            labelBase.setBackground(i % 2 == 0 ? Color.WHITE : Constants.PRIMARY_LIGHT_2);
                        }
                    } else {
                        labelBase.setBackground(i % 2 == 0 ? Color.WHITE : Constants.LIGHT_GRAY_250);
                    }
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

    public void createStatusButtonList(Object[] statusList, JPanel buttonsBasePanel, JTable tb) {

        buttonsBasePanel.setBackground(Color.WHITE);
        Object[] ButtonNames = statusList;
        ButtonGroup buttonGroup = new ButtonGroup();
        int Xbounds = 25;

        for (int i = 0; i < ButtonNames.length; i++) {
            OrderStatus Status = (OrderStatus) ButtonNames[i];
            JButton buttonInstance = CustomizedPrimaryButton.getCustomizedButton("      " + OrderStatus.getSimpleName(Status) + "      ", i, Xbounds, 0, buttonGroup,
                    () -> {
                        loadOrderData(Status, tb);
                    });
            buttonsBasePanel.add(buttonInstance);
            Xbounds += buttonInstance.getPreferredSize().width + 55;
        }
    }
}
