/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab08;
import java.util.Scanner;
/**
 *
 * @author sheva
 */
public class Lab08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kbd = new Scanner(System.in);
        String repeat;
        
        do {
            
            System.out.print("\nEnter the first String: ");
            String str1 = kbd.nextLine().toLowerCase();
            
            System.out.print("Enter the second String: ");
            String str2 = kbd.nextLine().toLowerCase();
            
            if(isReversed(str1, str2)){
                System.out.println("The second string is the first string "
                        + "reversed");
            } else{
                System.out.println("The second string is not the first"
                        + " string reversed");
            }
            
            System.out.print("Test another String (y/n): ");
            repeat = kbd.nextLine().toLowerCase();
            
            
        } while (repeat.equals("y"));
        
    }
    
    public static boolean isReversed(String x, String y){
        
        if(x.length() != y.length()){
            return false;
        }
        
        return checkReverse(x,y,0);
    }
    
    private static boolean checkReverse(String x, String y, int index){
        
        if(index >= x.length()){
            return true;
        }
        
        if(x.charAt(index) != y.charAt(y.length() - 1 - index)){
            return false;
        }
        
        return checkReverse(x, y, index + 1);
    }
        
        
    
}
