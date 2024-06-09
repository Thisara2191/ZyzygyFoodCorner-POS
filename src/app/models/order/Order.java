package app.models.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Order {

    private final String orderId;
    private final String orderName;
    private final ArrayList<OrderItem> orderItems;
    private final Date createdDate;
    private OrderStatus orderStatus;

    private Order(Order.Builder builder) {
        this.orderId = builder.orderId;
        this.orderName = builder.orderName;
        this.orderItems = builder.orderItems;
        this.createdDate = builder.createdDate;
        this.orderStatus = builder.orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order ID: " + getOrderId()
                + " Order Name: " + getOrderName()
                + " Created Date: " + getCreatedDate()
                + " Order Status: " + getOrderStatus()
                + " Order Items: " + getOrderItems();
    }

    public static class Builder {

        private final String orderId;
        private String orderName;
        private ArrayList<OrderItem> orderItems;
        private final Date createdDate;
        private OrderStatus orderStatus;

        public Builder(String orderId, String orderName, ArrayList<OrderItem> orderItems, Date createdDate, OrderStatus orderStatus) {
            this.orderId = orderId;
            this.orderName = orderName;
            this.orderItems = orderItems;
            this.createdDate = createdDate;
            this.orderStatus = orderStatus;
        }

        public Builder setOrderName(String orderName) {
            this.orderName = orderName;
            return this;
        }

        public Builder setOrderItems(ArrayList<OrderItem> orderItems) {
            this.orderItems = orderItems;
            return this;
        }

        public Builder setOrderStatus(OrderStatus orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public static class Database {

        private static HashMap<String, Order> itemList;

        public static HashMap<String, Order> getItemHashMap() {
            if (itemList == null) {
                itemList = new HashMap<>();
            }
            return itemList;
        }

        public void addItem(String key, Order value) {
            itemList.put(key, value);
        }

        public void clear() {
            itemList.clear();
        }
    }
}
