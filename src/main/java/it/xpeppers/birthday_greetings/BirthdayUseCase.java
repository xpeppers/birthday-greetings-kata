package it.xpeppers.birthday_greetings;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class BirthdayUseCase {
    private final EmployeeRepository employeeRepository;
    private final GreetingsSender greetingsSender;

    public BirthdayUseCase(EmployeeRepository employeeRepository, GreetingsSender greetingsSender) {

        this.employeeRepository = employeeRepository;
        this.greetingsSender = greetingsSender;
    }

    public void sendGreetings(LocalDate date) {
        List<Employee> employees = employeeRepository.loadAll();
        employees.stream().filter(e -> e.isBirthday(date)).forEach(greetingsSender::send);
    }
}
