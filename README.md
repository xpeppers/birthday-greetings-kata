The exercise aims to implement a birthday greetings software that uses emails to greet his users.

## How to

This kata can be done in two ways:
- if you want to try the refactoring way, then import the maven project into your IDE and start from there. 
- If you want to try the TDD way, just start with a blank Java project.

## Problem

Write a program that loads a set of employee records from a flat file. 
Sends a greetings email to all employees whose birthday is today.
The flat file is a sequence of records, separated by newlines; these are the first few lines:

```
last_name, first_name, date_of_birth, email
Doe, John, 1982/10/08, john.doe@foobar.com
Ann, Mary, 1975/09/11, mary.ann@foobar.com`
```

The greetings email contains the following text:

```
Subject: Happy birthday!

Happy birthday, dear John!
```

with the first name of the employee substituted for "John".

The program should be invoked by a main program like this one:

```
public static void main(String[] args) {
    ...
    BirthdayService birthdayService = new BirthdayService(
        employeeRepository, emailService);
    birthdayService.sendGreetings(today());
}
```
Note that the collaborators of the birthdayService objects are injected in it.
Ideally domain code should never use the new operator. 
The new operator is called from outside the domain code, 
to set up an aggregate of objects that collaborate together.

## Goals
The goal of this exercise is to come up with a solution that is

* **Testable**:
  
  we should be able to test the internal application logic with no need to ever send a real email.

* **Flexible**:
 
  we anticipate that the data source in the future could change from a flat file to a relational database, or perhaps a web service. We also anticipate that the email service could soon be replaced with a service that sends greetings through Facebook or some other social network.
* **Well-designed**:

  separate clearly the business logic from the infrastructure (e.g. using hexagonal architecture).

## An optional complication
If you want to develop further the domain logic, you can take into account the special rule for people born on a 29th of February: 
they should be sent greetings on the 28th of February, 
except in leap years, when they will get their greetings on the 29th.

## Notes for Windows

On Windows, the tests with the fake smtp server do not work.  If you are on Windows, then comment or delete the `AcceptanceTest.java` file.  If you are on Linux, Mac or other Unix, then delete the `AcceptanceForWindowsTest.java`

## General requirements

* Use whatever language and frameworks you want. 
(provide instructions on how to run the application)
* **IMPORTANT**: 

  implement the requirements focusing on writing the best code 
you can produce.
