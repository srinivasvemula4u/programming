/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.StringMatchingAlgorithms;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 *
 * @author srivemul
 */
public class ReplaceRegions {
    private static final char TEMPORARY_MARKED = '$';
    private static final char TO_CAPTURE = 'O';
    private static final char CAPTURED = 'X';
    public static void solve(char[][] board) {
        if(board.length == 0)
            return;
       int numberOfRows = board.length;
       int numberOfCols = board[0].length;
       for(int col=0; col < numberOfCols; col++) {
           mark(board,0,col);
           mark(board,numberOfRows-1,col);
       }
       for(int row = 0; row < numberOfRows; row++) {
           mark(board,row,0);
           mark(board,row,numberOfCols-1);
       }
       for(int row = 0; row < numberOfRows; row++) 
           for(int col = 0; col < numberOfCols; col++) {
               board[row][col] =  board[row][col] == TEMPORARY_MARKED ? TO_CAPTURE : CAPTURED;
           }
    }

    private static void mark(char[][] board, int row, int col) {
        int position = row*board[0].length+col;
        //Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(position);
        while(!stack.isEmpty()) {
            position = stack.pop();
            row = position / board[0].length;
            col = position % board[0].length;
            if(board[row][col] != TO_CAPTURE)
                continue;
            board[row][col] = TEMPORARY_MARKED;
            if(row > 0) {
                stack.push((row-1)*(board[0].length)+col);
            }
            if(col > 0) {
                stack.push(row*board[0].length+(col-1));
            }
            if(row < board.length-1)
                stack.push((row+1)*board[0].length+col);
            if(col < board[0].length-1)
                stack.push(row*board[0].length + (col +1));
        }
    }
    public static void main(String args[]) {
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','O','X','X'},{'X','O','X','X'}};
        solve(board);
        for(char[] arr : board) {
            for(char ch : arr) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
