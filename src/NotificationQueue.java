import java.util.LinkedList;
import java.util.Queue;

public class NotificationQueue {
    private Queue<String> notifications;

    public NotificationQueue() {
        notifications = new LinkedList<>();
    }

    public void addNotification(String message) {
        notifications.add(message);
        System.out.println("Notification added: " + message);
    }

    public void processNotification() {
        if (!notifications.isEmpty()) {
            System.out.println("Processing: " + notifications.poll());
        } else {
            System.out.println("No notifications!");
        }
    }

    public void displayAll() {
        System.out.println("--- Notifications ---");
        for (String n : notifications) {
            System.out.println(n);
        }
    }
}