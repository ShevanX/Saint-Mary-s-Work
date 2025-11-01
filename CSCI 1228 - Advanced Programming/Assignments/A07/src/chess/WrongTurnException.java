/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package chess;

/**
 *
 * @author Shevan Nadiranga
 */
public class WrongTurnException extends ChessException {
    
    public WrongTurnException(){
        
        super("Not your turn.");
    }
    
    public WrongTurnException(String message){
        
        super(message);
    }
    
    

}
