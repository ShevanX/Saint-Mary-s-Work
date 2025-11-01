/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import java.io.Serializable;

/**
 *
 * @author Shevan Nadiranga
 */
public abstract class Piece implements Serializable{

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

        //bounds check
        if (newCol < 0 || newCol > 7 || newRow < 0 || newRow > 7) {
            System.out.println("Error: destination out of bounds");
            return;
        }

        //validate move
        if (!isValidMove(newCol, newRow)) {
            System.out.println("Error: invalid move for this piece");
            return;
        }

        //move: clear old spot and place this piece
        board.pieces[col][row] = null;
        board.pieces[newCol][newRow] = this;

        //update internal state
        col = newCol;
        row = newRow;
        hasMoved = true;
    }

    public abstract boolean isValidMove(int col, int row);

    public abstract char getSymbol();

}
