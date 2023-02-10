package homework.employee;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class EmployeeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isRun = true;
        while (isRun){
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add an employee");
            System.out.println("Please input 2 for printing all employees database");
            System.out.println("Please input 3 for searching employee by position");

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input name:");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname:");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employeeID:");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input salary:");
                    String salary = scanner.nextLine();
                    System.out.println("Please input name of the company:");
                    String company = scanner.nextLine();
                    System.out.println("Please input position:");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeID, Double.parseDouble(salary), company, position);
                    employeeStorage.add(employee);
                    System.out.println("Employee was added");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchByName(keyword);

                    break;
                default:
                    System.out.println("Wrong command! Please try again.");
            }

        }

    }
}
