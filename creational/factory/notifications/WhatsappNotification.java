package factory.notifications;

import factory.messages.Message;

public class WhatsappNotification implements Notification {
    @Override
    public void send(Message message) {
        System.out.println("[WhatsApp] to " + message.getRecipient() + ": " + message.getBody());
    }
}
