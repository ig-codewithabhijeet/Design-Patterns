package factory.messages;

/** The kinds of messages our system can send. */
public enum MessageType {
    OTP,        // one-time passwords      -> SMS
    GENERIC,    // general updates         -> WhatsApp
    COMPLAINT   // user complaint replies  -> Email
}
