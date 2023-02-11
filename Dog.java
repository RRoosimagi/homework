package Animal;

public class Dog {
    private String name;
    private  Integer age;
    private String gender;
    private  Integer weight;
    private  String race;

    public Dog(String name, Integer age, String gender, Integer weight, String race){
        this.name = name;
        setAge(age);
        this.gender = gender;
        setWeight(weight);
        this.race = race;
    }

    public Dog Dog(String gender, String race){
        return new Dog("Lässi", 0, gender, 1, race);
    }

    public String getName() {
        System.out.print("Name: ");
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        System.out.print("Gende: ");
        return gender;
    }public void setGender(String gender) {
        this.gender = gender;
    }
    public String getRace() {
        System.out.print("Race: ");
        return race;
    }public void setRace(String race) {
        this.race = race;
    }

    public Integer getAge() {
        System.out.print("Age: ");
        return age;
    }
    public void setAge(Integer age) {
        if (age <= 0 ) {
            System.out.print("Incorrect age was specified. Please use value greater than zero!");
            return;
        }
        this.age = age;
    }
    public Integer getWeight() {
        System.out.print("Weight: ");
        return weight;
    }
    public void setWeight(Integer weight) {
        if (weight <= 0) {
            System.out.print("Incorrect weight was specified. Please, use values greater than zero!");
            return;
        }
        this.weight = weight;
    }
}

