package Exersices;

public class EmployeTest {

    public static void main(String[] args) {

        Employe employe = new Employe("Rauno", "Roosimagi", 39, "Builder", "AB120546s");

        System.out.println(employe.getFirstname());
        System.out.println(employe.getLastname());
        System.out.println(employe.getAge());
        System.out.println(employe.getOccupation());
        System.out.println(employe.getEmployeId());

    }
}
