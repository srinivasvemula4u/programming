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
public class RotatateArrayBy90Degrees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        rotateArray(arr);
    }

    private static void rotateArray(int[][] arr) {
        //To change body of generated methods, choose Tools | Templates.
        int m = arr.length;
        int n = arr[0].length;
        int[][] dest = new int[n][m];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                dest[c][m - r - 1] = arr[r][c];
            }
        }
        printArray(dest);

    }

    private static void printArray(int[][] dest) {
        for (int[] arr : dest) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
