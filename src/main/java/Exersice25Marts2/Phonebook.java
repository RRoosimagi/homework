package Exersice25Marts2;

import java.util.HashMap;
import java.util.Map;

class Phonebook {
    private Map<String, Contact> phonebook = new HashMap<>();

    public void addContact(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        phonebook.put(name, newContact);
    }

    public void printContacts() {
        for (String name : phonebook.keySet()) {
            Contact contact = phonebook.get(name);
            String phoneNumber = contact.getPhoneNumber();
            System.out.println(name + ": " + phoneNumber);
        }
    }
}