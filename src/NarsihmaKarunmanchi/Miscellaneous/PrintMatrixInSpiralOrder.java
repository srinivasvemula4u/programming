/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Miscellaneous;

/**
 *
 * @author sv186040
 */
public class PrintMatrixInSpiralOrder {

    public static void spiralOrder(int[][] matrix) {
        int rowStart = 0, colStart = 0, rowEnd = matrix.length - 1,
                colEnd = matrix[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            int i = rowStart, j = colStart;
            for (; j <= colEnd; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            rowStart++;
            for (i = rowStart,j--; i <= rowEnd; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            colEnd--;
            for (j = colEnd, i--; j >= colStart + 1; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            rowEnd--;
            for (i = rowEnd,j++; i >= rowStart + 1; i--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
         int[][] arr = { {1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
         spiralOrder(arr);
    }
}
