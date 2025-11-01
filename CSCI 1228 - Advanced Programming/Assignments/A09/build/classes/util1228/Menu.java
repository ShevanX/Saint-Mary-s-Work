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
public class Menu {

    //class constants
    public static final int MAX_OPT = 10;

    //instance constants
    public final int HEIGHT;
    public final int WIDTH;

    //instance variables
    private String TITLE;
    private String[] menuOpt;

    private int optionCount = 0;

    /**
     * primary constructor
     *
     * @param title - title of the menu
     * @param height - height of the menu and option
     * @param width - the width of the menu and options
     */
    public Menu(String title, int height, int width) {
        this.TITLE = title;
        this.HEIGHT = height;
        this.WIDTH = width;
        this.menuOpt = new String[MAX_OPT];
    }

    /**
     *
     * @param input the new title
     */
    public void setTitle(String input) {

        TITLE = input;
    }

    /**
     *
     * @param opt the new option
     */
    public void addOption(String opt) {

        //checks if the option in range of 0 to max options
        if (optionCount < MAX_OPT) {
            menuOpt[optionCount] = opt;
            optionCount++;
        } else {
            System.out.println("Cannot add more options. Maximum limit of "
                    + MAX_OPT + " reached");

        }

    }

    /**
     *
     * displays the menu and options centered and alligned
     */
    public void display() {

        int totallines = optionCount + 2;
        int vertical = (HEIGHT - totallines) / 2;

        // vertical centering
        int maxLength = 0;
        for (int i = 0; i < optionCount; i++) {
            String optionLine = (i + 1) + ". " + menuOpt[i];
            if (optionLine.length() > maxLength) {
                maxLength = optionLine.length();
            }
        }

        // title centered
        System.out.println(centerText(TITLE));
        System.out.println();

        // aligned options (number left-aligned with fixed indent)
        int indent = (WIDTH / 2) - 30;
        String spacer = " ".repeat(Math.max(0, indent));

        for (int i = 0; i < optionCount; i++) {
            String optionLine = (i + 1) + ". " + menuOpt[i];
            System.out.println(spacer + optionLine);
        }
    }

    /**
     *
     * @param text - the text sent by the display method
     * @return
     */
    private String centerText(String text) {

        int padding = (WIDTH - text.length()) / 2;
        return " ".repeat(Math.max(0, padding)) + text;
    }

    /**
     *
     * @return the choice the user enteres
     */
    public int getChoice() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String choice = kbd.nextLine();

        // Check if input is all digits (valid integer)
        for (int i = 0; i < choice.length(); i++) {
            if (!Character.isDigit(choice.charAt(i))) {
                return -1;
            }
        }

        if (choice.isEmpty()) {
            return -1;
        }

        int input = Integer.parseInt(choice);
        if (input >= 1 && input <= optionCount) {
            return input;
        } else {
            return -1;
        }

    }

}
