package it.xpeppers.birthday_greetings.adapter.impl;

import it.xpeppers.birthday_greetings.adapter.EmployeeRetrieverAdapter;
import it.xpeppers.birthday_greetings.domain.Employee;

import java.time.LocalDate;
import java.util.List;

public class EmployeeRetrieverAdapterService implements EmployeeRetrieverAdapter {
    @Override
    public List<Employee> findBirthday(LocalDate date) {
        return null;
    }
}
