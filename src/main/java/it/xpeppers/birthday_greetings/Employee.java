package it.xpeppers.birthday_greetings;

import java.time.LocalDate;

public class Employee {
    private LocalDate birthday;

    public Employee(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public boolean isBirthday(LocalDate date) {
        return this.birthday.getMonth().equals(date.getMonth()) && this.birthday.getDayOfMonth() == date.getDayOfMonth();
    }
}
