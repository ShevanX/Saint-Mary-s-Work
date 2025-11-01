/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package chess;

/**
 *
 * @author Shevan Nadiranga
 */
public class SelfCaptureException extends ChessException {
    
    public SelfCaptureException(){
        
        super("Cannot capture your own piece.");
    }
    
    public SelfCaptureException(String message){
        
        super(message);
    }

}
