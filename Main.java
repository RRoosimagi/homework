package Animal;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog( "Lässi",  3, "F",7 , "Small german shepherd");

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getGender());
        System.out.println(dog.getWeight());
        System.out.println(dog.getRace());
    }
}