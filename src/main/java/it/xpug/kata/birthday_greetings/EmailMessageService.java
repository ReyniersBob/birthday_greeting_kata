package it.xpug.kata.birthday_greetings;

import it.xpug.kata.birthday_greetings.email.Email;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailMessageService implements IEmailMessageService {
    public EmailMessageService() {
    }

    @Override
    public void sendMessage(String smtpHost, int smtpPort, Email email) throws AddressException, MessagingException {
        // Create a mail session
        Properties props = new Properties();
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", "" + smtpPort);
        Session session = Session.getInstance(props, null);

        // Construct the message
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(email.getSender()));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(email.getRecipient()));
        msg.setSubject(email.getSubject());
        msg.setText(email.getBody());

        // Send the message
        Transport.send(msg);
    }
}