import java.util.ArrayDeque;
import java.util.Scanner;

public class OrderLogs {
    private ArrayDeque<String> orderLogs;

    public OrderLogs() {
        orderLogs = new ArrayDeque<>();
    }

    public void addOrderLog(String log) {
        orderLogs.push(log);
    }

    private void mostRecentLogEntry() {
        if (!orderLogs.isEmpty()) {
            System.out.println("Most Recent Log Entry: " + orderLogs.peek());
        } else {
            System.out.println("The log is empty.");
        }
    }

    private String getOrderLog() {
        if (!orderLogs.isEmpty()) {
            return orderLogs.pop();
        } else {
            System.out.println("The log is empty.");
            return null;
        }
    }

    private void removeAllLogEntries() {
        orderLogs.clear();
    }

    private boolean orderLogsEmpty() {
        return orderLogs.isEmpty();
    }

    public void handleLogs() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Choose what you want to do with order logs:\n" +
                    "1. Display all the logs\n" +
                    "2. Display the most recent log\n" +
                    "3. Remove a log entry\n" +
                    "4. Remove all log entries\n" +
                    "5. Check if the log is completely empty\n" +
                    "Enter your choice (1 – 5):");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    displayOrderLogs();
                    break;
                case 2:
                    if (!orderLogs.isEmpty()) {
                        mostRecentLogEntry();
                    } else {
                        System.out.println("The log is empty.");
                    }
                    break;
                case 3:
                    if (!orderLogs.isEmpty()) {
                        getOrderLog();
                        System.out.println("Log entry removed.");
                    } else {
                        System.out.println("The log is empty.");
                    }
                    break;
                case 4:
                    removeAllLogEntries();
                    System.out.println("All log entries removed.");
                    break;
                case 5:
                    if (orderLogsEmpty()) {
                        System.out.println("The log is completely empty.");
                    } else {
                        System.out.println("The log is not completely empty.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayOrderLogs() {
        if (!orderLogs.isEmpty()) {
            System.out.println("Order Logs:");
            for (String log : orderLogs) {
                System.out.println(log);
            }
        } else {
            System.out.println("The log is empty.");
        }
    }
}