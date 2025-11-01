/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

/**
 *
 * @author Shevan Nadiranga
 */
public class Rook extends Piece {

    public Rook(Board board, boolean color, int col, int row) {

        super(board, color, col, row);
    }

    @Override
    public boolean isValidMove(int fromCol, int fromRow, int toCol, int toRow) {
        
        // Must move in straight line
        if (fromCol != toCol && fromRow != toRow) {
            return false;
        }
        
        // Determine step direction
        int colStep = Integer.compare(toCol, fromCol);
        int rowStep = Integer.compare(toRow, fromRow);

        // Step through the path (excluding destination)
        int currentCol = fromCol + colStep;
        int currentRow = fromRow + rowStep;
        while (currentCol != toCol || currentRow != toRow) {
            if (board.pieces[currentCol][currentRow] != null) {
                return false; // Blocked
            }
            currentCol += colStep;
            currentRow += rowStep;
        }

        // Check destination (empty or enemy)
        Piece dest = board.pieces[toCol][toRow];
        return dest == null || dest.isWhite() != this.isWhite();
    }

    @Override
    public char getSymbol() {

        return color ? 'R' : 'r';

    }

}
