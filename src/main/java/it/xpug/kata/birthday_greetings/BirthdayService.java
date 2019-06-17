package it.xpug.kata.birthday_greetings;

import it.xpug.kata.birthday_greetings.email.BirthdayEmail;
import it.xpug.kata.birthday_greetings.employee.Employee;

import javax.mail.MessagingException;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

public class BirthdayService {

    public BirthdayService(IEmailMessageService iEmailMessageService, IEmployeeRepository iEmployeeRepository) {
        this.iEmailMessageService = iEmailMessageService;
        this.iEmployeeRepository = iEmployeeRepository;
    }

    private final IEmailMessageService iEmailMessageService;
    private final IEmployeeRepository iEmployeeRepository;

    public void sendGreetings(String fileName, LocalDate date, String smtpHost, int smtpPort) throws IOException, ParseException, MessagingException {
        List<Employee> employees = iEmployeeRepository.findEmployees(fileName);
        for (Employee employee : employees) {
            if (employee.isBirthday(date)) {
                iEmailMessageService.sendMessage(smtpHost, smtpPort, new BirthdayEmail(employee, "sender@here.com"));
            }
        }

    }

}
