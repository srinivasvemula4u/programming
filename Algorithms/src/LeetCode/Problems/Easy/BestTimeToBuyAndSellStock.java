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
May you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimeToBuyAndSellStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int maxProfit(int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }
        int min_val = prices[0];
        int max_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min_val) {
                min_val = prices[i];
            } else if (max_profit < (prices[i] - min_val)) {
                max_profit = (prices[i] - min_val);
            }

        }
        return max_profit;
    }
    /*
    Kadane's Algorithm - Since no one has mentioned about this so far :) (In case if interviewer twists the input)
The logic to solve this problem is same as "max subarray problem" using Kadane's Algorithm. 
    Since no body has mentioned this so far, I thought it's a good thing for everybody to know.

All the straight forward solution should work, but if the interviewer twists the question slightly 
    by giving the difference array of prices, Ex: for {1, 7, 4, 11}, if he gives {0, 6, -3, 7}, you might end up being confused.

Here, the logic is to calculate the difference (maxCur += prices[i] - prices[i-1]) of the original array, 
    and find a contiguous subarray giving maximum profit. If the difference falls below 0, reset it to zero.

    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
*maxCur = current maximum value

*maxSoFar = maximum value found so far
     */

}
