package Exersice25Marts2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    private Map<String, String> contacts;

    public Phonebook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void printContacts() {
        if (contacts.isEmpty()) {
            System.out.println("The phonebook is empty.");
        } else {
            System.out.println("Phonebook contacts:");
            for (String name : contacts.keySet()) {
                System.out.println(name + " - " + contacts.get(name));
            }
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Phonebook options:");
            System.out.println("1. Add contact");
            System.out.println("2. Print contacts");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the contact's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the contact's phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phonebook.addContact(name, phoneNumber);
                    break;
                case 2:
                    phonebook.printContacts();
                    break;
                case 3:
                    System.out.println("Exiting phonebook.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
