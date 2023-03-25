package Exersice25Marts;

public class Employee extends Person {
    private String occupation;
    private double salary;
    private int employeeId;

    public Employee(String firstName, String lastName, int age, String occupation, double salary, int employeeId) {
        super(firstName, lastName, age);
        this.occupation = occupation;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public String getOccupation() {
        return occupation;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}