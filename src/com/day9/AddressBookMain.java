package com.day9;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Address Book Program");

        Contact contact = new Contact("John", "Doe", "123 Main St", "City", "State", "12345", "1234567890", "john@example.com");
        addressBook.addContact(contact);

        System.out.println("Enter details to add a new contact:");
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        System.out.print("Address: ");
        String address = scanner.next();
        System.out.print("City: ");
        String city = scanner.next();
        System.out.print("State: ");
        String state = scanner.next();
        System.out.print("Zip: ");
        String zip = scanner.next();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();

        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.addContact(newContact);

        System.out.println("Enter the first name of the contact to edit:");
        String editFirstName = scanner.next();
        addressBook.editContact(editFirstName);

        System.out.println("Enter the first name of the contact to delete:");
        String deleteFirstName = scanner.next();
        addressBook.deleteContact(deleteFirstName);

        scanner.close();
    }
}
