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
