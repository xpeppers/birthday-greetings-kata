package it.xpeppers.birthday_greetings.usecase;

import it.xpeppers.birthday_greetings.domain.Employee;

import java.util.Date;
import java.util.List;

public interface EmployeeUseCase {
    void sendGreetings(Date date);
}
