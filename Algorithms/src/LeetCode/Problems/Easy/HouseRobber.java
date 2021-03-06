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
ou are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
the only constraint stopping you from robbing each of them is that adjacent houses have security system 
connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount 
of money you can rob tonight without alerting the police.
 */
public class HouseRobber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int rob(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int inc = nums[0], disc = Math.max(nums[0], nums[1]), latestMax = 0;
        for (int i = 2; i < nums.length; i++) {
            latestMax = Math.max(inc + nums[i], disc);
            inc = disc;
            disc = latestMax;
        }
        return latestMax;
    }

    public int rob2(int[] num) {
        int prevNo = 0;
        int prevYes = 0;
        for (int n : num) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = n + temp;
        }
        return Math.max(prevNo, prevYes);
    }

    public int rob3(int[] num) {
        int rob = 0; //max monney can get if rob current house
        int notrob = 0; //max money can get if not rob current house
        for (int i = 0; i < num.length; i++) {
            int currob = notrob + num[i]; //if rob current value, previous house must not be robbed
            notrob = Math.max(notrob, rob); //if not rob ith house, take the max value of robbed (i-1)th house and not rob (i-1)th house
            rob = currob;
        }
        return Math.max(rob, notrob);
    }

    int rob(int num[], int n) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a = Math.max(a + num[i], b);
            } else {
                b = Math.max(a, b + num[i]);
            }
        }

        return Math.max(a, b);
    }

}
