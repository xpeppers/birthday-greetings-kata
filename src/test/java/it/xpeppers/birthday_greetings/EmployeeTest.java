package it.xpeppers.birthday_greetings;

import it.xpeppers.birthday_greetings.adapter.EmployeeRetrieverAdapter;
import it.xpeppers.birthday_greetings.domain.Employee;
import it.xpeppers.birthday_greetings.usecase.EmployeeUseCase;
import it.xpeppers.birthday_greetings.usecase.service.EmployeeUseCaseService;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static java.time.LocalDate.now;
import static java.time.LocalDate.of;
import static org.mockito.Mockito.*;

public class EmployeeTest {
    private final SendMailAdapter sendMailAdapter = mock(SendMailAdapter.class);
    private final EmployeeRetrieverAdapter employeeRetrieverAdapter = mock(EmployeeRetrieverAdapter.class);
    ;

    @Test
    public void should_return_atleast_one_employee() {
        EmployeeUseCase useCase = new EmployeeUseCaseService();

        when(employeeRetrieverAdapter.findBirthday(now())).thenReturn(getListOfBirthedEmployees());

        useCase.sendGreetings(new Date());

        verify(sendMailAdapter).send(new Employee());

    }

    private List<Employee> getListOfBirthedEmployees() {
        return Collections.singletonList(new Employee("ROSSI", "FRANCO", of(1990, 6, 28), ""));

    }

}
