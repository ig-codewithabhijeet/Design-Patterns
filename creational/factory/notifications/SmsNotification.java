package factory.notifications;

import factory.messages.Message;

public class SmsNotification implements Notification {
    @Override
    public void send(Message message) {
        System.out.println("[SMS] to " + message.getRecipient() + ": " + message.getBody());
    }
}
