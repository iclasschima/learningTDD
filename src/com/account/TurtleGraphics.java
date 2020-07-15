package com.account;
import java.util.Arrays;

public class TurtleGraphics {

    private String [][] board = new String [20][20];
    private int[] position = {0, 0};

    // Where up is false, and down is true
    private boolean pen;

    // Constructor initializes the position of the turtle
    // and sets the pen to up (false)
    TurtleGraphics() {
        pen = false;
        for (int row = 0; row < board.length; row++)
            Arrays.fill(board[row], " ");
    }

    public void displayBoard() {
        for (String row[] : board) {
            for(int col = 0; col < row.length; col++) {
                System.out.print(row[col] + " ");
            }
            System.out.println();
        }
    }

    public void setPenDown() {
        pen = true;
    }

    public void setPenUp() {
        pen = false;
    }

    public void turnRight() {
        board[position[0]][position[1]] = "*";
        position[0] += 1;
    }

    public void turnLeft() {
        board[position[0]][position[1]] = "*";
        position[0] -= 1;
    }

    public void move(int spaces) {
        for (int space = 1; space <= spaces; space++) {
            board[position[0]][position[1]] = "*";
            position[1]++;
        }
    }

    public int[] getPosition() {
        for (int index : position) System.out.print(index + " ");
        return position;
    }

}
