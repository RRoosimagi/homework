package Exersice25Marts;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     List<Employee> employees = new ArrayList<>();
     employees.add(new Employee("Rauno", "Roosimagi", 39, "Developer", 60000.0, 1));
     employees.add(new Employee("Marko", "Mitt", 32, "Designer", 55000.0, 2));
     employees.add(new Employee("Frank", "Sinatra", 83, "Manager", 80000.0, 3));

     Company company = new Company("Ingel computers", employees);

     System.out.println("Average salary: " + company.averageSalary());
    }
}
