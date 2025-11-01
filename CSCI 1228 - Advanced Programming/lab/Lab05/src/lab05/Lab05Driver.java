/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab05;

import properties.Apartment;
import properties.Building;

/**
 *
 * @author sheva
 */
public class Lab05Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //testing constructor and toString
        System.out.println("First we create a new building");
        Building b=new Building(5);
        System.out.println("and display the result:\n");
        System.out.println(b);
        
        //testing addUnit
        System.out.println("\nNow we add some apartments to the building");
        b.addUnit(new Apartment(1,3,450,true));
        b.addUnit(new Apartment(2,2,400,false));
        b.addUnit(new Apartment(3,4,1000,true));
        b.addUnit(new Apartment(4,1,500,true));
        b.addUnit(new Apartment(5,5,10000,false));     
        System.out.println("and display the result:\n");
        System.out.println(b);
        System.out.println("Now we try to add another "
                + "apartment to the building");
        b.addUnit(new Apartment(6,3,550,true));
        
        
        
        //testing collectRent
        System.out.println("\nNow we create a new building "
                + "and add some apartments");
        b=new Building(10);
        b.addUnit(new Apartment(1,3,450,true));
        b.addUnit(new Apartment(2,2,400,false));
        b.addUnit(new Apartment(3,4,1000,true));
        b.addUnit(new Apartment(4,1,500,true));
        b.addUnit(new Apartment(5,5,10000,false)); 
        b.addUnit(new Apartment(6,3,550,true));
        System.out.println("then we collect the rent from "
                + "all the occupied apartments");
        System.out.println("The total rent collected was: $"+b.collectRent());
        
        
        //testing getUnits
        System.out.println("\nFinally we use the getUnits method to get a copy "
                + "of the 3rd unit from the building and change its rent to "
                + "$10");
        b.getUnits()[2].setRent(10);
        System.out.println("then we display the building again to show that "
                + "the apartment has not changed\n");
        System.out.println(b); 
          
    
    }
    
}
