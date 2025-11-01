/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l3;

import square.Square;

/**
 *
 * @author Shevan Nadiranga
 */
public class CommandLine {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("This program draws a square based on"
                    + " an Integer user enters");
            System.out.println("It expects at least one input as a command"
                    + " line argument");
            System.exit(0);
        }

        for (String s : args) {
            boolean isint = true;
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    isint = false;
                }
            }

            if (isint) {
                int num = Integer.parseInt(s);
                Square.drawsquare(num);
                System.out.println();

            } else{
                System.out.println("Error: " + s + " is not an Integer.");
                System.out.println();
            }
        }

    }
}
