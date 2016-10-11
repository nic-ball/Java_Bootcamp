package Day2.EmployeeProgramme.Processor;

import Day2.EmployeeProgramme.Models.Employee;

import java.time.LocalDate;
import java.util.List;

import static Day2.EmployeeProgramme.Models.GenerateEmployee.employees;

/**
 * Created by nicholas.ball on 11/10/2016.
 */
public class TaskProcessing {
    public static void listAll() {
        for (Employee e : employees)
            System.out.println(e);
    }


            public static String SearchByFirstName (String fn){
            for (Employee e : employees) {
                //comparator
                if (e.getFirstName().equalsIgnoreCase(fn))
                    return e.toString();

            }
            return "Not Found";
        }

        public static String createNew(List<String> data) {
            String[] dob = data.get(2).split("/");
            String[] hd = data.get(3).split("/");
            Employee temp = new Employee(
                data.get(0),
                data.get(1),
                LocalDate.of(Integer.parseInt(dob[0]),
                        Integer.parseInt(dob[1]),
                        Integer.parseInt(dob[2])),
                        LocalDate.of(Integer.parseInt(hd[0]),
                                Integer.parseInt(hd[1]),
                                Integer.parseInt(hd[2])),
                                data.get(4));


            employees.add(temp);
            return "SUCCESS";
        }

    }
