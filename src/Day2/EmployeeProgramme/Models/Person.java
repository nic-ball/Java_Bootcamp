package Day2.EmployeeProgramme.Models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by nicholas.ball on 11/10/2016.
 */
public class Person {
    //members
    /**
    fields - private (only available to itself)

    properties - getters and setters
    methods, constructors
    events
    exception handling

     */
    private String firstName;
    private String surname;
    private LocalDate dob;
    private int NotBorn = 0;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public Person() {}

    public Person(String fn) {
        this.firstName = fn;
    }
    public Person(String fn, String ln) {
        this.firstName = fn;
        this.surname = ln;
    }
    public Person(String fn, String ln, LocalDate dob) {
        this.firstName = fn;
        this.surname = ln;
        this.dob = dob;
    }
    public long getAge() {
        if (dob == null) {
            return NotBorn;
        }
        long years = ChronoUnit.YEARS.between(dob, LocalDate.now());
        return years;
    }

    @Override
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dob +
                '}';
    }
}
