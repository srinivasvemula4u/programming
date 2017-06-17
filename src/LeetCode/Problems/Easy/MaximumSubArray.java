/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems.Easy;

/**
 *
 * @author srivemul
 */
public class MaximumSubArray {

    /**
     * @param args the command line arguments
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int maxSoFar = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {

            maxSoFar = Math.max(maxSoFar + nums[i], nums[i]);
            if (maxSum < maxSoFar) {
                maxSum = maxSoFar;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
