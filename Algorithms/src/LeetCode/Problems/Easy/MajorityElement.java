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
/*
Given an array of size n, find the majority element. The majority element is the element that 
appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int majorityElement(int[] nums) {
        int length = nums.length;
        int major_index = 0;
        int count = 1;
        for (int i = 1; i < length; i++) {
            if (nums[major_index] == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                major_index = i;
                count = 1;
            }

        }
        return nums[major_index];
    }

}
