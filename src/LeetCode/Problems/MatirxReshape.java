/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

/**
 *
 * @author srivemul
 */
/*
In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with 
different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing 
the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing 
order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, 
output the original matrix.

Example 1:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, 
fill it row by row by using the previous list.
Example 2:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
Output: 
[[1,2],
 [3,4]]
Explanation:
There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
*/
public class MatirxReshape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] arr = {{1,2},{3,4}};
         arr = matrixReshape(arr, 4, 1);
         for(int[] a : arr) {
             for(int val : a)
                 System.out.print(val + " ");
             System.out.println();
         } 
       
    }
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if( (row*col) != (r *c)) {
           return nums;
        }
        int[][] newNums = new int[r][c];
        int newRow =0, newCol=0;
        for(int i=0; i < row; i++) {
            for(int j =0; j < col; j++) {
                if(newCol < c) {
                    newNums[newRow][newCol] = nums[i][j];
                    newCol++;
                } else {
                   newRow++;
                    newCol =  0;
                     newNums[newRow][newCol] = nums[i][j];
                     newCol++;
                }
            }
        }
        return newNums;
    }
    
}
