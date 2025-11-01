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
        
        return true;
        
    }
    
    @Override
    public char getSymbol(){
        
        return color ? 'P' : 'p';
        
    }
    
    

}
