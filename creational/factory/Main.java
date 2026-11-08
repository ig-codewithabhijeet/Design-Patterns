package factory;

import factory.services.AuthenticationService;
import factory.services.LogisticService;
import factory.services.OrderService;

/** Demo: the services never use `new SmsNotification()` etc. themselves. */
public class Main {
    public static void main(String[] args) {
        new AuthenticationService().sendOtp("+91-98xxxxxx01", "482913");
        new OrderService().orderPlaced("+91-98xxxxxx01");
        new LogisticService().outForDelivery("+91-98xxxxxx01");
        new AuthenticationService().complaintReceived("user@example.com");
    }
}
