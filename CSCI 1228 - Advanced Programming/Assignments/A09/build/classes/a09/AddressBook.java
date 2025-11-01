/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The AddressBook class represents a collection of contacts.
 * It allows adding, removing, modifying, displaying, and saving contacts.
 * Contacts are stored in an ArrayList and persisted to a file ("contacts.dat").
 * 
 * Each contact contains a name, email, and a list of phone numbers.
 * The class handles loading existing contacts from the file during
 * initialization.
 *
 * @author Shevan Nadiranga(A00490556)
 */
public class AddressBook implements Serializable {

    private ArrayList<Contact> contacts; // List to store all contacts

    public AddressBook() {

        this.contacts = new ArrayList<Contact>();

        // Try to load existing contacts from file
        try (ObjectInputStream in = new ObjectInputStream(new 
        FileInputStream("contacts.dat"))) {

            contacts = (ArrayList<Contact>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // If file does not exist or cannot be read, start with empty list
            System.out.println("No existing contacts found. Starting fresh.");
        }

    }

    /**
     * Displays all contacts in the address book.
     * Each contact shows the name, email, and all phone numbers.
     * If the contact list is empty, nothing is displayed.
     * 
     */
    public void displayContacts() {

        // If there are no contacts, simply return
        if (contacts.isEmpty()) {
            return;
        }

        int labelWidth = 15; // Used to align labels

        // Loop through each contact and print their details
        for (Contact c : contacts) {
            System.out.println();
            System.out.printf("%-" + labelWidth + "s%s%n",
                    "Name:", c.name);
            System.out.printf("%-" + labelWidth + "s%s%n",
                    "Email:", c.email);

            ArrayList<String> phones = c.phoneNums;
            if (phones.isEmpty()) {
                // If contact has no phone numbers, print blank
                System.out.printf("%-" + labelWidth + "s%s%n",
                        "Phone Numbers:", "");
            } else {
                // Print first phone number with label
                System.out.printf("%-" + labelWidth + "s%s%n",
                        "Phone Numbers:", phones.get(0));
                for (int i = 1; i < phones.size(); i++) {
                    // Print remaining phone numbers aligned under label
                    System.out.printf("%-" + labelWidth + "s%s%n",
                            "", phones.get(i));
                }
            }

            System.out.println(); // Blank line between contacts
        }
    }

    /**
     * Adds a new contact to the address book.
     * Prompts the user to enter the contact's name, email, and multiple 
     * phone numbers.
     * If a contact with the same name already exists (case-insensitive),
     * the contact is not added.
     * 
     */
    public void addContact() {

        Scanner kbd = new Scanner(System.in);

        // Prompt user for name
        System.out.print("Enter Name: ");
        String newName = kbd.nextLine();

        // Check for duplicate name (case-insensitive)
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(newName)) {
                System.out.println("Contact already exists.");
                return; // Exit method if duplicate found
            }
        }

        // Prompt user for email
        System.out.print("Enter Email: ");
        String newEmail = kbd.nextLine();

        // List to store phone numbers
        ArrayList<String> phoneList = new ArrayList<String>();
        while (true) {
            // Ask for phone numbers until user enters nothing
            System.out.print("Enter Phone: ");
            String newPhoneNum = kbd.nextLine();
            if (newPhoneNum.isEmpty()) {
                break;
            } else {
                phoneList.add(newPhoneNum); // Add number to list
            }
        }

        // Create new contact and add phone numbers
        Contact newContact = new Contact(newName, newEmail);
        newContact.phoneNums.addAll(phoneList);
        // Add contact to contacts list
        contacts.add(newContact);

        System.out.println("Contact Added.");

    }

    /**
     * Removes an existing contact from the address book.
     * Prompts the user for the contact's name.
     * If the contact is found, it is removed; otherwise, a "Contact not found" 
     * message is displayed.
     * 
     */
    public void removeContact() {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String checkName = kbd.nextLine();

        boolean contactFound = false;

        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(checkName)) {
                contactFound = true;
                contacts.remove(c);
                System.out.println("Contact removed.");
                break;
            }

        }

        if (!contactFound) {
            System.out.println("Contact not found.");
        }

    }

    /**
     * Modifies an existing contact.
     * Prompts the user for the contact's name.
     * Displays the contact information if found.
     * Allows the user to add new phone numbers or remove existing ones.
     * If the contact is not found, a "Contact not found" message is displayed.
     * 
     */
    public void modifyContact() {

        Scanner kbd = new Scanner(System.in);

        // Ask user for name to remove
        System.out.print("Enter Name: ");
        String checkName = kbd.nextLine();

        boolean contactFound = false; // Flag to track if contact is found
        int labelWidth = 15; // Used to align printed labels

        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(checkName)) {
                contactFound = true;
                
                // Display contact info
                System.out.printf("%-" + labelWidth + "s%s%n",
                        "Name:", c.name);
                System.out.printf("%-" + labelWidth + "s%s%n",
                        "Email:", c.email);
                
                ArrayList<String> phones = c.phoneNums;
                
                if (phones.isEmpty()) {
                    System.out.printf("%-" + labelWidth + "s%s%n",
                            "Phone Numbers:", "");
                } else {
                    // Print first phone number with label
                    System.out.printf("%-" + labelWidth + "s%s%n",
                            "Phone Numbers:", phones.get(0));
                    for (int i = 1; i < phones.size(); i++) {
                        // Print remaining phone numbers aligned
                        System.out.printf("%-" + labelWidth + "s%s%n",
                                "", phones.get(i));
                    }
                }
                while (true) {

                    System.out.print("Enter an existing number to remove"
                            + " it or a new number to add it: ");
                    String newNum = kbd.nextLine();
                    if (c.phoneNums.contains(newNum)) {
                        // If number exists, remove it
                        c.phoneNums.remove(newNum);
                        System.out.println("Number removed");
                        break;
                    } else {
                        // Otherwise, add the new number
                        c.phoneNums.add(newNum);
                        System.out.println("Number added.");
                        break;
                    }

                }

            }

        }

        // If contact was not found, notify user
        if (!contactFound) {
            System.out.println("Contact not found.");
        }

    }

    /**
     * Saves the current list of contacts to the file "contacts.dat".
     * Overwrites the file if it already exists.
     * Handles any IO exceptions that may occur during saving.
     * 
     */
    public void save() {

        // Save contacts list to file
        try (ObjectOutputStream out = new ObjectOutputStream(new 
        FileOutputStream("contacts.dat"))) {

            out.writeObject(contacts);
        } catch (IOException e) {
            System.out.println("Error saving contacts " + e.getMessage());

        }
    }

    /**
     * Represents a contact in the address book.
     * Each contact contains a name, email, and a list of phone numbers.
     * Implements Serializable to allow object serialization.
     * 
     */
    private class Contact implements Serializable {

        private String name;
        private String email;
        private ArrayList<String> phoneNums;

        public Contact(String name, String email) {

            this.name = name;
            this.email = email;
            this.phoneNums = new ArrayList<String>(); // Initialize empty list
        }
    }

}
