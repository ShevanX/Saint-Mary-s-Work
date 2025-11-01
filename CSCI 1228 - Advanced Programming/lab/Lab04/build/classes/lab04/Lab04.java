/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04;

import properties.Apartment;

/**
 *
 * @author sheva
 */
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //testing the constructor and toString methods
        System.out.println("First we create an apartment called a1.");
        Apartment a1=new Apartment(310,4,2000,true);
        System.out.println("Now we print out a1:");
        System.out.println(a1);
        System.out.println("");
      
        System.out.println("Now we create a second apartment called a2.");
        Apartment a2=new Apartment(112,2,1000,false);
        System.out.println("Now we print out a2:");
        System.out.println(a2);
        System.out.println("");
        
        System.out.println("Now we create a third apartment variable"
                + " called a3.");
        Apartment a3;
        System.out.println("And we set it equal to a1.");
        a3=a1;
        System.out.println("Now we print out a3:");
        System.out.println(a3);
        System.out.println("");
        
        //and also the getter methods getRent and isOccupied
        System.out.println("Now we create a fourth apartment variable"
                + " called a4.");
        Apartment a4;
        System.out.println("And we create a new apartment object with the "
                + "same data as a2.");
        a4=new Apartment(a2.UNIT_NUM,a2.NUM_BEDROOMS,a2.getRent(),
                a2.isOccupied());
        System.out.println("Now we print out a4:");
        System.out.println(a4);
        System.out.println("");
        
        //checking the setRent method
        System.out.println("Now we change the rent for a1");
        a1.setRent(500);
        System.out.println("And print out both a1 and a3");
        System.out.println(a1);
        System.out.println("");
        System.out.println(a3);
        System.out.println("");
        
        System.out.println("Now we change the rent for a2");
        a2.setRent(500);
        System.out.println("And print out both a2 and a4");
        System.out.println(a2);
        System.out.println("");
        System.out.println(a4);
        System.out.println("");
        
        //checking the moveIn method
        System.out.println("Now we try to move someone into a1");
        a1.moveIn();
        System.out.println("Now we try to move someone into a2");
        a2.moveIn();
        System.out.println("");
        
        //checking the moveOut method
        System.out.println("Now we try to move someone out of a1");
        a1.moveOut();
        System.out.println("Now we try to move someone out of a3");
        a3.moveOut();
        System.out.println("");
        
        //checking the equals method
        System.out.println("Now we print whether a2 and a4 are the "
                + "same object");
        System.out.println(a2==a4);
        System.out.println("");
        System.out.println("Now we print whether a2 and a4 are equal "
                + "apartments (same unit number)");
        System.out.println(a2.equals(a4));
    }
    
}
