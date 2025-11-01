/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package chess;

/**
 *
 * @author Shevan Nadiranga
 */
public class NoPieceException extends ChessException {
    
    public NoPieceException(){
        
        super("");
    }
    
    public NoPieceException(String message){
        
        super(message);
    }

}
