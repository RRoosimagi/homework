package Exersice25Marts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("Enter details for employee %d:\n", i+1);
            System.out.print("First name: ");
            String firstName = scanner.next();
            System.out.print("Last name: ");
            String lastName = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Occupation: ");
            String occupation = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Employee ID: ");
            int employeeId = scanner.nextInt();

            Employee employee = new Employee(firstName, lastName, age, occupation, salary, employeeId);
            employees.add(employee);
        }

        Company company = new Company("Acme Corp", employees);

        System.out.println("Average salary: " + company.averageSalary());
    }
}