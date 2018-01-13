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
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
(ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at 
the same time 
(ie, you must sell the stock before you buy again).
 */
public class BestTimeToBuyAndSellStockII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                total += prices[i + 1] - prices[i];
            }
        }

        return total;
    }

    /*
    Greedy Way: 
    The greedy pair-wise approach mentioned in other posts is great for this problem indeed, 
    but if we're not allowed to buy and sell stocks within the same day it can't be applied (
    logically, of course; the answer will be the same). Actually, the straight-forward way of finding next 
    local minimum and next local maximum is not much more complicated, 
    so, just for the sake of having an alternative I share the code in Java for such case.
     */
    public int maxProfitGreedy(int[] prices) {
        int profit = 0, i = 0;
        while (i < prices.length) {
            // find next local minimum
            while (i < prices.length - 1 && prices[i + 1] <= prices[i]) {
                i++;
            }
            int min = prices[i++]; // need increment to avoid infinite loop for "[1]"
            // find next local maximum
            while (i < prices.length - 1 && prices[i + 1] >= prices[i]) {
                i++;
            }
            profit += i < prices.length ? prices[i++] - min : 0;
        }
        return profit;
    }

}
