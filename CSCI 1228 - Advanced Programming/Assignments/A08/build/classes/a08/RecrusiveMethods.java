/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a08;

import java.util.Scanner;
import util1228.Menu;
import static util1228.Utilities.displayInfo;
import static util1228.Utilities.pause;

/**
 *
 * @author Shevan Nadiranga (A00490556)
 */
public class RecrusiveMethods {

    public static final String NAME = "Nadiranga, Shevan";
    public static final String A_NUMBER = "A00490556";
    private static final Scanner kbd = new Scanner(System.in);

    public static void main(String[] args) {

        //display information header
        displayInfo(NAME, A_NUMBER, "08",
                "This program allows the user to run some recursive "
                + "methods.");
        pause();

        //create menu
        Menu m = createMenu();

        int choice = 0;

        //repeat the menu until the user quits
        do {
            m.display();
            System.out.println("\n");
            choice = m.getChoice();
            switch (choice) {
                case 1:
                    System.out.print("Enter n: ");
                    int n1 = kbd.nextInt();
                    int result1 = numDigitR(n1);
                    System.out.println("The number of digits in n is "
                            + result1 + ".");
                    pause();
                    break;
                case 2:
                    System.out.print("Enter n: ");
                    int n2 = kbd.nextInt();
                    int result2 = productR(n2);
                    System.out.println("The product of the digits in n is "
                            + result2 + ".");
                    pause();
                    break;
                case 3:
                    System.out.print("Enter n: ");
                    int n3 = kbd.nextInt();
                    int result3 = sumSquareR(n3);
                    System.out.println("The sum of the squares of all odd "
                            + "numbers up to n is "
                            + result3 + ".");
                    pause();
                    break;
                case 4:
                    System.out.print("Enter a String: ");
                    String n4 = kbd.nextLine();
                    String result4 = (palindromeR(n4)) ? " is a Palindrome."
                            : " is not a Palindrome.";
                    System.out.println("\"" + n4 + "\"" + result4);
                    pause();
                    break;
                case 5:
                    System.out.println("\nQuitting...");
                    pause();
                    break;
                default:
                    System.out.println("\nInvalid option. Please enter"
                            + " a correction option.");
                    pause();
                    break;
            }

        } while (choice != 5);

    }

    /**
     * This method creates the Menu for the program and adds each of the options
     *
     * @return the created Menu
     */
    private static Menu createMenu() {
        Menu m = new Menu("Menu", 30, 120);
        m.addOption("Find the number of digits in n");
        m.addOption("Find the product of the digits of n");
        m.addOption("Find the sum of the squares of all odd numbers up to n");
        m.addOption("Determine if a string is a palindrome");
        m.addOption("Quit");
        return m;
    }

    /**
     * This method recursively add 1 until the digit is less than 10
     * 
     * @param n an integer with any number of digits
     * 
     * @return call the numDigitR method by adding and eliminating 1 digit per 
     * round
     */
    private static int numDigitR(int n) {

        if (n < 10) {
            return 1;
        }

        return 1 + numDigitR(n / 10);

    }

    /**
     * Recursively calculates the product of all digits in a positive integer.
     * This method uses recursion to multiply the last digit of n 
     * by the product of the remaining digits until a single digit is reached.
     * 
     * @param n a positive integer whose digit product is to be calculated
     * 
     * @return the product of all digits in n
     */
    private static int productR(int n) {

        if (n < 10) {
            return n;
        }

        return (n % 10) * productR(n / 10);

    }

    /**
     * Recursively calculates the sum of the squares of all odd numbers
     * If n is even, it is skipped and the recursion continues 
     * with n - 1.
     * If n is odd, n^2 is added to the sum.
     * 
     * @param n the starting integer (can be odd or even)
     * 
     * @return the sum of the squares of all odd numbers from n to 1
     */
    private static int sumSquareR(int n) {

        if (n <= 0) {
            return 0;
        }

        if (n % 2 != 0) {

            return (n * n) + sumSquareR(n - 1);
        } else {

            return sumSquareR(n - 1);
        }

    }

    /**
     * Recursively determines whether a given string is a palindrome,
     * ignoring spaces and case sensitivity.
     * Before comparison, the string is converted to lowercase and all
     * whitespace is removed.
     * 
     * @param n the string to check
     * 
     * @return true if n is a palindrome; false otherwise.
     */
    private static boolean palindromeR(String n) {

        String word = n.toLowerCase().replaceAll("\\s", "");

        if (word.length() <= 1) {
            return true;
        }

        return word.charAt(0) == word.charAt(word.length() - 1)
                && palindromeR(word.substring(1, word.length() - 1));

    }

}
