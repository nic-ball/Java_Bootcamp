package Day2.EmployeeProgramme.GUI;

import Day2.EmployeeProgramme.Processor.TaskProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nicholas.ball on 11/10/2016.
 */
public class CommandInterface {
    static Scanner input = new Scanner(System.in);

    public static void display() {
        int choice = 1;
        boolean _isRunning = true;
        while (_isRunning) {
            do {
                System.out.println("Welcome to Employee Awesome Programme");
                System.out.println("1. List All Employees");
                System.out.println("2. Add Employees");
                System.out.println("3. Edit Employees");
                System.out.println("4. Remove Employees");
                System.out.println("5. Search For Employees");
                System.out.println("6. Exit");
                choice = input.nextInt();
            } while (choice < 1 || choice > 6);

            switch (choice) {
                case 1:
                    //TaskProcessing.listAll();
                    display();
                    break;
                case 2:
                    System.out.println(TaskProcessing.createNew(inputDetails()));
                    break;
                case 5:
                    System.out.println("Enter first Name to Search: ");
                    //System.out.println(TaskProcessing.SearchByFirstName(input.next()));
                    break;
                case 6:
                    _isRunning = false;
            }
        }
    }


            static List<String> inputDetails() {
                List<String> tempEmployee = new ArrayList<>();
                input.nextLine();
                System.out.print("First Name: ");
                tempEmployee.add(input.nextLine());
                System.out.print("Last Name: ");
                tempEmployee.add(input.nextLine());
                System.out.print("DOB (YYYY/MM/DD):  ");
                tempEmployee.add(input.nextLine());
                System.out.print("HIREDATE (YYYY/MM/DD): ");
                tempEmployee.add(input.nextLine());
                System.out.print("JOB ROLE: ");



                return tempEmployee;
            }

        }


