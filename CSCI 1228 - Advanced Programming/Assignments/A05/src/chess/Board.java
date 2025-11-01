/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

/**
 *
 * @author Shevan Nadiranga
 */
public class Board {

    protected Piece[][] pieces;

    public Board() {

        pieces = new Piece[8][8];

        for (int col = 0; col < 8; col++) {
            pieces[col][6] = new Pawn(this, true, col, 1);
        }

        for (int col = 0; col < 8; col++) {
            pieces[col][1] = new Pawn(this, false, col, 6);
        }

        // Place white back row pieces
        pieces[0][7] = new Rook(this, true, 0, 0);
        pieces[1][7] = new Knight(this, true, 1, 0);
        pieces[2][7] = new Bishop(this, true, 2, 0);
        pieces[3][7] = new Queen(this, true, 3, 0);
        pieces[4][7] = new King(this, true, 4, 0);
        pieces[5][7] = new Bishop(this, true, 5, 0);
        pieces[6][7] = new Knight(this, true, 6, 0);
        pieces[7][7] = new Rook(this, true, 7, 0);

        // Place black back row pieces
        pieces[0][0] = new Rook(this, false, 0, 7);
        pieces[1][0] = new Knight(this, false, 1, 7);
        pieces[2][0] = new Bishop(this, false, 2, 7);
        pieces[3][0] = new Queen(this, false, 3, 7);
        pieces[4][0] = new King(this, false, 4, 7);
        pieces[5][0] = new Bishop(this, false, 5, 7);
        pieces[6][0] = new Knight(this, false, 6, 7);
        pieces[7][0] = new Rook(this, false, 7, 7);
    }

    public void display() {

        // Print top column numbers
        System.out.print("   ");
        for (int col = 1; col <= 8; col++) {
            System.out.print("  " + col + " ");
        }
        System.out.println();

        // Print top border line
        System.out.println("  ---------------------------------");

        // Print rows from 8 down to 1 to match chess notation
        for (int row = 0; row < 8; row++) {
            // Print row number on left side
            System.out.print((row + 1) + " |");

            // Print each cell in the row
            for (int col = 0; col < 8; col++) {
                Piece piece = pieces[col][row];
                char symbol = ' ';
                if (piece != null) {
                    symbol = piece.getSymbol();
                }
                System.out.print(" " + symbol + " |");
            }

            // Print row number on right side and newline
            System.out.println(" ");

            // Print the separator line after every row
            System.out.println("  ---------------------------------");
        }

    }

    public void move(int fromCol, int fromRow, int toCol, int toRow) {

        // 1. Bounds check for all coordinates
        if (fromCol < 1 || fromCol > 8 || fromRow < 1 || fromRow > 8
                || toCol < 1 || toCol > 8 || toRow < 1 || toRow > 8) {
            System.out.println("Error: coordinates out of bounds");
            return;
        }

        // 2. Check if there's a piece at from coordinates
        Piece piece = pieces[fromCol - 1][fromRow - 1];
        if (piece == null) {
            System.out.println("Error: no piece at the source location");
            return;
        }

        // 3. Attempt to move the piece by calling its move method
   
        piece.move(toCol - 1, toRow - 1);
        
        // 4. Update the board state
        pieces[toCol - 1][toRow - 1] = piece;
        pieces[fromCol - 1][fromRow - 1] = null;
    }
}
