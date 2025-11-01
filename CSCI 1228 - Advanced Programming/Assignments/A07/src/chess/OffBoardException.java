/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package chess;

/**
 *
 * @author Shevan Nadiranga
 */
public class OffBoardException extends ChessException {
    
    public OffBoardException(){
        
        super("chess.OffBoardException: At least one "
                + "coordinate was invalid");
    }
    
    public OffBoardException(String message){
        
        super(message);
    }

}
