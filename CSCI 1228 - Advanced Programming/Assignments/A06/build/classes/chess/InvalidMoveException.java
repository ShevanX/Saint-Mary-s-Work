/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package chess;

/**
 *
 * @author Shevan Nadiranga
 */
public class InvalidMoveException extends ChessException {
    
    
    public InvalidMoveException(String pieceName){
        
        super("A " + pieceName + " cannot move there.");
    }

}
