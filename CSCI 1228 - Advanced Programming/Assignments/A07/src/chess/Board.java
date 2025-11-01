/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import java.io.PrintWriter;

/**
 *
 * @author Shevan Nadiranga
 */
public class Board {

    protected Piece[][] pieces;
    protected boolean isWhiteTurn;

    public Board() {

        pieces = new Piece[8][8];

        for (int col = 0; col < 8; col++) {
            pieces[col][6] = new Pawn(this, true, col, 6);
        }

        for (int col = 0; col < 8; col++) {
            pieces[col][1] = new Pawn(this, false, col, 1);
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
        
        isWhiteTurn = true;
    }

    public void display() {

        display(new PrintWriter(System.out, true));

    }
    
    public void display(PrintWriter out) {

        // Print top column numbers
        out.print("   ");
        for (int col = 1; col <= 8; col++) {
            out.print("  " + col + " ");
        }
        out.println();

        // Print top border line
        out.println("  ---------------------------------");

        // Print rows from 8 down to 1 to match chess notation
        for (int row = 0; row < 8; row++) {
            // Print row number on left side
            out.print((row + 1) + " |");

            // Print each cell in the row
            for (int col = 0; col < 8; col++) {
                Piece piece = pieces[col][row];
                char symbol = ' ';
                if (piece != null) {
                    symbol = piece.getSymbol();
                }
                out.print(" " + symbol + " |");
            }

            // Print row number on right side and newline
            out.println(" ");

            // Print the separator line after every row
            out.println("  ---------------------------------");
        }
        out.flush();

    }

    public void move(int fromCol, int fromRow, int toCol, int toRow) throws
            ChessException {

        //Bounds check for all coordinates
        if (fromCol < 1 || fromCol > 8 || fromRow < 1 || fromRow > 8
                || toCol < 1 || toCol > 8 || toRow < 1 || toRow > 8) {
            throw new OffBoardException();

        }
        
        fromCol--; fromRow--; toCol--; toRow--;

        // Check if there's a piece at from coordinates
        Piece piece = pieces[fromCol][fromRow];
        if (piece == null) {
            throw new NoPieceException("chess.NoPieceException: "
                    + "There is no piece at " + (fromCol+1) +
                    " " + (fromRow+1));
        }

        //Check if it's the correct player's turn
        if (piece.isWhite() != isWhiteTurn) {
            throw new WrongTurnException("It is not " + (piece.isWhite() ?
                    "White" : "Black") + "'s turn to move.");
        }

        //Check is the destination has a same piece of colour
        Piece target = pieces[toCol][toRow];
        if (target != null && target.isWhite() == piece.isWhite()) {
            throw new SelfCaptureException("There is already a " + (isWhiteTurn
                    ? "White" : "Black") + " piece there.");
        }

        //check if move valid for the piece
        if (!piece.isValidMove(fromCol, fromRow, toCol, toRow)) {
            throw new InvalidMoveException(piece.getClass()
                    .getSimpleName());
        }

        //Attempt to move the piece by calling its move method
        piece.move(toCol, toRow);
        pieces[toCol][toRow] = piece;
        pieces[fromCol][fromRow] = null;

        isWhiteTurn = !isWhiteTurn;
    }

    public boolean getIsWhiteTurn() {
        return isWhiteTurn;
    }

}
