package Day2.EmployeeProgramme.Models;

import java.time.LocalDate;

/**
 * Created by nicholas.ball on 11/10/2016.
 */
public class Employee extends Person {


    private int id;
    private LocalDate hireDate;
    private String jobRole;

    //constructor
    public Employee() {}

    public Employee(int id, String fn, String ln, LocalDate dob, LocalDate hireDate, String jobRole) {
        super(fn, ln, dob);
        this.id = id;
        this.hireDate = hireDate;
        this.jobRole = jobRole;
    }

    public int getId() {
        return this.id;
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

    @Override
    public String toString() {
        return String.format("Employee: [%s] %s %s %s", this.getId(), super.toString(),
                hireDate.toString(), jobRole.toString());
    }
}

