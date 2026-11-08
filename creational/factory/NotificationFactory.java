package factory;

import factory.messages.Message;
import factory.notifications.EmailNotification;
import factory.notifications.Notification;
import factory.notifications.SmsNotification;
import factory.notifications.WhatsappNotification;

/**
 * The factory: the ONLY place that knows which Notification class to create
 * for each message type.
 *
 * Adding a new channel = add one enum value + one case here.
 * None of the services need to change.
 */
public final class NotificationFactory {

    private NotificationFactory() {
        // utility class, no instances
    }

    public static Notification getNotifier(Message message) {
        switch (message.getType()) {
            case OTP:
                return new SmsNotification();
            case GENERIC:
                return new WhatsappNotification();
            case COMPLAINT:
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Unknown message type: " + message.getType());
        }
    }
}
