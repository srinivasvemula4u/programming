/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author srivemul Given an array of integers, return indices of the two
 * numbers such that they add up to a specific target. You may assume that each
 * input would have exactly one solution, and you may not use the same element
 * twice. Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2
 * + 7 = 9, return [0, 1].
 *
 *
 */
public class TwoSum {

    /**
     * @param args the command line arguments
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
