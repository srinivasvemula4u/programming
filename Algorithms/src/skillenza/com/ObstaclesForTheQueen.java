/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skillenza.com;

/**
 *
 * @author sv186040
 *
 * Obstacles for the Queen Obstacles for the Queen A queen in the game of chess
 * is the most powerful piece as it can move horizontally, vertically and
 * diagonally with no limit on the number of squares. You are given an _nXn_
 * chess board and a position where the queen is placed as (r,c) where r
 * represents the row number of the square and c represents the column number of
 * the square. Rows are numbers from 1 to n starting from bottom and columns are
 * numbered from 1 to n starting from left. So the bottome left square is (1,1).
 * Find the number of places where an obstacle can be placed such that the
 * number of moves of the queen remain the same as before.
 *
 * Input Format
 *
 * The input contains:
 *
 * The first line contains t test cases.
 *
 * The next t lines contains
 *
 * n, which is the size of the chessboard, followed by a space and then (r,c)
 * which gives the position of the queen Output Format
 *
 * The output contains t lines each of which contain the number of squares where
 * the obstacle can be placed.
 *
 * Constraints
 *
 * 1 <= t <= 10000
 *
 * 4 <= n <= 10000
 *
 * Sample Input
 *
 * 2
 * 4 (1,1) 5 (3,4) Sample Output
 *
 * 7
 * 11 Explanation
 *
 * For the 1st test case, total number of squares on the board are 16 and
 * placing the queen at (1,1) allows 9 moves.Therefore, the obstacle can be
 * placed in 7 squares.
 *
 * For the 2nd test case, total number of squares on the board are 25 and
 * placing the queen at (3,4) allows 14 moves. Therefore, the obstacle can be
 * placed in 11 squares. SAMPLE STDIN 1  2 4 (1,1) 5 (3,4) SAMPLE STDOUT 1  7
 * 11
 */
import java.util.*;

public class ObstaclesForTheQueen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scan.nextInt();
            String str = scan.next();
            String[] split = str.split(",");
            int r = Integer.parseInt(split[0].substring(1));
            int c = Integer.parseInt(split[1].substring(0, split[1].length() - 1));
            int totalQueenMoves = findTotalMoves(n, r, c);
            System.out.println((n * n) - totalQueenMoves);
        }
    }

    private static int findTotalMoves(int n, int r, int c) {
        int count = 0;
        if ((r == 1) && (c == 1)) {
            // Horizontal moves
            count = 3 * (n - 1);
        } else {
            count = (r - 1) + (n - r) + (c - 1) + (n - c);
            for (int i = r + 1, j = c + 1; i <= n && j <= n; i++, j++) {
                count++;
            }
            for (int i = r - 1, j = c - 1; i >= 1 & j >= 1; i--, j--) {
                count++;
            }
            for (int i = r + 1, j = c - 1; i <= n && j >= 1; i++, j--) {
                count++;
            }
            for (int i = r - 1, j = c + 1; i >= 1 && j <= n; i--, j++) {
                count++;
            }
        }
        return count;
    }
}
