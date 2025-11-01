/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package square;

import java.util.Scanner;

/**
 *
 * @author Shevan Nadiranga
 */
public class Square {

    public static void drawsquare(int dim) {
        
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {

                if (j == i || j + 1 == dim - i || i == 0 || i == dim - 1 || 
                        j == 0 || j == dim - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
