package app.models.order;

import app.models.CustomArrayList;
import app.models.food.Food;
import app.models.food.FoodParent;
import java.util.Date;

public class OrderItem {

    private final Food foodItem;
    private final int qty;
    private final Date createdTime;

    private OrderItem(Builder builder) {
        this.foodItem = builder.foodItem;
        this.qty = builder.qty;
        this.createdTime = builder.createdTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public FoodParent getFoodItem() {
        return foodItem;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return getFoodItem().getPrice() + " - " + getFoodItem().getName() + " - " + getCreatedTime() + " Grand Total : " + getFoodItem().getPrice() * getQty();
    }

    public static class Builder {

        private final Food foodItem;
        private int qty;
        private final Date createdTime;

        public Builder(Food foodItem, int qty, Date createdTime) {
            this.foodItem = foodItem;
            this.qty = qty;
            this.createdTime = createdTime;
        }

        public Builder setQty(int qty) {
            this.qty = qty;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }
    }

    public static class Database {

        private static CustomArrayList<OrderItem> itemList;

        public static CustomArrayList<OrderItem> getItemArrayList() {
            if (itemList == null) {
                itemList = new CustomArrayList<>();
            }
            return itemList;
        }

        public void addItem(OrderItem e) {
            itemList.add(e);
        }

        public static void clearArrayList() {
            itemList.clear();
        }

        public static CustomArrayList<OrderItem> cloneItemList() {
            return new CustomArrayList<OrderItem>().addAllItems(itemList);
        }

    }
}
