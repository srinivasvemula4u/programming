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
public class MaxDiffBetweenTwoElementsLargerElementAfterFirstElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1, 2, 90, 10, 110};
        System.out.printf("Maximum difference is %d\n", maxDiff(arr));
        System.out.printf("Maximum difference is %d\n", maxDiffMethod2(arr));
        System.out.printf("Maximum difference is %d\n", maxDiffMethod3(arr));
        System.out.printf("Maximum difference is %d\n", maxDiffMethod4(arr));
         System.out.printf("Maximum difference is %d\n", maxDiffMethod5(arr));
    }

    private static int maxDiff(int[] arr) {
        int n = arr.length;
        int max_diff = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int diff = arr[j] - arr[i];
                    if (diff > max_diff) {
                        max_diff = diff;
                    }
                }
            }
        }
        return max_diff;

    }

    private static int maxDiffMethod2(int[] arr) {
        int n = arr.length;
        int max_diff = Integer.MIN_VALUE;
        int min_element = arr[0];
        for (int i = 1; i < n; i++) {
            if ((arr[i] - min_element) > max_diff) {
                max_diff = arr[i] - min_element;
            }
            if (arr[i] < min_element) {
                min_element = arr[i];
            }
        }
        return max_diff;
    }

    private static int maxDiffMethod3(int[] arr) {
        int maxDiff = Integer.MIN_VALUE; // Initialize Result
        int n = arr.length;
        int maxRight = arr[n - 1]; // Initialize max element from right side

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
            } else {
                int diff = maxRight - arr[i];
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }
        return maxDiff;
    }

    private static int maxDiffMethod4(int[] arr) {
        // Create a diff array of size n-1. The array will hold
        //  the difference of adjacent elements
        int n = arr.length;
        int[] diff = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            diff[i] = arr[i + 1] - arr[i];
        }

        // Now find the maximum sum subarray in diff array
        int max_diff = diff[0];
        for (int i = 1; i < n - 1; i++) {
            if (diff[i - 1] > 0) {
                diff[i] += diff[i - 1];
            }
            if (max_diff < diff[i]) {
                max_diff = diff[i];
            }
        }
        return max_diff;
    }

    private static int maxDiffMethod5(int[] arr) {
        // Initialize diff, current sum and max sum
        int n = arr.length;
        int diff = arr[1] - arr[0];
        int curr_sum = diff;
        int max_sum = curr_sum;

        for (int i = 1; i < n - 1; i++) {
            // Calculate current diff
            diff = arr[i + 1] - arr[i];

            // Calculate current sum
            if (curr_sum > 0) {
                curr_sum += diff;
            } else {
                curr_sum = diff;
            }

            // Update max sum, if needed
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }

        return max_sum;

    }
}
