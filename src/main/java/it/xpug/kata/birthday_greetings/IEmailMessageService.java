package it.xpug.kata.birthday_greetings;

import it.xpug.kata.birthday_greetings.email.Email;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public interface IEmailMessageService {
    void sendMessage(String smtpHost, int smtpPort, Email email) throws AddressException, MessagingException;
}
