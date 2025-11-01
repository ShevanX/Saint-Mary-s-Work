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
    
    public Pawn(Board board, boolean color, int col, int row){
        
        super(board, color, col, row);
    }
    @Override
    public boolean isValidMove(int newCol, int newRow){
        
        int direction = color ? -1 : 1;
        
        if(newCol == col){
            if(newRow == row + direction && 
                    board.pieces[newCol][newRow] == null){
                
                return true;
            }
            
            if(!hasMoved && newRow == row + 2 * direction){
                int intermediate = row + direction;
                if(board.pieces[newCol][intermediate] == null &&
                        board.pieces[newCol][newRow] == null){
                    
                    return true;
                    
                }
            }
        }
        
        return false;
        
    }
    
    @Override
    public char getSymbol(){
        
        return color ? 'P' : 'p';
        
    }
    
    

}
