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
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the 
non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
public class MoveZeroes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static void moveZeroes(int[] nums) {
        int currentIndex = 0, zeroIndex = -1;
        while (currentIndex < nums.length) {
            if (nums[currentIndex] == 0) {
                if (zeroIndex == -1) {
                    zeroIndex = currentIndex;
                }

            } else if (zeroIndex != -1) {
                int temp = nums[zeroIndex];
                nums[zeroIndex] = nums[currentIndex];
                nums[currentIndex] = temp;
                if (nums[zeroIndex + 1] == 0) {
                    zeroIndex++;
                } else {
                    zeroIndex = -1;
                }
            }
            currentIndex++;
        }
    }

}
