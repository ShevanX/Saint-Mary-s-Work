//MenuDriver.java
package a04;

import util1228.*;


/**
 * This is a driver program to test a simple Menu class
 *
 * @author Shevan Nadiranga (A00490556)
 *
 */
public class MenuDriver {
    
    /////////////////////////////////////////////////
    ////////CHANGE TO YOUR INFORMATION//////////////
    public static final String NAME = "Walimini Devage, Shevan";
    public static final String A_NUMBER = "A00490556";
    /////////////////////////////////////////////////
    ////////////////////////////////////////////////
    
    public static final int HEIGHT=30;
    public static final int WIDTH=120;
   
    public static void main(String[] args) {
        
        //display information header
        Utilities.displayInfo(NAME, A_NUMBER, "04",
                    "This program tests a simple Menu class.");
        Utilities.pause();
             
        //creating a new menu using the constructor
        Menu menu=new Menu("Menu Title",HEIGHT,WIDTH);
        
        //display the menu 
        menu.display();
        Utilities.pause();
        
        //using the set tile method to change the title
        menu.setTitle("Awesome Menu Title!!!");
        
        //display the menu with changed title
        menu.display();
        Utilities.pause();
        
        //adding an option to the menu
        menu.addOption("Do Something");
        
        //displaying the menu with the new option
        menu.display();
        Utilities.pause();
        
        //adding some other options
        menu.addOption("Do Something Else");
        menu.addOption("Do Something Crazy");
        menu.addOption("Do Something More");
        menu.addOption("Do Something With A Really Long Name");
        
        //displaying the menu with the new options
        menu.display();
        Utilities.pause();
        
        //add enough options to fill the menu
        menu.addOption("Do Something Long");
        menu.addOption("Do Something Short");
        menu.addOption("Do Something Hard");
        menu.addOption("Do Something Easy");
        menu.addOption("Do The Last Thing");
        
        //displaying the menu with the new options
        menu.display();
        Utilities.pause();
        
        //try to add another option
        menu.addOption("Yet another option");
        Utilities.pause();
        
        //displaying the menu with the options unchanged
        menu.display();
        Utilities.pause();
        
        //creating a new menu with 6 options
        menu=new Menu("New Menu",HEIGHT,WIDTH);
        menu.addOption("Do Something");
        menu.addOption("Do Something Else");
        menu.addOption("Do Something Long");
        menu.addOption("Do Something Short");
        menu.addOption("Do Something Hard");
        menu.addOption("Do Something Easy");  
        
        
        //testing the getChoice method until the user enters an invalid choice
        int choice;
        do{
            menu.display();
            choice=menu.getChoice();
            if(choice!=-1){
                System.out.println("\nYou chose option #"+choice+"\n");
                Utilities.pause();
            }
            else{
                System.out.println("\nInvalid choice\n");
                Utilities.pause("Press enter to end...");
            }
        }while(choice!=-1);
        
        
    }

}
