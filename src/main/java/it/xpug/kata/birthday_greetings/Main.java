package it.xpug.kata.birthday_greetings;

import javax.mail.MessagingException;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException, ParseException, MessagingException {
        BirthdayService service = new BirthdayService(new EmailMessageService(), new EmployeeRepository());
        service.sendGreetings("employee_data.txt", LocalDate.now(), "localhost", 25);
    }
}
