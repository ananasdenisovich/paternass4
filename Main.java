public class Main {
    public static void main(String[] args) {
        NotificationPublisher publisher = new NotificationPublisher();
        User user1 = new User("User 1");
        User user2 = new User("User 2");
        publisher.addObserver(user1);
        publisher.addObserver(user2);
        Factory notificationFactory = new NotificationFactory();
        Product notification1 = notificationFactory.createProduct("Notification1");
        publisher.publishNotification(notification1.getMessage());
        System.out.println(publisher.getUsers());
        publisher.removeObserver(user2);
        System.out.println("deleted User2");
        System.out.println(publisher.getUsers());
        Product notification2 = notificationFactory.createProduct("Notification2");
        publisher.publishNotification(notification2.getMessage());
        System.out.println("Only User1 received Notification2");
    }
}
