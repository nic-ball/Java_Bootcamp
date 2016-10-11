package Day2.EmployeeProgramme.Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicholas.ball on 11/10/2016.
 */
//factory
public class GenerateEmployee {
    public static List<Employee> employees;

    public static void createEmployee() {
        Employee nic = new Employee("Nic", "Ball",
                LocalDate.of(1981, 6, 23),
                LocalDate.of(2016, 9, 26),
                "Apprentice");

        Employee batman = new Employee("Bat", "Man",
                LocalDate.of(1939, 5, 19),
                LocalDate.of(2016, 10, 10),
                "Dark Knight");

        //amazing collection type
        employees = new ArrayList<>();
        employees.add(nic);
        employees.add(batman);
    }

}
