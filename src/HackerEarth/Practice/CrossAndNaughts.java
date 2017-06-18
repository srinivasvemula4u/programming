/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerEarth.Practice;

import java.util.Scanner;

/**
 *
 * @author srivemul
 */
public class CrossAndNaughts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        //  System.out.println(T);
        for (int i = 0; i < T; i++) {
            String name = s.next();
            //  System.out.println(name);
            int N = s.nextInt();
            // System.out.println(N);
            char[][] board = new char[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    board[j][k] = ' ';
                }
            }
            for (int j = 0; j < N*N; j++) {
                int x = s.nextInt();
                int y = s.nextInt();
                if ("Alice".equals(name)) {
                    board[x-1][y-1] = 'A';
                    if (isThereAWinner(board, N)) {
                        System.out.println(name + " wins on move" + (j + 1));
                        printBoard(board, N, j + 1);
                        break;
                    }
                    name = "Bob";
                } else if ("Bob".equals(name)) {
                    board[x-1][y-1] = 'B';
                    if (isThereAWinner(board, N)) {
                        System.out.println(name + " wins on move" + (j + 1));
                        printBoard(board, N, j + 1);
                        break;
                    }
                    name = "Alice";
                }

            }
        }
    }

    private static void printBoard(char[][] board, int N, int count) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isThereAWinner(char[][] board, int N) {

        return completeRows(board, N) || completeCols(board, N) || leftDi(board, N) || rightDi(board, N);
    }

    private static boolean completeRows(char[][] board, int N) {

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if (board[i][j - 1] == '-' || board[i][j] == ' ' || (board[i][j - 1] != board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean completeCols(char[][] board, int N) {
        for (int j = 0; j < N; j++) {
            for (int i = 1; i < N; i++) {
                if (board[i - 1][j] == ' ' || board[i][j] == ' ' || (board[i - 1][j] != board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean leftDi(char[][] board, int N) {
        for (int i = 1, j = 1; i < N && j < N; i++, j++) {
            if (i == j) {
                if (board[i - 1][j - 1] == ' ' || board[i][j] == ' ' || (board[i - 1][j - 1] != board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean rightDi(char[][] board, int N) {
        for (int i = 1, j = N - 2; i < N && j >= 0; i++, j--) {
               if( (i+j) == (N-1)) {
                if (board[i - 1][j + 1] == ' ' || board[i][j] == ' ' || (board[i - 1][j + 1] != board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

}
