package app.models.order;

public enum OrderStatus {

    ALL_ORDERS,
    USER_CANCELLED,
    USER_CREATED,
    KITCHEN_APPROVED,
    KITCHEN_DECLINED,
    KITCHEN_PROCESSING,
    KITCHEN_COMPLETED,
    CASHIER_PAID,
    CASHIER_DECLINED,
    DELIVERY_APPROVED,
    DELIVERY_PROCESSING,
    DELIVERY_COMPLETED;

    public static Object[] UserEnums() {
        Object[] user = {USER_CREATED, USER_CANCELLED};
        return user;
    }

    public static Object[] KitchenEnums() {
        Object[] kitchen = {USER_CREATED, KITCHEN_APPROVED, KITCHEN_DECLINED, CASHIER_PAID, KITCHEN_PROCESSING, KITCHEN_COMPLETED};
        return kitchen;
    }

    public static Object[] CashierEnums() {
        Object[] cashier = {KITCHEN_APPROVED, KITCHEN_DECLINED, CASHIER_PAID, CASHIER_DECLINED, ALL_ORDERS};
        return cashier;
    }

    public static Object[] DeliveryEnums() {
        Object[] delivery = {KITCHEN_COMPLETED, DELIVERY_APPROVED, DELIVERY_PROCESSING, DELIVERY_COMPLETED};
        return delivery;
    }

    public static OrderStatus[] KitchenProcessEnums() {
        OrderStatus[] kitchen = {USER_CREATED,KITCHEN_DECLINED, CASHIER_PAID, KITCHEN_PROCESSING};
        return kitchen;
    }

    public static OrderStatus[] CashierProcessEnums() {
        OrderStatus[] cashier = {KITCHEN_APPROVED, CASHIER_DECLINED};
        return cashier;
    }

    public static OrderStatus[] DeliveryProcessEnums() {
        OrderStatus[] delivery = {KITCHEN_COMPLETED, DELIVERY_APPROVED, DELIVERY_PROCESSING, DELIVERY_COMPLETED};
        return delivery;
    }

    public Object[] AllEnums() {
        Object[] all = {
            USER_CANCELLED,
            USER_CREATED,
            KITCHEN_APPROVED,
            KITCHEN_DECLINED,
            KITCHEN_PROCESSING,
            KITCHEN_COMPLETED,
            CASHIER_PAID,
            CASHIER_DECLINED,
            DELIVERY_APPROVED,
            DELIVERY_PROCESSING,
            DELIVERY_COMPLETED};
        return all;
    }

    public static String getSimpleName(OrderStatus status) {
//        return status.toString().split("_")[1];
        return status.toString().replace("_", " ");
    }

}
