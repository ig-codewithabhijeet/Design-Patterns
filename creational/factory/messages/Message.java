package factory.messages;

/** A message to be delivered to a user. */
public class Message {
    private final MessageType type;
    private final String recipient;
    private final String body;

    public Message(MessageType type, String recipient, String body) {
        this.type = type;
        this.recipient = recipient;
        this.body = body;
    }

    public MessageType getType() {
        return type;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getBody() {
        return body;
    }
}
