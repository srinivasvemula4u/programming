/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DynamicProgramming;

/**
 *
 * @author srivemul
 */
public class MaxSumArray {

    public static int maxContigousSum(int[] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static int maxContigousSumOptmized(int[] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static int dynamicProgramming(int[] arr) {
        int maxSum = arr[0], sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;

    }

    public static int withoutDP(int[] arr) {
        int sumSofar = 0, sumEndingHere = 0;
        for (int i = 0; i < arr.length; i++) {
            sumEndingHere = sumEndingHere + arr[i];
            if (sumEndingHere < 0) {
                sumEndingHere = 0;
                continue;
            }
            if (sumEndingHere > sumSofar) {
                sumSofar = sumEndingHere;
            }
        }
        return sumSofar;
    }

    public static void main(String args[]) {
        // int[] arr = {1,-3,4,-2,-1,6};
        int[] arr = {-2, 11, -4, 13, -5, 2};
        System.out.println(maxContigousSum(arr));
        System.out.println(maxContigousSumOptmized(arr));
        System.out.println(dynamicProgramming(arr));
        System.out.println(withoutDP(arr));
    }
}
