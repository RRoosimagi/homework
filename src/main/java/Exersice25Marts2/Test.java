package Exersice25Marts2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter name or '1' to exit: ");
            String name = scanner.nextLine();

            if (name.equals("1")) {
                break;
            }

            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();

            phonebook.addContact(name, phoneNumber);
        }

        System.out.println("\nContacts in phonebook:");
        phonebook.printContacts();
    }
}
