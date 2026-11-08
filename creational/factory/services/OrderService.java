package factory.services;

import factory.NotificationFactory;
import factory.messages.Message;
import factory.messages.MessageType;
import factory.notifications.Notification;

public class OrderService {
    public void orderPlaced(String user) {
        Message message = new Message(MessageType.GENERIC, user, "Your order has been placed!");
        Notification n = NotificationFactory.getNotifier(message);
        n.send(message);
    }
}
