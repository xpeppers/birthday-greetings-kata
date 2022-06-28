package it.xpeppers.birthday_greetings.adapter;

import it.xpeppers.birthday_greetings.domain.Employee;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRetrieverAdapter {
    List<Employee> findBirthday(LocalDate date);
}
