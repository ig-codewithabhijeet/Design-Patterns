package factory.services;

import factory.NotificationFactory;
import factory.messages.Message;
import factory.messages.MessageType;
import factory.notifications.Notification;

public class AuthenticationService {
    public void sendOtp(String user, String otp) {
        Message message = new Message(MessageType.OTP, user, "Your OTP is " + otp);
        Notification n = NotificationFactory.getNotifier(message);
        n.send(message);
    }

    public void complaintReceived(String user) {
        Message message = new Message(MessageType.COMPLAINT, user, "We received your complaint.");
        Notification n = NotificationFactory.getNotifier(message);
        n.send(message);
    }
}
