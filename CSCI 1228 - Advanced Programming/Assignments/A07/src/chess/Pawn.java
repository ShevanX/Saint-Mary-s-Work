/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

/**
 *
 * @author Shevan Nadiranga
 */
public class Pawn extends Piece {

    public Pawn(Board board, boolean color, int col, int row) {

        super(board, color, col, row);
    }

    @Override
    public boolean isValidMove(int fromCol, int fromRow, int toCol, int toRow) {

        int direction = color ? -1 : 1; // White moves up, Black down

        // Forward move (1 square)
        if (toCol == fromCol && toRow == fromRow + direction && 
                board.pieces[toCol][toRow] == null) {
            return true;
        }

        // Forward move (2 squares) on first move
        if (!hasMoved && toCol == fromCol && toRow == fromRow + 2 * direction){
            int intermediate = fromRow + direction;
            if (board.pieces[toCol][intermediate] == null && 
                    board.pieces[toCol][toRow] == null) {
                return true;
            }
        }

        // Capture diagonally
        if (Math.abs(toCol - fromCol) == 1 && toRow == fromRow + direction) {
            Piece dest = board.pieces[toCol][toRow];
            if (dest != null && dest.isWhite() != this.isWhite()) {
                return true;
            }
        }

        return false;

    }

    @Override
    public char getSymbol() {

        return color ? 'P' : 'p';

    }

}
