/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3;


import square.Square;
import java.util.Scanner;
/**
 *
 * @author shevan nadiranga (A00490556)
 */
public class L3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = kbd.nextInt();
        kbd.nextLine();
        
        Square.drawsquare(num);
        
        
        
    }
    
}
