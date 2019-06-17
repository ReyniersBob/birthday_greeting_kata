package it.xpug.kata.birthday_greetings.email;

import it.xpug.kata.birthday_greetings.employee.Employee;

public class BirthdayEmail extends Email {

    public BirthdayEmail(Employee employee, String sender) {
        super(sender, "Happy Birthday!", "Happy Birthday, dear %NAME%!".replace("%NAME%", employee.getFirstName()), employee.getEmail());
    }
}
