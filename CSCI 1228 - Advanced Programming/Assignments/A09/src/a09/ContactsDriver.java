/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package a09;

import util1228.Menu;
import static util1228.Utilities.displayInfo;
import static util1228.Utilities.pause;


/**
 * This is the driver for an address book which allows contacts 
 * to be added, removed, and modified.
 *
 * @author Shevan Nadiranga
 */
public class ContactsDriver {
    
    /////////////////////////////////////////////////
    ////////CHANGE TO YOUR INFORMATION//////////////
    public static final String NAME = "Nadiranga, Shevan";
    public static final String A_NUMBER = "A00490556";
    /////////////////////////////////////////////////
    ////////////////////////////////////////////////

    public static void main(String[] args) {
        displayInfo(NAME, A_NUMBER, "09",
                "This program is an address book which allows contacts \n" +
                "to be added, removed, and modified.");
        pause();
        
        AddressBook b=new AddressBook();
        Menu m = createMenu();
        int choice;
        
        do {
            m.display();
            choice = m.getChoice();
            switch (choice) {
                case 1:
                    b.displayContacts();
                    pause();
                    break;
                case 2:
                    b.addContact();
                    pause();
                    break;
                case 3:
                    b.removeContact();
                    pause();
                    break;
                case 4:
                    b.modifyContact();
                    pause();
                    break;
                case 5:
                    b.save();
                    System.out.println("Quiting");
                    pause("Press enter to end...");
                    break;
                case -1:
                    System.out.println("Invalid Choice");
                    pause();
                    break;
            }
        } while (choice != 5);

    }  

    /**
     * This method creates the Menu for the program and adds each of the options
     *
     * @return the created Menu
     */
    private static Menu createMenu() {
        Menu m = new Menu("Menu", 30, 120);
        m.addOption("Display Contacts");
        m.addOption("Add Contact");
        m.addOption("Remove Contact");
        m.addOption("Modify Contact");
        m.addOption("Quit");
        return m;
    }

}
