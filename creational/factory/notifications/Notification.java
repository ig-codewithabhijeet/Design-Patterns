package factory.notifications;

import factory.messages.Message;

/** The common type every notification channel implements. */
public interface Notification {
    void send(Message message);
}
