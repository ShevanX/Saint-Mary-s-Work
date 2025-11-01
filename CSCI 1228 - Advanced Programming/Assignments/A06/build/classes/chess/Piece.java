/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

/**
 *
 * @author Shevan Nadiranga
 */
public abstract class Piece {

    protected boolean color;
    protected boolean hasMoved;

    protected int col;
    protected int row;

    protected Board board;

    public Piece(Board board, boolean color, int col, int row) {

        this.board = board;
        this.color = color;
        this.col = col;
        this.row = row;
        hasMoved = false;
    }

    public void move(int newCol, int newRow) {

        
        //update internal state
        col = newCol;
        row = newRow;
        hasMoved = true;
    }

    public abstract boolean isValidMove(int col, int row);

    public abstract char getSymbol();

    public boolean isWhite() {
        return color;
    }

    public boolean hasMoved() {
        return hasMoved;
    }

    
}
