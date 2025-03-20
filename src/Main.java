public class Main {
    public static void main(String[] args) {
        HandleOrders handleOrders = new HandleOrders();
        OrderLogs orderLogs = new OrderLogs();
        OrderQueue orderQueue = new OrderQueue();

        handleOrders.takeOrder();
        handleOrders.createOrderSummary();
        System.out.println(handleOrders);

        // Display custom pizzas
        handleOrders.displayCustomPizzas();

        // Add order summary to the logs
        orderLogs.addOrderLog(handleOrders.toString());
        orderLogs.handleLogs();

        // Add order summary to the queue
        orderQueue.addOrderToQueue(handleOrders.toString());
        orderQueue.handleQueue();
    }
}