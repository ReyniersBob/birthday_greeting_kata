package it.xpug.kata.birthday_greetings;

import it.xpug.kata.birthday_greetings.employee.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;

public class EmployeeRepository implements IEmployeeRepository {
    public EmployeeRepository() {
    }

    @Override
    public ArrayList<Employee> findEmployees(String fileName) throws IOException, ParseException {
        BufferedReader in = new BufferedReader(new InputStreamReader(EmployeeRepository.class.getClassLoader().getResourceAsStream(fileName)));
        String str = "";
        ArrayList<Employee> employees = new ArrayList<Employee>();
        str = in.readLine(); // skip header
        while ((str = in.readLine()) != null) {
            String[] employeeData = str.split(", ");
            Employee employee = new Employee(employeeData[1], employeeData[0], employeeData[2], employeeData[3]);
            employees.add(employee);
        }
        return employees;
    }
}