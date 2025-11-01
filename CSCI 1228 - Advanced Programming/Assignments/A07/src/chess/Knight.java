/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package chess;

/**
 *
 * @author Shevan Nadiranga
 */
public class Knight extends Piece {
    
    public Knight(Board board, boolean color, int col, int row){
        
        super(board, color, col, row);
    }
    
    @Override
    public boolean isValidMove(int fromCol, int fromRow, int toCol, int toRow){
        
        int colDiff = Math.abs(toCol - fromCol);
        int rowDiff = Math.abs(toRow - fromRow);
        
        if(!((colDiff == 1 && rowDiff == 2)||(colDiff == 2 && rowDiff == 1))){
            
            return false;
        }
        
        Piece dest = board.pieces[toCol][toRow];
        return (dest == null || dest.isWhite() != this.isWhite());
        
         
        
    }
    
    @Override
    public char getSymbol(){
        
        return color ? 'N' : 'n';
        
    }
    

}
