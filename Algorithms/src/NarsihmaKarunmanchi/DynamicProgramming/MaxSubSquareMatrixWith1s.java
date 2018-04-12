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
Steps : 
1) Construct a sum matrix L[m][n]  for the given matrix B[m][n];
   a) copy first row and first contains as it is form B[][] to L[][]
   b) For other entries use following expressions to construct L[][]
if(B[i][j]) {   L[i][j] = Math.min(Math.min(L[i-1][j], L[i][j-1]), L[i-1][j-1]) + 1;
}
else 
L[i][j] = 0;
 */
public class MaxSubSquareMatrixWith1s {

    public static int maxSubSquareMatrixWith1s(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] L = new int[m][n];
        for (int i = 0; i < m; i++) {
            L[i][0] = arr[i][0];
        }
        for (int i = 0; i < n; i++) {
            L[0][i] = arr[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 1) {
                    L[i][j] = Math.min(Math.min(L[i - 1][j], L[i][j - 1]), L[i - 1][j - 1]) + 1;
                } else {
                    L[i][j] = 0;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (L[i][j] > max) {
                    max = L[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int[][] arr = {{0, 1, 1, 0, 1}, {1, 1, 0, 1, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {0, 0, 0, 0, 0}};
        System.out.println(maxSubSquareMatrixWith1s(arr));
    }
}
