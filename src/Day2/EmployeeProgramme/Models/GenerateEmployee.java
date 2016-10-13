package Day2.EmployeeProgramme.Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicholas.ball on 11/10/2016.
 */
//factory
public class GenerateEmployee {
    public static List<Employee> employees = new ArrayList<>();

    public static void createEmployee() {
        Employee nic = new Employee(0,"Nic", "Ball",
                LocalDate.of(1981, 6, 23),
                LocalDate.of(2016, 9, 26),
                "Apprentice");

        Employee batman = new Employee(1,"Bat", "Man",
                LocalDate.of(1939, 5, 19),
                LocalDate.of(2016, 10, 10),
                "Dark Knight");

        Employee rick = new Employee(2, "Rick", "Sanchez",
                LocalDate.of(1955, 7, 4),
                LocalDate.of(2014, 8, 12),
                "Scientist");

        //amazing collection type
        employees = new ArrayList<>();
        //employees.add(nic);
        //employees.add(batman);
        //employees.add(rick);
    }

}
