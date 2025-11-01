/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1;
 import java.util.Scanner;

/**
 * LAB 01
 * Walimini Devage, Shevan
 * A00490556
 */
public class L1 {

    
    public static void main(String[] args) {
        /* This program outputs input one integer and outputs a square with those dimensions made 
from the '*' character.*/ 
        Scanner kbd = new Scanner(System.in);
        /*System.out.print("Enter a Digit:  ");
        int x = kbd.nextInt();
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                System.out.print("*");
            
            }
            System.out.println();
        }
        
        /*This program Modify your program from part 2 so it now outputs the lower left triangle with the input 
dimensions.*/ 
        
        /*System.out.print("Enter a Digit:  ");
        int y = kbd.nextInt();
        for (int i = 0; i < x; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            
            }
            System.out.println();
        }
        
        
        /*This program Modify your program from part 2 so it now outputs the lower right triangle with the input 
dimensions.*/
        
        /*System.out.print("Enter a Digit:  ");
        int z = kbd.nextInt();
        for (int i = 0; i < z; i++){
            for (int j = 0; j < z - i - 1; j++){
                System.out.print(" ");
            
            }
            for (int k = 0; k <= i; k++){
                System.out.print("*");
            }
        
            System.out.println();
            
        }
        
        
        /*This program Modify your program from part 4 so it now outputs a hollow square with the input dimensions
that has an X pattern inside.*/
        
        System.out.print("Enter a Digit:  ");
        int a = kbd.nextInt();
        for (int i = 0; i < a; i++) {  // row loop
            for (int j = 0; j < a; j++) {  // column loop
                if (i == 0 || i == a - 1 || j == 0 || j == a - 1 || i == j || i + j == a - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // Move to next line
        }
        
        
        
        
        
        
    }
    
}
