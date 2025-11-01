/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05;

import chess.Board;
import java.util.Scanner;
import util1228.Menu;
import static util1228.Utilities.displayInfo;
import static util1228.Utilities.pause;

/**
 * This is a driver program for the first part of a simple chess game.
 *
 * @author Shevan Nadiranga (A00490556)
 *
 */
public class ChessDriver {

    /////////////////////////////////////////////////
    ////////CHANGE TO YOUR INFORMATION//////////////
    public static final String NAME = "Nadiranga, Shevan";
    public static final String A_NUMBER = "A00490556";
    /////////////////////////////////////////////////
    ////////////////////////////////////////////////

    public static void main(String[] args) {

        //display information header
        displayInfo(NAME, A_NUMBER, "05",
                "This program is the first part of a simple chess game.");
        pause();

        //create menu
        Menu m = createMenu();

        //create board
        Board b = new Board();
        int choice;

        //repeat the menu until the user quits
        do {
            m.display();
            choice = m.getChoice();
            switch (choice) {
                case 1:
                    b.display();
                    pause();
                    break;
                case 2:
                    moveOption(b);
                    break;
                case 3:
                    b = new Board();
                    System.out.println("\nBoard has been reset");
                    pause();
                    break;
                case 4:
                    System.out.println("\nQuiting");
                    pause("Press enter to end...");
                    break;
                case -1:
                    System.out.println("\nInvalid Choice");
                    pause();
                    break;
            }
        } while (choice != 4);
    }

    /**
     * This method creates the Menu for the program and adds each of the options
     *
     * @return the created Menu
     */
    private static Menu createMenu() {
        Menu m = new Menu("Chess Menu", 30, 120);
        m.addOption("Display Board");
        m.addOption("Move Piece");
        m.addOption("Reset Board");
        m.addOption("Quit");
        return m;
    }

    /**
     * This method handles the move option in the menu. Displays the board then
     * gets the move from the user and passes it to the board. Finally it
     * displays the updated board.
     *
     * @param b The board that the move will take place on.
     */
    private static void moveOption(Board b) {
        Scanner kbd = new Scanner(System.in);

        b.display();

        //get piece location
        System.out.print("Enter the coordinates of the piece"
                + " you want to move: ");
        int x1 = kbd.nextInt();
        int y1 = kbd.nextInt();
        kbd.nextLine();

        
       //get move location
        System.out.print("Enter the coordinates of the "
                + "location you want to move to: ");
        int x2 = kbd.nextInt();
        int y2 = kbd.nextInt();
        kbd.nextLine();

        b.move(x1, y1, x2, y2);

        b.display();

        pause();

       
    }
    
}
