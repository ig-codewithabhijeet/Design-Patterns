package factory.services;

import factory.NotificationFactory;
import factory.messages.Message;
import factory.messages.MessageType;
import factory.notifications.Notification;

public class LogisticService {
    public void outForDelivery(String user) {
        Message message = new Message(MessageType.GENERIC, user, "Your package is out for delivery.");
        Notification n = NotificationFactory.getNotifier(message);
        n.send(message);
    }
}
