package Day2.EmployeeProgramme.Processor;

import Day2.EmployeeProgramme.GUI.CommandInterface;
import Day2.EmployeeProgramme.GUI.Swing;
import Day2.EmployeeProgramme.Models.Employee;
import Day2.EmployeeProgramme.Models.GenerateEmployee;

import static Day2.EmployeeProgramme.Models.GenerateEmployee.employees;

/**
 * Created by nicholas.ball on 11/10/2016.
 */
public class MainProgramme {
    public static void main(String[] args) throws Exception {
        //GenerateEmployee.createEmployee();

        TaskProcessing.setupDb();

        Swing gui = new Swing();
        gui.invokeGui();

    }
}
