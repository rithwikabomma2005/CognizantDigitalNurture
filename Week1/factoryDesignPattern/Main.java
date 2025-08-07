package factorydesignpattern;

public class Main {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("EMAIL");
        notification.notifyUser();
    }
}
