package Interviews.GoldmanSachsInterview;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sv186040
 * Not working as Expected
 */
import java.util.*;

public class Truckerprofit {

    static int[] findTruckCargo(int maxCargoWeight, int[][] cargoList) {

        //static int max(int a, int b) { return (a > b)? a : b; }
        int[] weights = new int[cargoList.length];
        int[] profits = new int[cargoList.length];
        for (int i = 0; i < cargoList.length; i++) {
            weights[i] = cargoList[i][1];
            profits[i] = cargoList[i][2];
        }
        int n = cargoList.length;
        List<Integer> list = new java.util.ArrayList<>();
        int maxProfit = findMaxProfitCargoNum(maxCargoWeight, weights, profits, n, list);
        int[] res = new int[list.size() + 1];
        int i;
        int index = 0;
        for (i = 0; i < list.size(); i++) {
            res[i] = cargoList[list.get(i)][0];
            //  i++;
            // index++;
        }
        //res[i] = list.get(i);
        res[i] = maxProfit;
        return res;
    }

    private static int findMaxProfitCargoNum(int W, int[] wt, int[] val, int n, List<Integer> list) {
        // Base Case
        if (n == 0 || W == 0) {
            return 0;
        }

        // If weight of the nth item is more than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (wt[n - 1] > W) {
            return findMaxProfitCargoNum(W, wt, val, n - 1, list);
        }

        // Return the maximum of two cases: 
        // (1) nth item included 
        // (2) not included
        int val1 = val[n - 1] + findMaxProfitCargoNum(W - wt[n - 1], wt, val, n - 1, list);
        int val2 = findMaxProfitCargoNum(W, wt, val, n - 1, list);
        if (val1 > val2) {
            //list.clear();
            //list.add(n-2);
            if (!list.contains(n - 1)) {
                list.add(n - 1);
            }
            return val1;
        } else {
            list.remove(n);
            //list.add(n-3);
            //list.add(n-1);
            return val2;
        }
        //return val1;
    }

    public static void main(String[] agrs) {
        int[] res = findTruckCargo(300, new int[][]{{38, 130, 500}, {21, 280, 1800}, {13, 120, 1500}});
        for (int i : res) {
            System.out.println(i);
        }
    }
}
