package factory.notifications;

import factory.messages.Message;

public class EmailNotification implements Notification {
    @Override
    public void send(Message message) {
        System.out.println("[Email] to " + message.getRecipient() + ": " + message.getBody());
    }
}
