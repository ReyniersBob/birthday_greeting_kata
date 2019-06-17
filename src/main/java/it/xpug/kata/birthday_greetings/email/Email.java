package it.xpug.kata.birthday_greetings.email;

public class Email {
    private final String sender;
    private final String subject;
    private final String body;
    private final String recipient;

    public Email(String sender, String subject, String body, String recipient) {
        this.sender = sender;
        this.subject = subject;
        this.body = body;
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getRecipient() {
        return recipient;
    }
}
