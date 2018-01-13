/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DynamicProgramming;

/**
 *
 * @author srivemul
 */
/*
* s(i,j) = { A[i][j] + max (s(i,j-1),s(i-1,j)}
 */
public class FindApplesCountInMatrix {

    public static int findApplesCountInMatrix(int[][] arr) {
        int[][] Sarr = new int[arr.length][arr[0].length];
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Sarr[i][j] = arr[i][j];
                if (j > 0 && Sarr[i][j] < arr[i][j] + Sarr[i][j - 1]) {
                    Sarr[i][j] = arr[i][j] + Sarr[i][j - 1];
                }
                if (i > 0 && Sarr[i][j] < arr[i][j] + Sarr[i - 1][j]) {
                    Sarr[i][j] = arr[i][j] + Sarr[i - 1][j];
                }
            }
        }
        printSarray(Sarr);
        return Sarr[m - 1][n - 1];
    }

    private static void printSarray(int[][] Sarr) {
        for (int[] a : Sarr) {
            for (int val : a) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(findApplesCountInMatrix(arr));
    }
}
