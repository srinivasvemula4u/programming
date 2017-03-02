/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

/**
 *
 * @author srivemul
 */
public class TwoElementsWhoseSumCloseToZero {

    /**
     * @param args the command line arguments
     */
    private static void minAbsPairSum(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        int min_sum = Integer.MAX_VALUE;
        int min_left = -1, min_right = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(min_sum) > Math.abs(sum)) {
                    min_sum = sum;
                    min_left = i;
                    min_right = j;
                }
            }
        }
        System.out.println(arr[min_left] + " " + arr[min_right]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};
        minAbsPairSum(arr);
    }

}
