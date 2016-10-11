package Day2.EmployeeProgramme.Models;

import java.time.LocalDate;

/**
 * Created by nicholas.ball on 11/10/2016.
 */
public class Employee extends Person {

    private LocalDate hireDate;

    @Override
    public String toString() {
        return String.format("Employee: %s %s %s", super.toString(),
                hireDate.toString(), jobRole.toString());
    }

    private String jobRole;

    //constructor
    public Employee() {}

    public Employee(String fn, String ln, LocalDate dob, LocalDate hireDate, String jobRole) {
        super(fn, ln, dob);
        this.hireDate = hireDate;
        this.jobRole = jobRole;
    }


    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }
}
