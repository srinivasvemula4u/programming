/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Searching;

import java.util.Arrays;

/**
 *
 * @author srivemul
 */
public class TwoElementsWithMinSum {

    public static void twoElementsWithMinSum(int[] arr) {
        int min_i = 0;
        int min_j = 1;
        int min_sum = arr[0] + arr[1];
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(min_sum)) {
                    min_i = i;
                    min_j = j;
                    min_sum = sum;
                }
            }
        }
        System.out.println("The two elements are " + arr[min_i] + " and " + arr[min_j]);
    }

    public static void twoElementsWithMinSumOptimized(int[] arr) {
        Arrays.sort(arr);
        int posmin_i = Integer.MIN_VALUE;
        int negmin_i = Integer.MIN_VALUE;
        int positiveClosest = Integer.MAX_VALUE;
        int posmin_j = Integer.MAX_VALUE;
        int negmin_j = Integer.MAX_VALUE;
        int negativeClosest = Integer.MIN_VALUE;
        for (int i = 0, j = arr.length - 1; i < j;) {
            int temp = arr[i] + arr[j];
            if (temp > 0) {
                if (temp < positiveClosest) {
                    positiveClosest = temp;
                    posmin_j = j;
                    posmin_i = i;
                }
                j--;
            } else if (temp < 0) {
                if (temp > negativeClosest) {
                    negativeClosest = temp;
                    negmin_i = i;
                    negmin_j = j;
                }
                i++;
            } else {
                System.out.println("The two elements are" + arr[i] + " " + arr[j]);
                return;
            }

        }
        int result_i = Math.abs(negativeClosest) > positiveClosest ? posmin_i : negmin_i;
        int result_j = Math.abs(negativeClosest) > positiveClosest ? posmin_j : negmin_j;
        System.out.println("The two elements are" + arr[result_i] + " " + arr[result_j]);
    }

    public static void main(String args[]) {
        int[] Arr = {1, 60, -10, 70, -80, 85};
        // twoSumK(Arr,6);
        //  twoSumKOptimized(Arr,20);
        //sumOfTwoSquaredElementsEqualToAnotherSqauredElementInArray(Arr);
        //twoElementsWithMinSum(Arr);
        twoElementsWithMinSumOptimized(Arr);
        // System.out.println(findOddNumberOfOccuringElementInArray(Arr)+" !!");
        //System.out.println(6 & ~5);
    }
}
