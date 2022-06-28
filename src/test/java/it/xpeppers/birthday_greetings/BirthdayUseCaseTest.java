package it.xpeppers.birthday_greetings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static java.time.LocalDate.of;
import static org.mockito.Mockito.*;

public class BirthdayUseCaseTest {


    private final EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
    private final GreetingsSender greetingsSender = mock(GreetingsSender.class);
    private BirthdayUseCase birthdayUseCase;

    @BeforeEach
    void setUp() {
        birthdayUseCase = new BirthdayUseCase(employeeRepository, greetingsSender);
    }

    @Test
    void should_send_greetings_when_birthday_matches_given_day() {
        LocalDate birthday = of(2022, 6, 28);
        Employee employeeToGreet = new Employee(birthday.minusYears(30));
        Employee employeeToNotGreet = new Employee(of(1992, 2, 28));
        when(employeeRepository.loadAll()).thenReturn(Arrays.asList(employeeToGreet, employeeToNotGreet));

        birthdayUseCase.sendGreetings(birthday);

        verify(greetingsSender, times(1)).send(employeeToGreet);
    }


}
