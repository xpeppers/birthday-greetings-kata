package it.xpeppers.birthday_greetings;

import it.xpeppers.birthday_greetings.domain.Employee;

public interface SendMailAdapter {
    void send(Employee employee);
}
