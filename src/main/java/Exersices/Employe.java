package Exersices;

public class Employe extends Person{
    private String occupation;
    private String employeId;


    public Employe(String firstName, String lastName, int age, String occupation, String employeId){
        super(firstName, lastName, age);
        this.occupation=occupation;
        this.employeId=employeId;
    }


    public String getOccupation(){
        return occupation;
    }

    public String getEmployeId(){
        return employeId;
    }
}
