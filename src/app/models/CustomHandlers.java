package app.models;

import app.models.order.OrderHandler;
import app.models.order.OrderStatus;
import app.models.order.Order;

public class CustomHandlers {

    public static class KitchenHandler {

        public static class KitchenApproval implements OrderHandler {

            private OrderHandler nextHandler;

            @Override
            public void handleOrder(Order order) {
                if (order.getOrderStatus() == OrderStatus.USER_CREATED) {
                    order.setOrderStatus(OrderStatus.KITCHEN_APPROVED);
                } else if (order.getOrderStatus() == OrderStatus.KITCHEN_APPROVED) {
                    order.setOrderStatus(OrderStatus.CASHIER_PAID);
                } else if (nextHandler != null) {
                    nextHandler.handleOrder(order);
                }

            }

            @Override
            public OrderHandler getNextHandler() {
                return nextHandler;
            }

            @Override
            public void setNextHandler(OrderHandler nextHandler) {
                this.nextHandler = nextHandler;
            }
        }

        public static class KitchenDecline implements OrderHandler {

            private OrderHandler nextHandler;

            @Override
            public void handleOrder(Order order) {
                if (order.getOrderStatus() == OrderStatus.KITCHEN_DECLINED) {
                    order.setOrderStatus(OrderStatus.KITCHEN_APPROVED);
                } else if (nextHandler != null) {
                    nextHandler.handleOrder(order);
                }
            }

            @Override
            public OrderHandler getNextHandler() {
                return nextHandler;
            }

            @Override
            public void setNextHandler(OrderHandler nextHandler) {
                this.nextHandler = nextHandler;
            }
        }

    }

    public static class PaymentHandler implements OrderHandler {

        private OrderHandler nextHandler;

        @Override
        public void handleOrder(Order order) {
            if (order.getOrderStatus() == OrderStatus.KITCHEN_APPROVED) {
                order.setOrderStatus(OrderStatus.CASHIER_PAID);
            } else if (nextHandler != null) {
                nextHandler.handleOrder(order);
            }
        }

        @Override
        public OrderHandler getNextHandler() {
            return nextHandler;
        }

        @Override
        public void setNextHandler(OrderHandler nextHandler) {
            this.nextHandler = nextHandler;
        }
    }

    public static class CookingCompletionHandler implements OrderHandler {

        private OrderHandler nextHandler;

        @Override
        public void handleOrder(Order order) {
            if (order.getOrderStatus() == OrderStatus.CASHIER_PAID) {
                order.setOrderStatus(OrderStatus.KITCHEN_PROCESSING);
                System.out.println("Cooking Handler: On Kitchen Process");
                return;
            }

            if (order.getOrderStatus() == OrderStatus.KITCHEN_PROCESSING) {
                order.setOrderStatus(OrderStatus.KITCHEN_COMPLETED);
                System.out.println("Cooking Handler: Cooking Completed");
                return;
            }

            if (nextHandler != null) {
                nextHandler.handleOrder(order);
            }

        }

        @Override
        public OrderHandler getNextHandler() {
            return nextHandler;
        }

        @Override
        public void setNextHandler(OrderHandler nextHandler) {
            this.nextHandler = nextHandler;
        }
    }

    public static class DeliveryHandler implements OrderHandler {

        private OrderHandler nextHandler;

        @Override
        public void handleOrder(Order order) {
            if (order.getOrderStatus() == OrderStatus.KITCHEN_COMPLETED) {
                order.setOrderStatus(OrderStatus.DELIVERY_APPROVED);
                System.out.println("Delivery Handler: On the way to the customer");
                return;
            }
            if (nextHandler != null) {
                nextHandler.handleOrder(order);
            }
        }

        @Override
        public OrderHandler getNextHandler() {
            return nextHandler;
        }

        @Override
        public void setNextHandler(OrderHandler nextHandler) {
            this.nextHandler = nextHandler;
        }
    }

}
