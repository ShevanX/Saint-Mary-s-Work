/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2;

import java.util.Scanner;

/**
 *
 * @author shevan nadiranga (A00490556)
 */
public class L2 {

    public static void main(String[] args) {
        String responce;
        String square;
        do {
            Scanner kbd = new Scanner(System.in);
            System.out.print("Enter an integer:");
            int dim = kbd.nextInt();
            kbd.nextLine();
            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    square = ((j == i || j + 1 == dim - i || i == 0 ||
                            i == dim - 1 || j == 0 || j == dim - 1)?"*":" ");
                    System.out.print(square);
                    
                }
                System.out.println("");

            }
            System.out.print("Do you want to create another "
                    + "sqaure(yes / no):  ");
            responce = kbd.next();
            kbd.nextLine();

        } while(responce.equalsIgnoreCase("yes"));
        
    }

}
