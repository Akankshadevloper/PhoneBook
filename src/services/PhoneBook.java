package services;
import entities.Contact;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Contact> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.put(name, contact);
        System.out.println("Contact added: " + contact.getName() + " - " + contact.getPhoneNumber());
    }

    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            Contact removedContact = contacts.remove(name);
            System.out.println("Contact removed: " + removedContact.getName() + " - " + removedContact.getPhoneNumber());
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            Contact contact = contacts.get(name);
            System.out.println("Contact found: " + contact.getName() + " - " + contact.getPhoneNumber());
        } else {
            System.out.println("Contact not found: " + name);
        }
    }
}
