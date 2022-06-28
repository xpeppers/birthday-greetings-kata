package it.xpeppers.birthday_greetings;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> loadAll();
}
