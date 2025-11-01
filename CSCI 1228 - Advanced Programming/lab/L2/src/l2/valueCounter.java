/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l2;

import java.util.Scanner;

/**
 *
 * @author sheva
 */
public class valueCounter {

    public static Scanner kbd = new Scanner(System.in);

    public static void main(String[] args) {

        int vowels = 0, symbols = 0, spaces = 0, other = 0;
        System.out.print("Enter a line of text:  ");
        String resp = kbd.nextLine().toLowerCase();
        for (int i = 0; i < resp.length(); i++) {
            switch (resp.charAt(i)) {
                case 'a':
                case 'i':
                case 'e':
                case 'o':
                case 'u':
                    vowels++;
                    break;

                case '.':
                case ',':
                case '?':
                case '\'':
                case '"':
                    symbols++;
                    break;

                case ' ':
                    spaces++;
                    break;

                default:
                    other++;
                    break;

            }

        }
        System.out.printf("| %-5s | %-5s | %-5s| %-5s |\n", 
                "Vowels", "Symbols", "Spaces", "Other");
        System.out.println("------------------------------------");
        System.out.printf("|  %03d  |  %03d  |  %03d  |  %03d  |", 
                vowels, symbols, spaces, other);

    }

}
