package app.models.order;

public interface OrderHandler {

    void handleOrder(Order order);

    OrderHandler getNextHandler();

    void setNextHandler(OrderHandler nextHandler);
}
