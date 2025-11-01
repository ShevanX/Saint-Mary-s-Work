/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

/**
 *
 * @author Shevan Nadiranga
 */
public class Bishop extends Piece {

    public Bishop(Board board, boolean color, int col, int row) {

        super(board, color, col, row);
    }

    @Override
    public boolean isValidMove(int fromCol, int fromRow, int toCol, int toRow) {
        
        // Must move diagonally
        if (Math.abs(toCol - fromCol) != Math.abs(toRow - fromRow)) {
            return false;
        }

        // Determine step direction
        int colStep = Integer.compare(toCol, fromCol);
        int rowStep = Integer.compare(toRow, fromRow);

        // Step through the path
        int currentCol = fromCol + colStep;
        int currentRow = fromRow + rowStep;
        while (currentCol != toCol || currentRow != toRow) {
            if (board.pieces[currentCol][currentRow] != null) {
                return false;
            }
            currentCol += colStep;
            currentRow += rowStep;
        }

        // Check destination
        Piece dest = board.pieces[toCol][toRow];
        return dest == null || dest.isWhite() != this.isWhite();
    }

    @Override
    public char getSymbol() {

        return color ? 'B' : 'b';

    }

}
