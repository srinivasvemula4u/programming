/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul
 */
/*
Print a given matrix in spiral form
Given a 2D array, print it in spiral form. See the following examples.

Input:
        1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 


Input:
        1   2   3   4  5   6
        7   8   9  10  11  12
        13  14  15 16  17  18
Output: 
1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
spiral-matrix
 */
public class MatrixInSpiralForm {

    /**
     * @param args the command line arguments
     */
    public static void printSpiralForm(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int k = 0, l = 0;
        while (k < m && l < n) {
            for (int i = l; i < n; i++) {
                System.out.print(arr[k][i] + " ");
            }
            k++;
            for (int i = k; i < m; i++) {
                System.out.print(arr[i][n - 1] + " ");
            }
            n--;
          //  if (k < m) {
                for (int i = n - 1; i >= l; i--) {
                    System.out.print(arr[m - 1][i] + " ");
                }
                m--;
          //  }
          //  if (l < n) {
                for (int i = m - 1; i >= k; i--) {
                    System.out.print(arr[i][l] + " ");
                }
                l++;
         //   }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5, 6},
        {7, 8, 9, 10, 11, 12},
        {13, 14, 15, 16, 17, 18}
        };

        printSpiralForm(a);
        // return 0;

    }

}
