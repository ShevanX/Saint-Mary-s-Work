/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a07;

import chess.Board;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import static util1228.Utilities.pause;

/**
 *
 * @author Shevan Nadiranga (A00490556)
 */
public class ChessFileDriver {

    public static final String NAME = "Nadiranga, Shevan";
    public static final String A_NUMBER = "A00490556";

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        if (args.length == 0) {

            System.out.println("Assignment 07");
            System.out.println(NAME);
            System.out.println(A_NUMBER);
            System.out.println("\nThis program is the third version of a "
                    + "simple chess game.");
            // INSTRUCTIONS
            System.out.println("\nProgram instructions:");
            System.out.println("1) Run without arguments to display "
                    + "these instructions.");
            System.out.println("2) Provide one text file as an argument to "
                    + "run moves from that file.");
            System.out.println("   Each line in the file should have four"
                    + " integers: fromCol fromRow toCol toRow.");
            System.out.println("3) Provide two arguments: the first is the "
                    + "moves file, the second is the output file.");
            System.out.println("   This will save the output to the file "
                    + "instead of printing to screen.");
            System.out.println("\nPress enter to continue...");

            kbd.nextLine();

        } else if (args.length == 1) {
            handleOneFile(args[0]);
        } else {
            handleTwoFiles(args[0], args[1]);
        }
    }

    private static void handleOneFile(String fileName) {

        try (Scanner in = new Scanner(new File(fileName))) {

            Board b = new Board();
            b.display();
            pause();

            while (in.hasNextInt()) {

                int fromCol = in.nextInt();
                int fromRow = in.nextInt();
                int toCol = in.nextInt();
                int toRow = in.nextInt();

                System.out.printf("\nMove: %d %d to %d %d%n\n",
                        fromCol, fromRow, toCol, toRow);
                System.out.println();

                try {
                    b.move(fromCol, fromRow, toCol, toRow);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                b.display();
                System.out.println();
                
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File %s could not be found%n", fileName);
        }
    }

    private static void handleTwoFiles(String inputFile, String outputFile) {

        try (Scanner in = new Scanner(new File(inputFile)); 
                PrintWriter out = new PrintWriter(new File(outputFile))) {

            Board b = new Board();
            b.display();

            while (in.hasNextInt()) {

                int fromCol = in.nextInt();
                int fromRow = in.nextInt();
                int toCol = in.nextInt();
                int toRow = in.nextInt();

                out.printf("\nMove: %d %d to %d %d%n\n",
                        fromCol, fromRow, toCol, toRow);

                try {
                    b.move(fromCol, fromRow, toCol, toRow);
                } catch (Exception e) {
                    out.println(e.getMessage());
                }
                b.display(out);
            }

        } catch (FileNotFoundException e) {
            System.out.printf("File %s could not be found%n", 
                    inputFile);
            pause();
        }

    }

}
