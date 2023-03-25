package Exersice25Marts;

import java.util.List;

public class Company {
    private String companyName;
    private List<Employee> employees;

    public Company(String companyName, List<Employee> employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public double averageSalary() {
        if (employees.size() == 0) {
            return 0.0;
        }
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employees.size();
    }
}