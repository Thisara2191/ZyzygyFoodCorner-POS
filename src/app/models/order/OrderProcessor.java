package app.models.order;

import app.models.CustomHandlers;

public class OrderProcessor {

    private static OrderProcessor processor;
    private OrderHandler firstHandler;

    public static OrderProcessor getInstance() {
        if (processor == null) {
            processor = new OrderProcessor();
        }
        return processor;
    }

    public OrderProcessor getCompleteOrderProcesser() {
        processor.addHandler(new CustomHandlers.KitchenHandler.KitchenApproval());
        processor.addHandler(new CustomHandlers.PaymentHandler());
        processor.addHandler(new CustomHandlers.CookingCompletionHandler());
        processor.addHandler(new CustomHandlers.DeliveryHandler());
        return processor;
    }

    public OrderProcessor getDeclineOrderProcesserInstance() {
        processor.addHandler(new CustomHandlers.KitchenHandler.KitchenApproval());
        processor.addHandler(new CustomHandlers.PaymentHandler());
        processor.addHandler(new CustomHandlers.CookingCompletionHandler());
        processor.addHandler(new CustomHandlers.DeliveryHandler());
        return processor;
    }

    private OrderProcessor() {
    }

    public OrderProcessor addHandler(OrderHandler handler) {
        if (firstHandler == null) {
            firstHandler = handler;
        } else {
            OrderHandler currentHandler = firstHandler;
            while (currentHandler.getNextHandler() != null) {
                currentHandler = currentHandler.getNextHandler();
            }
            currentHandler.setNextHandler(handler);
        }
        return this;
    }

    public OrderProcessor processOrder(Order order) {
        if (firstHandler != null) {
            firstHandler.handleOrder(order);
        } else {
            System.out.println("No handlers configured for order processing.");
        }
        return this;
    }
}

//class hello {
//
//    public static void main(String[] args) {
//        OrderProcessor processor = OrderProcessor.getInstance();
//        processor.addHandler(new CustomHandlers.KitchenHandler.KitchenApproval());
//
//        ArrayList<Food> customArrayList = Database.PredefinedData.getFoodList();
//
//        Order o = new Order.Builder("145236", "HelloTest", new CustomArrayList<OrderItem>().addItems(new OrderItem.Builder(Food.getInstance("BEEF BURGER", new CustomArrayList<>()), 3, new Date()).build(), new OrderItem.Builder(Food.getInstance("CHEESE BURGER", null), 3, new Date()).build()), new Date(), OrderStatus.USER_CREATED).build();
//        processor.processOrder(o).addHandler(new CustomHandlers.PaymentHandler()).processOrder(o);
//
//    }
//}
