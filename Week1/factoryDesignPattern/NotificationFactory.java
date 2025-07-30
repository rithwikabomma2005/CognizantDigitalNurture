package factorydesignpattern;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty())
            return null;
        if (type.equalsIgnoreCase("EMAIL"))
            return new EmailNotification();
        else if (type.equalsIgnoreCase("SMS"))
            return new SMSNotification();
        else if (type.equalsIgnoreCase("PUSH"))
            return new PushNotification();
        return null;
    }

	public static Notification createNotification(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
