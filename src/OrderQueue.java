import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class OrderQueue {
    private Queue<String> orderQueue;

    public OrderQueue() {
        orderQueue = new LinkedList<>();
    }

    public void addOrderToQueue(String order) {
        orderQueue.add(order);
    }

    private String removeOrderFromQueue() {
        if (!orderQueue.isEmpty()) {
            return orderQueue.poll();
        } else {
            System.out.println("The queue is empty.");
            return null;
        }
    }

    private boolean isQueueEmpty() {
        return orderQueue.isEmpty();
    }

    public void handleQueue() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Choose what you want to do with the order queue:\n" +
                    "1. Display all orders in the queue\n" +
                    "2. Remove an order from the queue\n" +
                    "3. Check if the queue is empty\n" +
                    "4. Exit\n" +
                    "Enter your choice (1 – 4):");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    displayQueue();
                    break;
                case 2:
                    String removedOrder = removeOrderFromQueue();
                    if (removedOrder != null) {
                        System.out.println("Removed order: " + removedOrder);
                    }
                    break;
                case 3:
                    if (isQueueEmpty()) {
                        System.out.println("The queue is completely empty.");
                    } else {
                        System.out.println("The queue is not empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting order queue management.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayQueue() {
        if (!orderQueue.isEmpty()) {
            System.out.println("Orders in the Queue:");
            for (String order : orderQueue) {
                System.out.println(order);
            }
        } else {
            System.out.println("The queue is empty.");
        }
    }
}