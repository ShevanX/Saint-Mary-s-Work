/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package util1228;
import java.util.Scanner;

/**
 *
 * @author Shevan Nadiranga
 */
public class Utilities {
    
    private static final Scanner kbd = new Scanner(System.in);
    
    public static void pause(String input){
        
        System.out.println(input);
        kbd.nextLine();
        
    }
    
    public static void pause(){
        
        System.out.println("\nPress enter to continue...");
        kbd.nextLine();
        
    }
     
    public static void displayInfo(String name, String Anumber, 
            String assignment, String description){
        
        System.out.println("Assignment " + assignment);
        System.out.println(name);
        System.out.println(Anumber);
        System.out.println("\n" + description + "\n");
        
        
    }

}
