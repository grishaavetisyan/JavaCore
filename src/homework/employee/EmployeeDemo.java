package homework.employee;

import homework.employee.model.Employee;
import homework.employee.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun){
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchByName(keyword);
                    break;
                case "5":
                    searchEmployeesBySalaryRange();
                    break;
                case "6":
                    changeEmployeePositionById();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inactivateEmployeeById();
                    break;
                case "9":
                    activateEmployeeById();
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");
            }
        }
    }

    private static void inactivateEmployeeById() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            employee.setActive(false);
            System.out.println("Employee inactivated.");
        } else {
            System.out.println("Employee does not exists, please try again.");
        }
    }
    private static void activateEmployeeById() {
        employeeStorage.printByStatus(false);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null && !employee.isActive()) {
            employee.setActive(true);
            System.out.println("Employee activated.");
        } else {
            System.out.println("Employee does not exists, or employee is already active, please try again.");
        }
    }

    private static void changeEmployeePositionById() {
    employeeStorage.print();
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            System.out.println("please input new position");
            String newPosition = scanner.nextLine();
            employee.setPosition(newPosition);
            System.out.println("Position changed");
        } else {
            System.out.println("Employee does not exists, please try again.");
        }
    }

    private static void searchEmployeesBySalaryRange() {
        System.out.println("Please input min, max");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(", ");
        double minSalary = Double.parseDouble(salaryRange[0]);
        double maxSalary = Double.parseDouble(salaryRange[1]);
        if (minSalary>maxSalary) {
            System.out.println("min salary should be less then max salary");
        } else {
             employeeStorage.searchBySalaryRange(minSalary, maxSalary);
        }
    }

    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add an employee");
        System.out.println("Please input 2 for printing all employees database");
        System.out.println("Please input 3 for searching employee by id");
        System.out.println("Please input 4 for searching employee by company");
        System.out.println("Please input 5 for searching employee by salary range");
        System.out.println("Please input 6 for change employee position by id");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactivate employee by id");
        System.out.println("Please input 8 for activate employee by id");
    }

    private static void getEmployeeById() {
        System.out.println("Please input employee Id");
        String employeeID = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeID);
        if (employee == null) {
            System.out.println("Employee with " + employeeID + " does not exists.");
        } else {
            System.out.println(employeeID);
        }
    }

    private static void addEmployee() {
        System.out.println("Please input name, surname, employeeID, salary, company, position");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeID = employeeData[2];
        Employee employee = employeeStorage.getEmployeeById(employeeID);
        if (employee == null) {
            employee = new Employee(employeeData[0], employeeData[1], employeeID, Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5]);
            employeeStorage.add(employee);
            System.out.println("Employee was added. ");
        } else {
            System.out.println("employee with " + employeeID + " already exists!!!" );
        }
    }
}

