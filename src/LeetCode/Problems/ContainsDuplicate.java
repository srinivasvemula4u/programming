/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author srivemul
 */
/*
Given an array of integers, find if the array contains any duplicates. Your function should return 
true if any value appears at least twice in the array, 
and it should return false if every element is distinct.
 */
public class ContainsDuplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

}
