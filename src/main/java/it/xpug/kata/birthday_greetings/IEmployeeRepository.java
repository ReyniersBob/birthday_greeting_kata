package it.xpug.kata.birthday_greetings;

import it.xpug.kata.birthday_greetings.employee.Employee;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public interface IEmployeeRepository {
    ArrayList<Employee> findEmployees(String fileName) throws IOException, ParseException;
}
